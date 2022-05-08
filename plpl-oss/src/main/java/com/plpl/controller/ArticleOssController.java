package com.plpl.controller;

import com.plpl.common.result.Result;
import com.plpl.service.ArticleOssService;
import com.plpl.vo.VideoAddVO;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * 存储文章接口
 *
 * @author lzq
 */
@RestController
@RequestMapping("/oss/article")
@Api(tags = "存储文章")
public class ArticleOssController {
    @Autowired
    ArticleOssService articleOssService;

    @PostMapping("/upload")
    public Result<?> upload(@RequestPart("video") MultipartFile video, @RequestPart("photo") MultipartFile photo, VideoAddVO videoAddVO) {
        if (video == null || photo == null || videoAddVO == null) {
            return Result.fail();
        }
        return articleOssService.add(video, photo, videoAddVO) ? Result.ok() : Result.fail();
    }


    @DeleteMapping("/auth/delete")
    public Result<?> delete(Long workerId, Integer workerType) {

    }
}
