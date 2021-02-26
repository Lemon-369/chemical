package com.hy.chemical.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhang
 * @date 2021/2/26 18:23
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserKey {
    private String username;
    private String password;
}
