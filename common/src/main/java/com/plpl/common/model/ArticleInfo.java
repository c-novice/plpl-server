package com.plpl.common.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 文章类
 *
 * @author lzq
 */
@TableName("article")
@Data
public class ArticleInfo extends BaseEntity {
    private Integer upId;
    private String tile;
    private String articleUrl;
    private String coverUrl;
    private String classification;
    private Integer likesCount;
}
