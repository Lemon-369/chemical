package com.hy.chemical.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hy.chemical.pojo.Commodity;
import com.hy.chemical.vo.CommoditySelectVo;


/**
 * 商品信息模块
 * @author zhang
 * @date 2021/3/6 19:53
 */
public interface CommodityService {
    //分页查询
    IPage<Commodity> mySelectPage(int page, int pageSize, CommoditySelectVo selectVo);

    //添加商品信息
    int insert(Commodity commodity);

    //删除
    Integer deleteById(Integer id);

    //更新
    int updateById(Commodity commodity);

}
