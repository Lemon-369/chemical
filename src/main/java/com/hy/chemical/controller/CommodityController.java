package com.hy.chemical.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hy.chemical.pojo.Commodity;
import com.hy.chemical.pojo.CommodityPage;
import com.hy.chemical.service.CommodityServiceImpl;
import com.hy.chemical.vo.CommoditySelectVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhang
 * @date 2021/3/6 20:10
 */
@Controller
@RequestMapping(value = "/commodity")
public class CommodityController {
    @Autowired
    private CommodityServiceImpl service;

    //分页查询
    @ResponseBody
    @GetMapping(value = "/query")
    public CommodityPage queryAll(
            CommoditySelectVo selectVo,
            @RequestParam(value = "page",defaultValue = "1") int page,
            @RequestParam(value = "pageSize",defaultValue = "10") int pageSize){
        //分页查询
        IPage<Commodity> iPage = service.mySelectPage(page, pageSize, selectVo);
        //封装返回的数据
        CommodityPage commodityPage = new CommodityPage();
        //查询出的数据
        commodityPage.setData(iPage.getRecords());
        System.out.println(iPage.getRecords());
        //总记录数
        commodityPage.setTotal(iPage.getTotal());
        //每页条目
        commodityPage.setPageSizes(iPage.getSize());
        //总页数
        commodityPage.setPages(iPage.getPages());
        //当前页码
        commodityPage.setCurrent(iPage.getCurrent());
        return commodityPage;
    }

    //添加
    @ResponseBody
    @PostMapping(value = "/insert")
    public int insert(@RequestBody Commodity commodity){
        return service.insert(commodity);
    }

    //删除
    @ResponseBody
    @DeleteMapping(value = "/delete")
    public int delete(@RequestParam(value = "sid") Integer id){
        System.out.println(id);
        return service.deleteById(id);
    }

    //更新
    @ResponseBody
    @PutMapping(value = "/update")
    public int update(@RequestBody Commodity commodity){
        System.out.println(commodity.getUpdateTime());
        return service.updateById(commodity);
    }


}
