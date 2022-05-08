package com.plpl.common.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 视频类
 *
 * @author lzq
 */
@EqualsAndHashCode(callSuper = true)
@TableName("video")
@Data
public class Video extends BaseEntity {
    private Long upId;
    private String title;
    private String introduction;
    private String videoUrl;
    private String coverUrl;
    private String classification;
    private Integer likesCount;
    private Integer repostCount;
    private Integer commentCount;
    private Integer collectCount;
}
