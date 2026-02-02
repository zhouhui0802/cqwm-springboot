package com.zh.sky.controller.user;


import com.zh.sky.constant.JwtClaimsConstant;
import com.zh.sky.dto.UserLoginDTO;
import com.zh.sky.entity.User;
import com.zh.sky.properties.JwtProperties;
import com.zh.sky.result.Result;
import com.zh.sky.service.UserService;
import com.zh.sky.utils.JwtUtil;
import com.zh.sky.vo.UserLoginVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/2/2 9:36
 */
@RestController
@RequestMapping("/user/user")
@Api(tags = "Client端相关接口")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private JwtProperties jwtProperties;

    /**
     * 微信登录
     * @param userLoginDTO
     * @return
     */
    @PostMapping("/login")
    @ApiOperation("微信登录")
    public Result<UserLoginVO> login(@RequestBody UserLoginDTO userLoginDTO){

        log.info("we chat login: {}",userLoginDTO.getCode());

        //微信登录
        User user = userService.wxLogin(userLoginDTO); //后绪步骤实现

        //为微信用户生成jwt令牌
        Map<String,Object> claims = new HashMap<>();
        claims.put(JwtClaimsConstant.USER_ID,user.getId());
        String token = JwtUtil.createJWT(jwtProperties.getUserSecretKey(),jwtProperties.getUserTtl(), claims);
        UserLoginVO userLoginVO = UserLoginVO.builder()
                .id(user.getId())
                .openid(user.getOpenid())
                .token(token)
                .build();
        return Result.success(userLoginVO);
    }
}
