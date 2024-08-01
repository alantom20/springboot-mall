package com.chenhao.springbootmall.service;

import com.chenhao.springbootmall.dto.UserRegisterRequest;
import com.chenhao.springbootmall.model.User;

public interface UserService {
    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);
}
