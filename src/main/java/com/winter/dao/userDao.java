package com.winter.dao;


import com.winter.pojo.user;

import java.util.List;

public interface userDao {
   List<user> selectAllUser();
   user selectSetUser();
}