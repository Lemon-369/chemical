package com.hy.chemical.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hy.chemical.mapper.InventoryMapper;
import com.hy.chemical.pojo.Inventory;
import com.hy.chemical.vo.InventoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhang
 * @date 2021/3/9 9:45
 */
@Service
public class InventoryServiceImpl implements InventoryService{
    @Autowired
    private InventoryMapper mapper;

    @Override
    public IPage<Inventory> selectPage(int page,int pageSize) {
        //创建分页对象
        Page<Inventory> pages = new Page<>(page,pageSize);
        //设置分页插件 返回数据总记录
        pages.setSearchCount(true);
        return mapper.selectPage(pages,null);
    }

    @Override
    public int addition(InventoryVo vo) {
        return mapper.addition(vo);
    }

    @Override
    public int subtract(InventoryVo vo) {
        return mapper.subtract(vo);
    }
}
