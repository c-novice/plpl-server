package com.plpl.common.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 用户之间交互
 *
 * @author lzq
 */
@EqualsAndHashCode(callSuper = true)
@TableName("user2user")
@Data
public class UserToUser extends BaseEntity {
    private Long fromId;
    private Long toId;
    private Integer clickCounts;
    private Date lastTime;
    private Integer isFollow;
}
