package plpl.user.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.plpl.common.enums.FollowsSortEnum;
import com.plpl.common.model.UserToUser;

import java.util.Map;

/**
 * @author lzq
 */
public interface UserToUserService extends IService<UserToUser> {


    /**
     * 分页条件查询关注列表
     *
     * @param pageParam
     * @param userId
     * @param sortType
     * @return
     */

    Page<UserToUser> selectPage(Page<UserToUser> pageParam, Long userId, FollowsSortEnum sortType);


    /**
     * 添加一条关注记录
     *
     * @param UserToUser
     * @return
     */
    Map<String, Object> add(UserToUser UserToUser);

    /**
     * 删除一条关注记录
     *
     * @param userId
     * @param followsId
     * @return
     */
    Map<String, Object> delete(Long userId, Long followsId);

}
