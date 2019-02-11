package com.winter.ServiceTest;

import com.winter.service.MenuTypeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class menuTypeServiceTest {
    @Resource
    private MenuTypeService ms;

    @Test
    public void getListMenuType() {
        ms.getListMenuType();

    }

}
