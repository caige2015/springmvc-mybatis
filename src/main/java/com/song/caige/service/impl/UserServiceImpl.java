package com.song.caige.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.song.caige.dao.UserDao;
import com.song.caige.module.UserTO;
import com.song.caige.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;
    
    @Override
    public UserTO getUserById(Integer id) {
        UserTO userTO = userDao.getUserById(id);
        if(userTO != null){
            return userTO;
        }
        return null;
    }

    @Override
    public int addUsers(UserTO userTO) {
        int result = userDao.addUsers(userTO);
        if(result > 0){
            return result;
        }
        return 0;
    }

    @Override
    public UserTO loginByName(UserTO userTO) {
        UserTO ut = userDao.loginByName(userTO);
        if(ut != null){
            return ut;
        }
        return null;
    }

    @Override
    public UserTO checkNameIsHave(String name) {
        UserTO ut = userDao.checkNameIsHave(name);
        if(ut != null){
            return ut;
        }
        return null;
    }

}
