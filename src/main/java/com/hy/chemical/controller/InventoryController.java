package com.hy.chemical.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hy.chemical.pojo.Inventory;
import com.hy.chemical.pojo.InventoryPage;
import com.hy.chemical.service.InventoryServiceImpl;
import com.hy.chemical.vo.InventoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zhang
 * @date 2021/3/9 10:42
 */
@Controller
@RequestMapping(value = "/inventory")
public class InventoryController {
    @Autowired
    private InventoryServiceImpl service;

    @ResponseBody
    @GetMapping(value = "/query")
    public InventoryPage queryAll(@RequestParam(value = "page",defaultValue = "1") int page,
                                  @RequestParam(value = "pageSize",defaultValue = "10") int pageSize){
        IPage<Inventory> iPage = service.selectPage(page, pageSize);
        InventoryPage inventoryPage = new InventoryPage();
        //封装数据
        inventoryPage.setData(iPage.getRecords());
        //总记录数
        inventoryPage.setTotal(iPage.getTotal());
        //总页数
        inventoryPage.setPages(iPage.getPages());
        //页显示条目个数
        inventoryPage.setPageSizes(iPage.getSize());
        //当前页码
        inventoryPage.setCurrent(iPage.getCurrent());
        return inventoryPage;
    }

    @ResponseBody
    @PutMapping(value = "/addition")
    public int addition(@RequestBody InventoryVo vo){
        return service.addition(vo);
    }
    @ResponseBody
    @PutMapping(value = "/subtract")
    public int subtract(@RequestBody InventoryVo vo){
        return service.subtract(vo);
    }

}
