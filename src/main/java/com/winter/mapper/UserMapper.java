package com.winter.mapper;


import com.winter.model.User;

import java.util.List;

public interface UserMapper {
   List<User> selectAllUser();
   User selectSetUser();
}