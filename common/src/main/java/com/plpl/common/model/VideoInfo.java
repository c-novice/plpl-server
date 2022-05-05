package com.plpl.common.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 视频类
 *
 * @author lzq
 */
@TableName("video")
@Data
public class VideoInfo extends BaseEntity {
    private Integer upId;
    private String title;
    private String introduction;
    private String videoUrl;
    private String coverUrl;
    private String classification;
    private Integer likesCount;
}
