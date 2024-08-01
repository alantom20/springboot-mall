package com.chenhao.springbootmall.dao;

import com.chenhao.springbootmall.dto.UserRegisterRequest;
import com.chenhao.springbootmall.model.User;

public interface UserDao {
    Integer createUser(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);
}
