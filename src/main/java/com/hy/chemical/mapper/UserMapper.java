package com.hy.chemical.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hy.chemical.pojo.Users;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<Users> {

}
