package com.hy.chemical.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author zhang
 * @date 2021/3/9 10:54
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryPage {
    private List<Inventory> Data;    //封装数据
    private long current;    //当前页码
    private long pageSizes;   //每页显示多少数量
    private long pages;  //总页数
    private long total;    //总记录数
}
