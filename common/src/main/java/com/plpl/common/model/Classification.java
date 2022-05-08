package com.plpl.common.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 收藏
 *
 * @author lzq
 */
@EqualsAndHashCode(callSuper = true)
@TableName("classification")
@Data
public class Classification extends BaseEntity {
    private String myName;
    private String fatherName;
}
