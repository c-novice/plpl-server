package com.plpl.common.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 文章类
 *
 * @author lzq
 */
@EqualsAndHashCode(callSuper = true)
@TableName("article")
@Data
public class Article extends BaseEntity {
    private Integer upId;
    private String tile;
    private String articleUrl;
    private String coverUrl;
    private String classification;
    private Integer likesCount;
}
