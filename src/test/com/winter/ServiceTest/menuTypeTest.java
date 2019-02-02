package com.winter.ServiceTest;

import com.winter.mapper.menuTypeMapper;
import com.winter.model.menuType;
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
    private menuTypeMapper mt;

    @Test
    public void getListMenuType() {
        List<menuType> list =  mt.getListMenuType();
        System.out.print(list.toString());
    }
}
