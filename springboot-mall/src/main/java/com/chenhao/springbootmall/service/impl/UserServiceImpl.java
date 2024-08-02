package com.chenhao.springbootmall.service.impl;

import com.chenhao.springbootmall.dao.UserDao;
import com.chenhao.springbootmall.dto.UserLoginRequest;
import com.chenhao.springbootmall.dto.UserRegisterRequest;
import com.chenhao.springbootmall.model.User;
import com.chenhao.springbootmall.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

@Component
public class UserServiceImpl implements UserService {
    private final static Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Override
    public User login(UserLoginRequest userLoginRequest) {
        //檢查註冊的email
        User user =  userDao.getUserByEmail(userLoginRequest.getEmail());

        if(user == null) {
            log.warn("該 email {} 未被註冊",userLoginRequest.getEmail());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        if (user.getPassword().equals(userLoginRequest.getPassword())) {
            return user;
        } else {
            log.warn("email {} 的密碼不正確",userLoginRequest.getPassword());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        //檢查註冊的email
        User user =  userDao.getUserByEmail(userRegisterRequest.getEmail());
        if(user != null) {
            log.warn("該email {} 已被註冊",userRegisterRequest.getEmail());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        //創建帳號
        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }
}
