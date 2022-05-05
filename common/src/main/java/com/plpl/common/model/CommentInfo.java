package com.plpl.common.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 评论
 *
 * @author lzq
 */
@TableName("comment")
@Data
public class CommentInfo extends BaseEntity {
    private Long userId;
    private Long workId;
    private Integer type;
    private String context;
    private Integer likeCount;
}
