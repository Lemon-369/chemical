package com.hy.chemical.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hy.chemical.pojo.Inventory;
import com.hy.chemical.vo.InventoryVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 库存管理
 * @author zhang
 * @date 2021/3/9 9:42
 */
@Repository
public interface InventoryMapper extends BaseMapper<Inventory> {
//    //分页查询
//    IPage<Inventory> mySelectPage(Page<Inventory> page);

    //添加库存
    int addition(@Param("inventoryVo") InventoryVo vo);

    //减少库存
    int subtract(@Param("inventoryVo") InventoryVo vo);
}
