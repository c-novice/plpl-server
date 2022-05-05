package plpl.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.plpl.common.model.FollowsInfo;
import org.springframework.stereotype.Service;
import plpl.user.mapper.FollowsMapper;
import plpl.user.service.FollowsService;

import java.util.Map;

/**
 * @author lzq
 */
@Service
public class FollowsServiceImpl extends ServiceImpl<FollowsMapper, FollowsInfo> implements FollowsService {
    public Map<String,Object> list()
}
