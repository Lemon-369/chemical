package com.hy.chemical.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hy.chemical.pojo.Commodity;
import com.hy.chemical.vo.CommoditySelectVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author zhang
 * @date 2021/3/5 16:18
 */
@Repository
public interface CommodityMapper extends BaseMapper<Commodity> {
    IPage<Commodity> mySelectPage(Page<Commodity> page, @Param("condition") CommoditySelectVo selectVo);
}
