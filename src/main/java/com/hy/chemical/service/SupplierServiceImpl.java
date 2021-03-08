package com.hy.chemical.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hy.chemical.mapper.SupplierMapper;
import com.hy.chemical.pojo.Supplier;
import com.hy.chemical.pojo.User;
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

    /**
     * 查询所有供应商信息
     * @param page  第几页
     * @param pageSize  一页几条
     * @param selectVo  查询条件
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

    //查询所有
    public List<Supplier> selectList(){
        return mapper.selectList(null);
    }
    //根据id查询
    public Supplier selectById(int id){
        return mapper.selectById(id);
    }

    /**
     * 添加供应商信息
     * @param supplier
     * @return
     */
    @Override
    public int insert(Supplier supplier) {
        return mapper.insert(supplier);
    }

    /**
     * 根据id删除供应商信息
     * @param id
     * @return
     */
    @Override
    public Integer deleteById(int id) {
        return mapper.deleteById(id);
    }

    /**
     * 更新供应商信息
     * @param supplier
     * @return
     */
    @Override
    public int updateById(Supplier supplier) {
        return mapper.updateById(supplier);
    }
}
