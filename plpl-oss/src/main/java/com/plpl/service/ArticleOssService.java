package com.plpl.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.plpl.common.model.Article;
import com.plpl.vo.VideoAddVO;
import org.springframework.web.multipart.MultipartFile;

/**
 * 存储文章服务
 *
 * @author lzq
 */
public interface ArticleOssService extends IService<Article> {
    /**
     * 文件上传
     *
     * @param file
     * @return
     */
    boolean add(MultipartFile video, MultipartFile photo, VideoAddVO videoAddVO);
}
