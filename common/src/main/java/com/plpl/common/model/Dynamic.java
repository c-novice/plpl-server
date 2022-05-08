package com.plpl.common.model;

import lombok.Data;

import java.util.Date;

/**
 * @author lzq
 */
@Data
public class Dynamic {
    private Long userId;
    private Long username;
    private Date publishTime;
    private Integer workerType;
    private Long workerId;
    private String workerUrl;
    private Integer commentCount;
    private Integer likeCount;
}
