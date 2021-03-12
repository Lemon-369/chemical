package com.hy.chemical.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hy.chemical.pojo.Supplier;
import com.hy.chemical.pojo.User;
import com.hy.chemical.vo.SupplierSelectVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhang
 * @date 2021/3/2 11:12
 */
@Repository
public interface SupplierMapper extends BaseMapper<Supplier>{
    IPage<Supplier> mySelectPage(Page<Supplier> page, @Param("condition")SupplierSelectVo selectVo);
}
