package plpl.user.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.plpl.common.model.User;
import org.springframework.stereotype.Service;
import plpl.user.mapper.UserMapper;
import plpl.user.service.UserService;
import plpl.user.vo.UserQueryVo;

import java.util.Map;

/**
 * @author lzq
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public Map<String, Object> loginByPassword(String username, String password) {
        return null;
    }

    @Override
    public Map<String, Object> loginByCode(String phone, String code) {
        return null;
    }

    @Override
    public Map<String, Object> updatePassword(Long userId, String password) {
        return null;
    }

    @Override
    public boolean block(Long userId) {
        return false;
    }

    @Override
    public Page<User> selectPage(Page<User> pageParam, UserQueryVo userQueryVo) {
        return null;
    }
}
