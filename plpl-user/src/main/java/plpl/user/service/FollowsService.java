package plpl.user.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.plpl.common.enums.FollowsSortEnum;
import com.plpl.common.model.FollowsInfo;

import java.util.Map;

/**
 * @author lzq
 */
public interface FollowsService extends IService<FollowsInfo> {


    /**
     * 分页条件查询关注列表
     *
     * @param pageParam
     * @param userId
     * @param sortType
     * @return
     */

    Page<FollowsInfo> selectPage(Page<FollowsInfo> pageParam, Long userId, FollowsSortEnum sortType);


    /**
     * 添加一条关注记录
     *
     * @param followsInfo
     * @return
     */
    Map<String, Object> add(FollowsInfo followsInfo);

    /**
     * 删除一条关注记录
     *
     * @param userId
     * @param followsId
     * @return
     */
    Map<String, Object> delete(Long userId, Long followsId);

}
