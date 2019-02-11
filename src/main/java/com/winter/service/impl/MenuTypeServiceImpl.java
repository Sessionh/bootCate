package com.winter.service.impl;

import com.winter.dao.MenuTypeDao;
import com.winter.pojo.MenuType;
import com.winter.service.MenuTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service(value = "menuTypeService")
public class MenuTypeServiceImpl  implements MenuTypeService {

    @Resource
    private MenuTypeDao md;

    @Override
    public List<MenuType> getListMenuType() {
        List<MenuType> list = md.getListMenuType();
        return list;
    }
}
