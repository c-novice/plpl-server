package com.plpl.common.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 用户
 *
 * @author lzq
 */
@TableName("user")
@Data
public class UserInfo extends BaseEntity {
    private Integer userPower;
    private String username;
    private String password;
    private String avatarUrl;
    private String phoneNumber;
    private Integer age;
    private Date birthday;
    private Integer gender;
}
