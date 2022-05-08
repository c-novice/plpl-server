package com.plpl.common.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户和作品的交互
 *
 * @author lzq
 */
@EqualsAndHashCode(callSuper = true)
@TableName("user2worker")
@Data
public class UserToWorker extends BaseEntity {
    private Long userId;
    private Integer workerType;
    private Long workerId;
    private Long isLike;
    private Long isCollection;
    private Long isRepost;
}
