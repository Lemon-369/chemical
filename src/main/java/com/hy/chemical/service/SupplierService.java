package com.hy.chemical.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hy.chemical.pojo.Supplier;
import com.hy.chemical.vo.SupplierSelectVo;

import java.util.List;

/**
 * @author zhang
 * @date 2021/3/2 11:14
 */
public interface SupplierService {
    /**
     * 查询所有供应商信息
     * @return
     */
    List<Supplier> queryAll();

    IPage<Supplier> selectPage(int page, int pageSize, SupplierSelectVo selectVo);
}
