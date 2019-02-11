package com.winter.Controller;


import com.winter.pojo.MenuType;
import com.winter.service.MenuTypeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class MenuTypeController {

    @Resource
    private MenuTypeService ms;

    @RequestMapping("/api/getMenuType")
    @ResponseBody
    public List<MenuType> getListMenuType() {
        List<MenuType> list = ms.getListMenuType();
        return list;
    }

}
