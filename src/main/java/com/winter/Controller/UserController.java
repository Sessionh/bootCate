package com.winter.Controller;

import com.winter.pojo.User;
import com.winter.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
public class UserController {

    @Resource
    private UserService userService;


    @RequestMapping("/api/home")
    @ResponseBody
//    @CrossOrigin("http://192.168.10.5:8082")
    public List<User> getListUser(){
        return userService.findAllUser(1,10);
    }


}
