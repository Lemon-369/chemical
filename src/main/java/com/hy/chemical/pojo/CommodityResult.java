package com.hy.chemical.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 封装Commodity表返回的数据
 * @author zhang
 * @date 2021/3/5 16:59
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommodityResult {
    @TableId(type = IdType.AUTO)
    private Integer sid;
    private String name; //商品名称
    private String cas;
    private String userName; //业务员名称
    private String priceInfo; //报价信息
    private Date updateTime; //更新时间
    private Integer supplierId; //供应商id

}
