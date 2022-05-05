package plpl.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plpl.common.model.FollowsInfo;
import org.mapstruct.Mapper;

/**
 * @author lzq
 */
@Mapper
public interface FollowsMapper extends BaseMapper<FollowsInfo> {

    /**
     * 根据首字母排序查询
     *
     * @param page
     * @param userId
     * @return
     */
    Page<FollowsInfo> selectPageByLetter(Page<?> page, Long userId);

    /**
     * 根据访问频率查询
     *
     * @param pageParam
     * @param userId
     * @return
     */
    Page<FollowsInfo> selectPageByFrequent(Page<FollowsInfo> pageParam, Long userId);

    /**
     * 根据关注时间查询
     *
     * @param pageParam
     * @param userId
     * @return
     */
    Page<FollowsInfo> selectPageByTime(Page<FollowsInfo> pageParam, Long userId);

    /**
     * 根据最近访问时间查询
     *
     * @param pageParam
     * @param userId
     * @return
     */
    Page<FollowsInfo> selectPageByLatest(Page<FollowsInfo> pageParam, Long userId);

    /**
     * 插入
     *
     * @param followsInfo
     * @return
     */
    boolean add(FollowsInfo followsInfo);

    /**
     * 删除
     *
     * @param userId
     * @param followsId
     * @return
     */
    boolean delete(Long userId, Long followsId);

}


