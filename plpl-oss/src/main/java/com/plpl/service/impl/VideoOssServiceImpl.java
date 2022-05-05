package com.plpl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.plpl.mapper.VideoOssMapper;
import com.plpl.common.model.VideoInfo;
import com.plpl.po.VideoAddPO;
import com.plpl.service.VideoOssService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author lzq
 */
@Service
public class VideoOssServiceImpl extends ServiceImpl<VideoOssMapper, VideoInfo> implements VideoOssService {
    @Override
    public boolean add(MultipartFile video, MultipartFile photo, VideoAddPO videoAddPO) {
        return false;
    }
}
