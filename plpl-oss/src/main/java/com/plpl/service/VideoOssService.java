package com.plpl.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.plpl.common.model.VideoInfo;
import com.plpl.po.VideoAddPO;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author lzq
 */
public interface VideoOssService extends IService<VideoInfo> {
    /**
     * 文件上传
     * @param file
     * @return
     */
    boolean add(MultipartFile video, MultipartFile photo, VideoAddPO videoAddPO);
}
