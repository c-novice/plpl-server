package plpl.user.controller;

import com.plpl.common.enums.FollowsSortEnum;
import com.plpl.common.result.Result;
import io.swagger.annotations.ApiModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import plpl.user.service.UserToUserService;

/**
 * 用户交互之间相关
 *
 * @author lzq
 */
@RestController
@ApiModel(description = "用户之间交互控制器")
public class UserToUserController {

    @Autowired
    UserToUserService userToUserService;

    /**
     * 获取关注列表
     *
     * @param page     第几页
     * @param limit    多少条数据
     * @param userId   用户id
     * @param sortType 排序方式
     * @return
     */
    @GetMapping("/auth/list/{page}/{limit}")
    public Result<?> list(@PathVariable Long page, @PathVariable Long limit, Long userId, FollowsSortEnum sortType) {
    }

    /**
     * 关注用户
     *
     * @param fromId
     * @param toId
     * @return
     */
    @PostMapping("/auth/follow")
    public Result<?> follow(Long fromId, Long toId) {
    }

    /**
     * 取关用户
     *
     * @param fromId
     * @param toId
     * @return
     */
    @DeleteMapping("/auth/delete")
    public Result<?> delete(Long fromId, Long toId) {
    }

    /**
     * 更新用户交互信息（点击次数和访问时间）
     *
     * @param fromId
     * @param toId
     * @return
     */
    @PostMapping("/auth/update")
    public Result<?> update(Long fromId, Long toId) {

    }
}
