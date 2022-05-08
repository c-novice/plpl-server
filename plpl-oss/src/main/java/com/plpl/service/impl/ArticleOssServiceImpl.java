package com.plpl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.plpl.common.model.Article;
import com.plpl.mapper.ArticleOssMapper;
import com.plpl.service.ArticleOssService;
import com.plpl.vo.VideoAddVO;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.Region;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;

/**
 * @author lzq
 */
@Service
public class ArticleOssServiceImpl extends ServiceImpl<ArticleOssMapper, Article> implements ArticleOssService {
    @Override
    public boolean add(MultipartFile video, MultipartFile photo, VideoAddVO videoAddVO) {
        Configuration cfg = new Configuration(Region.region0());

        UploadManager uploadManager = new UploadManager(cfg);
        String accessKey = "FzMqAGOrntlBKam6cEtzc-OO1D_PUUN7iswmAxET";
        String secretKey = "nLiQXCq1uvjpCpZXhXVcDf05u9qrT96ybGSI7xRq";
        String bucket = "plpl-oss";
        String key = null;

        try {
            String path = "C:\\Users\\lzq\\Desktop\\L)K@BM8T5@}`E`@RL~(OUSV.png";
            byte[] uploadBytes = Files.readAllBytes(new File(path).toPath());
            Auth auth = Auth.create(accessKey, secretKey);
            String upToken = auth.uploadToken(bucket);

            try {
                Response response = uploadManager.put(uploadBytes, key, upToken);
            } catch (QiniuException ex) {
                Response r = ex.response;
                System.err.println(r.toString());
                try {
                    System.err.println(r.bodyString());
                } catch (QiniuException ex2) {
                    //ignore
                }
            }
        } catch (UnsupportedEncodingException ex) {
            //ignore
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
