//package com.plpl.controller;
//
//import com.plpl.po.VideoAddPO;
//import com.plpl.result.Result;
//import com.plpl.service.ArticleOssService;
//import io.swagger.annotations.Api;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestPart;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.multipart.MultipartFile;
//
///**
// * 存储文章接口
// *
// * @author lzq
// */
//@RestController
//@RequestMapping("/oss/article")
//@Api(tags = "存储文章")
//public class ArticleOssController {
//    @Autowired
//    ArticleOssService articleOssService;
//
//    @PostMapping("/add")
//    public Result<?> add(@RequestPart("video") MultipartFile video, @RequestPart("photo") MultipartFile photo, VideoAddPO videoAddPO) {
//        if (video == null || photo == null || videoAddPO == null) {
//            return Result.fail();
//        }
//        return articleOssService.add(video, photo, videoAddPO) ? Result.ok() : Result.fail();
//    }
//}
