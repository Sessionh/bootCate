package com.winter.service;

import com.winter.model.User;
import java.util.List;


public interface UserService {


    List<User> findAllUser(int pageNum, int pageSize);
}
