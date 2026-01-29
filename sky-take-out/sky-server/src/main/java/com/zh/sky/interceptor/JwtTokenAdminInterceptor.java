package com.zh.sky.interceptor;


import com.zh.sky.constant.JwtClaimsConstant;
import com.zh.sky.context.BaseContext;
import com.zh.sky.properties.JwtProperties;
import com.zh.sky.utils.JwtUtil;
import io.jsonwebtoken.Claims;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/1/29 10:23
 */
@Component
@Slf4j
public class JwtTokenAdminInterceptor implements HandlerInterceptor {

    @Autowired
    private JwtProperties jwtProperties;

    /**
     * 校验jwt
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {

        //判断当前拦截到的是Controller的方法还是其他资源
        if(!(handler instanceof HandlerMethod)){
            //当前拦截到的不是动态方法，直接放行
            System.out.println("handle: "+handler);
            return true;
        }

        //1、从请求头中获取令牌 jwtProperties.getAdminTokenName()获取为token
        String token = request.getHeader(jwtProperties.getAdminTokenName());

        //2、校验令牌
        try{
            log.info("jwt token:{}", token);
            Claims claims = JwtUtil.parseJWT(jwtProperties.getAdminSecretKey(), token);
            Long empId = Long.valueOf(claims.get(JwtClaimsConstant.EMP_ID).toString());

            log.info("currentID: "+empId);
            /////将用户id存储到ThreadLocal////////
            BaseContext.setCurrentId(empId);
            //3、通过，放行
            return true;
        }catch(Exception e){
            //4、不通过，响应401状态码
            response.setStatus(401);
            return false;
        }
    }
}
