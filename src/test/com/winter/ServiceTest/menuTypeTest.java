package com.winter.ServiceTest;

import com.winter.dao.MenuTypeDao;
import com.winter.pojo.MenuType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class menuTypeTest {
    @Resource
    private MenuTypeDao mt;

    @Test
    public void getListMenuType() {
        List<MenuType> list =  mt.getListMenuType();
        System.out.print(list.toString());
    }
}
