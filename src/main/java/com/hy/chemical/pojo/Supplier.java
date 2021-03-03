package com.hy.chemical.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhang
 * @date 2021/3/2 10:35
 * 供应商表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "supplier")
public class Supplier implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer gid;
    private Integer userId; //业务员id
    private String name;    //供应商名称
    private String phone;   //电话
    private String wechat;  //微信或qq
    private String status;  //状态    0未关联商品  1已关联商品
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createTime;   //创建时间
    private String remark;  //备注
}
