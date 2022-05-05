package com.plpl.common.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 聊天
 *
 * @author lzq
 */
@TableName("chatInfo")
@Data
public class ChatInfo extends BaseEntity {
    private Long fromId;
    private Long toId;
    private String content;
    private String contentType;
    private Integer isRead;
    private Integer isWithdraw;
}
