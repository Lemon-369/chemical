package com.hy.chemical.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hy.chemical.pojo.Supplier;
import com.hy.chemical.pojo.User;
import com.hy.chemical.vo.SupplierSelectVo;

import java.util.List;

/**
 * @author zhang
 * @date 2021/3/2 11:14
 */
public interface SupplierService {
    //分页查询
    IPage<Supplier> mySelectPage(int page, int pageSize, SupplierSelectVo selectVo);

    //添加
    int insert(Supplier supplier);

    //删除
    Integer deleteById(int id);

    //更新
    int updateById(Supplier supplier);
}
