package com.hy.chemical.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhang
 * @date 2021/3/9 10:33
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryVo {
    private Integer kid;
    private Double amount;
}
