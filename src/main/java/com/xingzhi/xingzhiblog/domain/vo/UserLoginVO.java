package com.xingzhi.xingzhiblog.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

/**
 * @program: xingzhiblog
 * @description: 用户登录表单接收
 * @author: 行之
 * @create: 2021-01-01 20:12
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Alias("UserLoginVO")
public class UserLoginVO {
    String userName;
    String password;
}
