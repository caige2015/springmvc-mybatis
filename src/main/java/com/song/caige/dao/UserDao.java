package com.song.caige.dao;

import com.song.caige.module.UserTO;


public interface UserDao {

    UserTO getUserById(Integer id);
    
    int addUsers(UserTO userTO);
    
    UserTO loginByName(UserTO userTO);
    
    UserTO checkNameIsHave(String name);
}
