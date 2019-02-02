package com.winter.Base;

import com.winter.dao.UserMapper;
import com.winter.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class UserMapperTest {

    @Resource
    private UserMapper um;

    @Test
    public void  getListUser(){
       List<User> list =  um.selectAllUser();
       System.err.print(list.get(0).toString());
    }

    @Test
    public void getSetUser() {
        User user = um.selectSetUser();
        System.out.print(user.toString());
    }
}
