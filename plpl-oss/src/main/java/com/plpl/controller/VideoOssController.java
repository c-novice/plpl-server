package com.plpl.controller;

import com.plpl.po.VideoAddPO;
import com.plpl.common.result.Result;
import com.plpl.service.VideoOssService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * 存储视频接口
 *
 * @author lzq
 */
@RestController
@RequestMapping("/oss/video")
@Api(tags = "存储视频")
public class VideoOssController {
    @Autowired
    VideoOssService videoOssService;

    @PostMapping("/add")
    public Result<?> add(@RequestPart("video") MultipartFile video, @RequestPart("photo") MultipartFile photo, VideoAddPO videoAddPO) {
        if (video == null || photo == null || videoAddPO == null) {
            return Result.fail();
        }
        return videoOssService.add(video, photo, videoAddPO) ? Result.ok() : Result.fail();
    }
}
