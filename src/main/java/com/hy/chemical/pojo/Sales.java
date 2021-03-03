package com.hy.chemical.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhang
 * @date 2021/3/2 9:41
 * 退货管理
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "sales")
public class Sales implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer did;
    private Integer userId;     //业务员id
    private Integer orderId;      //订单Id
    private String trackingNumber;  //物流编号
    private String trackingName;    //物流公司名称
    private String status;  //0 未收到  1收到退货
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createTime;    //创建时间
}
