package plpl.user.controller;

import com.plpl.common.result.Result;
import io.swagger.annotations.ApiModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import plpl.user.service.UserToUserService;

/**
 * 用户和作品交互相关
 *
 * @author lzq
 */
@RestController
@RequestMapping("/user/to/worker")
@ApiModel(description = "用户和作品交互控制器")
public class UserToWorkerController {

    @Autowired
    UserToUserService userToUserService;

    /**
     * 查询用户收藏列表
     *
     * @param page  第几页
     * @param limit 多少条数据
     * @return
     */
    @GetMapping("/auth/list/{page}/{limit}")
    public Result<?> list(@PathVariable Long page, @PathVariable Long limit, Long userId) {

    }

    @PostMapping("/auth/like")
    public Result<?> like(Long userId, Long workerId, Integer workerType) {

    }

    @PostMapping("/auth/collection")
    public Result<?> collection(Long userId, Long workerId, Integer workerType) {

    }

    @PostMapping("/auth/forward")
    public Result<?> forward(Long userId, Long workerId, Integer workerType) {

    }

    @DeleteMapping("/auth/cancel/forward")
    public Result<?> cancelForward(Long userId, Long workerId, Integer workerType) {

    }

    /**
     * 取关操作
     *
     * @param userId    用户id
     * @param followsId 关注目标id
     * @return
     */
    public Result<?> delete(Long userId, Long followsId) {

    }
}
