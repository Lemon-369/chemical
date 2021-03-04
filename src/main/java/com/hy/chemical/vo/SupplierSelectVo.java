package com.hy.chemical.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.bind.DefaultValue;

/**
 * @author zhang
 * @date 2021/3/3 11:42
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SupplierSelectVo {
    private String name;    //供应商名称
    private String userId; //业务员id
}
