package plpl.user.controller;

import com.plpl.common.result.Result;
import io.swagger.annotations.ApiModel;
import org.springframework.web.bind.annotation.*;

/**
 * @author lzq
 */
@RestController
@RequestMapping("/dynamic")
@ApiModel(description = "动态控制器")
public class DynamicController {

    @PostMapping("/auth/publish")
    public Result<?> publish(Long userId, Long workerId, Long workerType) {

    }

    /**
     * 删除动态（删除worker时触发，删除redis数据）
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
     * 获取动态列表
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
