package com.hy.chemical.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hy.chemical.mapper.CommodityMapper;
import com.hy.chemical.pojo.Commodity;
import com.hy.chemical.pojo.Supplier;
import com.hy.chemical.vo.CommoditySelectVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhang
 * @date 2021/3/6 20:03
 */
@Service
public class CommodityServiceImpl implements CommodityService{
    @Autowired
    private CommodityMapper mapper;

    /**
     *  查询商品信息
     * @param page  第几页
     * @param pageSize  一页几条
     * @param selectVo  查询条件
     * @return
     */
    @Override
    public IPage<Commodity> mySelectPage(int page, int pageSize, CommoditySelectVo selectVo) {
        //创建分页对象
        Page<Commodity> pages = new Page<>(page,pageSize);
        //设置分页插件 返回数据总记录
        pages.setSearchCount(true);
        return mapper.mySelectPage(pages,selectVo);
    }

    /**
     * 添加
     * @param commodity
     * @return
     */
    @Override
    public int insert(Commodity commodity) {
        return mapper.insert(commodity);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @Override
    public Integer deleteById(Integer id) {
        return mapper.deleteById(id);
    }

    /**
     * 更新
     * @param commodity
     * @return
     */
    @Override
    public int updateById(Commodity commodity) {
        return mapper.updateById(commodity);
    }

}
