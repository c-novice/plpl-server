package com.plpl.common.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 评论
 *
 * @author lzq
 */
@EqualsAndHashCode(callSuper = true)
@TableName("comment")
@Data
public class Comment extends BaseEntity {
    private Long userId;
    private Long workId;
    private Integer workType;
    private String context;
    private Integer likeCount;
}
