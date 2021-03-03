package com.hy.chemical.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hy.chemical.pojo.Supplier;
import com.hy.chemical.pojo.SupplierPage;
import com.hy.chemical.service.SupplierServiceImpl;
import com.hy.chemical.vo.SupplierSelectVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhang
 * @date 2021/3/2 11:32
 * 供应商管理
 */
@Controller()
@RequestMapping(value = "/supplier")
public class SupplierController {
    @Autowired
    private SupplierServiceImpl service;

    @ResponseBody
    @GetMapping(value = "/query")
    public SupplierPage queryAll(
            SupplierSelectVo selectVo,
            @RequestParam(value = "page",defaultValue = "1") int page,
            @RequestParam(value = "pageSize",defaultValue = "10") int pageSize){
        //调用分页接口
        IPage<Supplier> iPage = service.selectPage(page, pageSize,selectVo);
        //封装返回的数据
        SupplierPage supplierPage = new SupplierPage();
        supplierPage.setData(iPage.getRecords());
        supplierPage.setCurrent(iPage.getCurrent());
        supplierPage.setTotal(iPage.getTotal());
        supplierPage.setPages(iPage.getPages());
        supplierPage.setPageSizes(iPage.getSize());
        return supplierPage;
    }

}
