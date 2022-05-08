package plpl.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plpl.common.model.UserToUser;
import org.mapstruct.Mapper;

/**
 * @author lzq
 */
@Mapper
public interface UserToUserMapper extends BaseMapper<UserToUser> {

    /**
     * 根据首字母排序查询
     *
     * @param page
     * @param userId
     * @return
     */
    Page<UserToUser> selectPageByLetter(Page<?> page, Long userId);

    /**
     * 根据访问频率查询
     *
     * @param pageParam
     * @param userId
     * @return
     */
    Page<UserToUser> selectPageByFrequent(Page<UserToUser> pageParam, Long userId);

    /**
     * 根据关注时间查询
     *
     * @param pageParam
     * @param userId
     * @return
     */
    Page<UserToUser> selectPageByTime(Page<UserToUser> pageParam, Long userId);

    /**
     * 根据最近访问时间查询
     *
     * @param pageParam
     * @param userId
     * @return
     */
    Page<UserToUser> selectPageByLatest(Page<UserToUser> pageParam, Long userId);

    /**
     * 插入
     *
     * @param UserToUser
     * @return
     */
    boolean add(UserToUser UserToUser);

    /**
     * 删除
     *
     * @param userId
     * @param followsId
     * @return
     */
    boolean delete(Long userId, Long followsId);

}


