package com.plpl.common.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 收藏
 *
 * @author lzq
 */
@TableName("collection")
@Data
public class CollectionInfo extends BaseEntity {
    private Long userId;
    private Long workId;
    private Integer type;
}
