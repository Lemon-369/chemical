package com.hy.chemical.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author zhang
 * @date 2021/3/9 9:38
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "inventory")
public class Inventory {
    @TableId(type = IdType.AUTO)
    private Integer kid;
    private String number;  //库存编号
    private String name;    //商品名称
    private String cas;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date createTime;   //创建时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date updateTime;   //更新时间
    private Double amount;  //库存数量
    private String remark;  //备注

}
