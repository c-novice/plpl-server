package com.plpl.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.plpl.common.model.Video;
import com.plpl.vo.VideoAddVO;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author lzq
 */
public interface VideoOssService extends IService<Video> {
    /**
     * 文件上传
     * @param file
     * @return
     */
    boolean add(MultipartFile video, MultipartFile photo, VideoAddVO videoAddVO);
}
