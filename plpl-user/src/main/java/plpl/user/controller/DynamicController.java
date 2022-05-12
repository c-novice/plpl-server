package plpl.user.controller;

import com.plpl.common.result.Result;
import io.swagger.annotations.ApiModel;
import org.springframework.web.bind.annotation.*;

/**
 * 动态控制器
 * <p>
 * 动态列表的设计整体基于feed流
 * 大v采取拉，小v采取推
 *
 * @author lzq
 */
@RestController
@RequestMapping("/dynamic")
@ApiModel(description = "动态控制器")
public class DynamicController {

    /**
     * 推送动态，触发时机是用户发布作品
     *
     * @param userId
     * @param workerId
     * @param workerType
     * @return
     */
    @PostMapping("/inner/publish")
    public Result<?> publish(Long userId, Long workerId, Long workerType) {

    }

    /**
     * 删除动态（删除作品时触发，删除redis数据）
     *
     * @param userId
     * @param workerId
     * @param workerType
     * @return
     */
    @DeleteMapping("/auth/delete")
    public Result<?> delete(Long userId, Long workerId, Long workerType) {

    }

    /**
     * 拉取动态列表
     *
     * @param page
     * @param limit
     * @param userId
     * @return
     */
    @GetMapping("/auth/list/{page}/{limit}")
    public Result<?> list(@PathVariable Long page, @PathVariable Long limit, Long userId) {

    }
}
