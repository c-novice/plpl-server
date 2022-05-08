package com.plpl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.plpl.mapper.VideoOssMapper;
import com.plpl.common.model.Video;
import com.plpl.vo.VideoAddVO;
import com.plpl.service.VideoOssService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author lzq
 */
@Service
public class VideoOssServiceImpl extends ServiceImpl<VideoOssMapper, Video> implements VideoOssService {
    @Override
    public boolean add(MultipartFile video, MultipartFile photo, VideoAddVO videoAddVO) {
        return false;
    }
}
