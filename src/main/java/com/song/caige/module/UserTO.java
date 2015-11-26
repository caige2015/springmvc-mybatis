package com.song.caige.module;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;
@Alias("UserTO")
public class UserTO implements Serializable{

    /**
     * @author song
     */
    private static final long serialVersionUID=1L;
    
    private Integer id;
    
    private String name;
    
    private String password;
    
    private String age;
    
    private String birthday;
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id=id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name=name;
    }
    
    public String getAge() {
        return age;
    }
    
    public void setAge(String age) {
        this.age=age;
    }

    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password=password;
    }
    
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday=birthday;
    }
    
}
