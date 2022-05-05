package plpl.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.plpl.common.model.UserInfo;
import org.springframework.stereotype.Service;
import plpl.user.mapper.UserMapper;
import plpl.user.service.UserService;

/**
 * @author lzq
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserInfo> implements UserService {
}
