package plpl.user.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.plpl.common.enums.FollowsSortEnum;
import com.plpl.common.model.UserToUser;
import org.springframework.stereotype.Service;
import plpl.user.mapper.UserToUserMapper;
import plpl.user.service.UserToUserService;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lzq
 */
@Service
public class UserToUserServiceImpl extends ServiceImpl<UserToUserMapper, UserToUser> implements UserToUserService {

    @Override
    public Page<UserToUser> selectPage(Page<UserToUser> pageParam, Long userId, FollowsSortEnum sortType) {
        switch (sortType) {
            case FIRST_LETTER:
                return baseMapper.selectPageByLetter(pageParam, userId);
            case FREQUENT:
                return baseMapper.selectPageByFrequent(pageParam, userId);
            case TIME:
                return baseMapper.selectPageByTime(pageParam, userId);
            default:
                return baseMapper.selectPageByLatest(pageParam, userId);
        }
    }

    @Override
    public Map<String, Object> add(UserToUser UserToUser) {
        boolean flag = baseMapper.add(UserToUser);
        Map<String, Object> res = new HashMap<>();
        if (flag) {
            res.put("state", "200");
        } else {
            res.put("state", "400");
        }
        return res;

    }

    @Override
    public Map<String, Object> delete(Long userId, Long followsId) {
        boolean flag = baseMapper.delete(userId, followsId);
        Map<String, Object> res = new HashMap<>();
        if (flag) {
            res.put("state", "200");
        } else {
            res.put("state", "400");
        }
        return res;
    }
}
