package com.plpl.common.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 聊天
 *
 * @author lzq
 */
@EqualsAndHashCode(callSuper = true)
@TableName("chat")
@Data
public class Chat extends BaseEntity {
    private Long fromId;
    private Long toId;
    private String content;
    private Integer contentType;
    private Integer isRead;
    private Integer isWithdraw;
}
