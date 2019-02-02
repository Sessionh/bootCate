package com.winter.dao;


import com.winter.pojo.User;

import java.util.List;

public interface UserDao {
   List<User> selectAllUser();
   User selectSetUser();
}