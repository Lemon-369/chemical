package com.hy.chemical.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhang
 * @date 2021/3/3 11:42
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SupplierSelectVo {
    private String name;    //供应商名称
    private int userId; //业务员id
}
