package com.xingzhi.xingzhiblog.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

/**
 * @program: xingzhiblog
 * @description: 微信登录返回类
 * @author: 行之
 * @create: 2021-01-10 16:06
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Alias("WxAccountVO")
public class WxAccountVO {
    private Integer id;
    private String openId;
    private String unionId;
    private String avatar;
    private String nickName;
}
