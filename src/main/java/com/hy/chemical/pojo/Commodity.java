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
 * @date 2021/3/2 8:59
 * 商品管理
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "commodity")
public class Commodity implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer sid;    //商品id
    private String name;    //商品名称
    private String cas;    //cas号
    private Integer userId;     //业务员id
    private String priceInfo;     //报价信息
    private String commodityInfo;   //商品介绍
    private String imgStatus;    //图片上传状态： 0未上传   1已上传
    private String imgPath;    //图片路径
    private String fileStatus;     //文件上传状态 ：0未上传   1已上传
    private String filePath;       //文件路径
    private Integer supplierId;    //供应商id
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createTime;   //创建时间
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date updateTime;   //更新时间
    private String sName; //供应商名称
    private String userName; //业务员名称
}
