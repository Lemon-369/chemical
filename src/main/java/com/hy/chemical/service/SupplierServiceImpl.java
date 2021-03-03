package com.hy.chemical.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hy.chemical.mapper.SupplierMapper;
import com.hy.chemical.pojo.Supplier;
import com.hy.chemical.vo.SupplierSelectVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhang
 * @date 2021/3/2 11:16
 */
@Service
public class SupplierServiceImpl implements SupplierService{
    @Autowired
    private SupplierMapper mapper;
    @Override
    public List<Supplier> queryAll() {
        return mapper.selectList(null);
    }

    @Override
    public IPage<Supplier> selectPage(int page, int pageSize, SupplierSelectVo selectVo) {
        Page<Supplier> pages = new Page<>(page, pageSize);
        pages.setSearchCount(true);
        if (selectVo.equals("") && selectVo !=null){
            QueryWrapper<Supplier> wrapper = new QueryWrapper<>();
            wrapper.eq("name",selectVo.getName());
            wrapper.eq("userId",selectVo.getUserId());
            return mapper.selectPage(pages, wrapper);
        }
        return mapper.selectPage(pages,null);
    }
}
