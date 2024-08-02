package com.chenhao.springbootmall.service;

import com.chenhao.springbootmall.dto.UserLoginRequest;
import com.chenhao.springbootmall.dto.UserRegisterRequest;
import com.chenhao.springbootmall.model.User;

public interface UserService {
    User login(UserLoginRequest userLoginRequest);

    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);
}
