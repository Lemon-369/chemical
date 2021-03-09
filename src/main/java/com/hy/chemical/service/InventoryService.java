package com.hy.chemical.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hy.chemical.pojo.Inventory;
import com.hy.chemical.vo.InventoryVo;

/**
 * @author zhang
 * @date 2021/3/9 9:44
 */
public interface InventoryService {
    /**
     * 分页查询所有
     * @param page  页码
     * @param pageSize  一页几条
     * @return
     */
    IPage<Inventory> selectPage(int page,int pageSize);

    //添加库存
    int addition(InventoryVo vo);

    //减少库存
    int subtract(InventoryVo vo);
}
