package plpl.user.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plpl.common.model.User;
import com.plpl.common.result.Result;
import com.plpl.common.result.ResultCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import plpl.user.service.UserService;
import plpl.user.vo.UserQueryVo;

import java.util.Map;

/**
 * 用户控制器
 *
 * @author lzq
 */
@RestController
@RequestMapping("/user")
@ApiModel(description = "用户控制器")
public class UserController {
    @Autowired
    UserService userService;

    /**
     * 根据账号、密码登录
     *
     * @param username
     * @param password
     * @return
     */
    @ApiOperation(value = "根据账号、密码登录")
    @PostMapping("/auth/login/password")
    public Result<?> loginByPassword(String username, String password) {
        Map<String, Object> map = userService.loginByPassword(username, password);
        ResultCodeEnum resultCodeEnum = (ResultCodeEnum) map.get("state");
        return Result.build(map, resultCodeEnum);
    }


    /**
     * 根据手机号、验证码登录
     *
     * @param phone
     * @param code
     * @return
     */
    @ApiOperation(value = "根据手机号、验证码登录")
    @PostMapping("/auth/login/code")
    public Result loginByCode(String phone, String code) {
        Map<String, Object> map = userService.loginByCode(phone, code);
        ResultCodeEnum resultCodeEnum = (ResultCodeEnum) map.get("state");
        return Result.build(map, resultCodeEnum);
    }


    /**
     * 修改用户密码
     *
     * @param userId
     * @param password
     * @return
     */
    @ApiOperation(value = "修改用户密码")
    @PostMapping("/auth/update/password")
    public Result<?> updatePassword(Long userId, String password) {
        Map<String, Object> map = userService.updatePassword(userId, password);
        ResultCodeEnum resultCodeEnum = (ResultCodeEnum) map.get("state");
        return Result.build(map, resultCodeEnum);
    }

    /**
     * 分页条件查询用户
     *
     * @param page
     * @param limit
     * @param userQueryVo
     * @return
     */
    @ApiOperation(value = "分页条件查询用户")
    @GetMapping("/auth/{page}/{limit}")
    public Result<?> list(@PathVariable Long page, @PathVariable Long limit, UserQueryVo userQueryVo) {
        Page<User> pageParam = new Page<>(page, limit);
        Page<User> pageModel = userService.selectPage(pageParam, userQueryVo);

        return Result.ok(pageModel);
    }


    /**
     * 删除用户
     *
     * @param userId
     * @return
     */
    @ApiOperation(value = "删除用户")
    @DeleteMapping("/auth/delete")
    public Result<?> delete(Long userId) {
        boolean delete = userService.removeById(userId);
        return delete ? Result.ok() : Result.fail(ResultCodeEnum.DELETE_FAIL);
    }

    /**
     * 拉黑用户
     *
     * @param userId
     * @return
     */
    @ApiOperation(value = "拉黑用户")
    @PostMapping("/auth/block")
    public Result<?> block(Long userId) {
        boolean block = userService.block(userId);
        return block ? Result.ok() : Result.fail();
    }


}
