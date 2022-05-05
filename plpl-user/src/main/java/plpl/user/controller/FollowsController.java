package plpl.user.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plpl.common.enums.FollowsSortEnum;
import com.plpl.common.model.FollowsInfo;
import com.plpl.common.result.Result;
import io.swagger.annotations.ApiModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import plpl.user.service.FollowsService;

/**
 * 关注列表控制器
 *
 * @author lzq
 */
@RestController
@ApiModel(description = "关注列表控制器")
public class FollowsController {

    @Autowired
    FollowsService followsService;

    /**
     * 分页条件查询
     *
     * @param page     第几页
     * @param limit    多少条数据
     * @param userId   用户id
     * @param sortType 排序方式
     * @return
     */
    public Result list(@PathVariable Long page, @PathVariable Long limit, Long userId, FollowsSortEnum sortType) {
        Page<FollowsInfo> pageParam = new Page<>(page, limit);


    }

    /**
     * 关注操作
     *
     * @param userId    用户id
     * @param followsId 关注目标id
     * @return
     */
    public Result add(Long userId, Long followsId) {

    }

    /**
     * 取关操作
     *
     * @param userId    用户id
     * @param followsId 关注目标id
     * @return
     */
    public Result delete(Long userId, Long followsId) {

    }
}
