package com.hy.chemical.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 管理员/业务员 的实体类
 */
@Data   //为类提供读写属性, 此外还提供了 equals()、hashCode()、toString() 方法
@AllArgsConstructor //会生成一个包含所有变量，同时如果变量使用了NotNull annotation ， 会进行是否为空的校验，
//全部参数的构造函数的自动生成，该注解的作用域也是只有在实体类上，参数的顺序与属性定义的顺序一致。
@NoArgsConstructor  //无参构造函数
@TableName(value = "user")
public class Users {
    @TableId(type = IdType.AUTO)
    private Integer uid;    //id
    private String userName;    //账号
    private String password;    //密码
    private String type;    //0 管理员，1 业务员
}
