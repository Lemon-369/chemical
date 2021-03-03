package com.hy.chemical.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author zhang
 * @date 2021/3/2 9:48
 * 订单管理
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "order")
public class Order {
    @TableId(type = IdType.AUTO)
    private Integer did;
    private Integer userId;     //业务员id
    private Double amount;     //数量
    private Double price;     //单价
    private Double costPrice;     //成本价
    private Double royalties;     //提成
    private Double otherCost;     //其他成本
    private Integer  bill;      //有无票据 0没有   1有
    private String bill_info;  //有票据  ，填写开票资料
    private Integer commodityId;    //商品id
    private Integer invoiceId;  //库存编号
    private Integer status;    //库存状态 0未出库  1 已出库  2退货（退货该列表显示红色）
    private String userName;    //客户名称
    private String address;    //地址
    private String phone;    //联系电话
    private String remarks;    //备注
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createTime;    //创建时间



}
