package com.zxj.dao;

import com.zxj.pojo.User;

public interface UserMapper {

//    1、增加添加用户

    int addUser(User user);

//    2、修改用户

    int updateUserById(User user);

    //    3、查询用户
    User queryUserById(int userId);



}
