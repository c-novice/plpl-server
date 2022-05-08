package com.plpl.common.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 用户
 *
 * @author lzq
 */
@EqualsAndHashCode(callSuper = true)
@TableName("user")
@Data
public class User extends BaseEntity {
    private Integer power;
    private String username;
    private String password;
    private String avatarUrl;
    private String phoneNumber;
    private Integer age;
    private Date birthday;
    private Integer gender;
}
