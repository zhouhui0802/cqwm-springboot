package com.zh.sky.service;

import com.zh.sky.dto.UserLoginDTO;
import com.zh.sky.entity.User;

public interface UserService {
    /**
     * 微信登录
     * @param userLoginDTO
     * @return
     */
    User wxLogin(UserLoginDTO userLoginDTO);
}
