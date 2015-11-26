package com.song.caige.service;

import com.song.caige.module.UserTO;

public interface UserService {

    UserTO getUserById(Integer id);
    
    int addUsers(UserTO userTO);
    
    UserTO loginByName(UserTO userTO);
    
    UserTO checkNameIsHave(String name);
}
