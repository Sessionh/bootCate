package com.winter.ServiceTest;

import com.winter.pojo.User;
import com.winter.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/12/28.
 */
@RunWith(SpringRunner.class)
@SpringBootTest()
public class UserServiceTest{

    @Resource
    private UserService us;
    @Test
    public void getListUser(){
       List<User> list =  us.findAllUser(1,10);
       System.err.print(list.get(0).toString());
    }

    @Test
    public void getDemos() {
        System.out.print("11111");
    }
}
