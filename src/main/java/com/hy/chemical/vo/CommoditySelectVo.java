package com.hy.chemical.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

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
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updateTimeOne;//更新时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updateTimeTwo;//更新时间
}
