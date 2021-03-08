package com.hy.chemical.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author zhang
 * @date 2021/3/5 16:22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommoditySelectVo {
    private String name;//产品名称
    private String cas;//cas号
    private Date updateTimeOne;//更新时间
    private Date updateTimeTwo;//更新时间
}
