package com.hy.chemical.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hy.chemical.pojo.Supplier;
import com.hy.chemical.pojo.SupplierPage;
import com.hy.chemical.pojo.User;
import com.hy.chemical.service.SupplierServiceImpl;
import com.hy.chemical.service.UserServiceImpl;
import com.hy.chemical.vo.SupplierSelectVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zhang
 * @date 2021/3/2 11:32
 * 供应商管理
 */
@Controller
@RequestMapping(value = "/supplier")
public class SupplierController {
    @Autowired
    private SupplierServiceImpl service;
    @Autowired
    private UserServiceImpl userService;

    /**
     * 模糊分页查询
     * @param selectVo
     * @param page
     * @param pageSize
     * @return
     */
    @ResponseBody
    @GetMapping(value = "/query")
    public SupplierPage queryAll(
            SupplierSelectVo selectVo,
            @RequestParam(value = "page",defaultValue = "1") int page,
            @RequestParam(value = "pageSize",defaultValue = "10") int pageSize){
        //调用分页查询接口
        IPage<Supplier> iPage = service.mySelectPage(page, pageSize, selectVo);
        //封装返回的数据
        SupplierPage supplierPage = new SupplierPage();
        //查询出的数据
        supplierPage.setData(iPage.getRecords());
        //总记录数
        supplierPage.setTotal(iPage.getTotal());
        //每页条目
        supplierPage.setPageSizes(iPage.getSize());
        //总页数
        supplierPage.setPages(iPage.getPages());
        //当前页码
        supplierPage.setCurrent(iPage.getCurrent());
        return supplierPage;
    }

    @ResponseBody
    @PostMapping(value = "/insert")
    public int insert(@RequestBody Supplier supplier){
        System.out.println(supplier);
        return service.insert(supplier);
    }

    @ResponseBody
    @GetMapping(value = "/queryUser")
    public List<User> queryUser(){
        return userService.queryAll();
    }

    @ResponseBody
    @PutMapping(value = "/update")
    public int update(@RequestBody Supplier supplier){
        return service.updateById(supplier);
    }

    @ResponseBody
    @DeleteMapping(value = "/delete")
    public int delete(@RequestParam(value = "gid") Integer id){
        return service.deleteById(id);
    }

    /**
     * 查询供应商
     */
    @ResponseBody
    @GetMapping(value = "/querySupplier")
    public List<Supplier> querySupplier(){
        return service.selectList();
    }
    /**
     * 查询供应商
     */
    @ResponseBody
    @GetMapping(value = "/queryById")
    public Supplier selectById(@RequestParam(value = "supplierId") Integer id){
        return service.selectById(id);
    }

}
