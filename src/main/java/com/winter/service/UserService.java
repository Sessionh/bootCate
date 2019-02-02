package com.winter.service;

import com.winter.pojo.user;

import java.util.List;


public interface UserService {


    List<user> findAllUser(int pageNum, int pageSize);
}
