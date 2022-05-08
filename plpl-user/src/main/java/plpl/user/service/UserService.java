package plpl.user.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.plpl.common.model.User;
import plpl.user.vo.UserQueryVo;

import java.util.Map;

/**
 * @author lzq
 */
public interface UserService extends IService<User> {
    Map<String, Object> loginByPassword(String username, String password);

    Map<String, Object> loginByCode(String phone, String code);

    Map<String, Object> updatePassword(Long userId, String password);

    boolean block(Long userId);

    Page<User> selectPage(Page<User> pageParam, UserQueryVo userQueryVo);
}
