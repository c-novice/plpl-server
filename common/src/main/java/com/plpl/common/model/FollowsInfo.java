package com.plpl.common.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 关注信息
 *
 * @author lzq
 */
@TableName("follows")
@Data
public class FollowsInfo extends BaseEntity {
    private Integer userId;
    private Integer followId;
}
