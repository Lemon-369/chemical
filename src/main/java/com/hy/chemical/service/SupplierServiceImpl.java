package com.hy.chemical.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hy.chemical.mapper.SupplierMapper;
import com.hy.chemical.pojo.Supplier;
import com.hy.chemical.vo.SupplierSelectVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

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

    /**
     * @param page
     * @param pageSize
     * @param selectVo
     * @return
     */
    @Override
    public IPage<Supplier> mySelectPage(int page, int pageSize, SupplierSelectVo selectVo) {
        //创建分页对象
        Page<Supplier> pages = new Page<>(page, pageSize);
        //设置 返回数据总记录
        pages.setSearchCount(true);
        return mapper.mySelectPage(pages,selectVo);

    }
}
