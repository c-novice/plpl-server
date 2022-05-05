package plpl.user.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plpl.common.model.UserInfo;
import com.plpl.common.result.Result;
import com.plpl.common.result.ResultCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;
import plpl.user.service.UserService;

import java.util.HashMap;
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
    public Result loginByPassword(String username, String password) {
        Map<String, Object> map = userService.loginByPassword(username, password);
        ResultCodeEnum resultCodeEnum = (ResultCodeEnum) map.get("state");
        return Result.build(map, resultCodeEnum);
    }

    /**
     * 根据手机号获取验证码
     *
     * @param phone
     * @return
     */
    @ApiOperation(value = "根据手机号获取验证码")
    @PostMapping("/auth/code")
    public Result getCode(String phone) {

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

    }

    /**
     * 获取微信登录二维码
     *
     * @return
     */
    @ApiOperation(value = "获取微信登录二维码")
    @GetMapping("/auth/qrcode")
    public Result getQRCode() {

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
    public Result updatePassword(Long userId, String password) {

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
    public Result list(@PathVariable Long page, @PathVariable Long limit, UserQueryVo userQueryVo) {
        Page<UserInfo> pageParam = new Page<>(page, limit);
        Page<UserInfo> pageModel = userService.selectPage(pageParam, userQueryVo);

        return Result.ok(pageModel);
    }

    /**
     * 添加用户
     *
     * @param userAddVo
     * @return
     */
    @ApiOperation(value = "添加用户")
    @PostMapping("/auth/add")
    public Result add(UserAddVo userAddVo) {
        Map<String, Object> map = userService.add(userAddVo);
        ResultCodeEnum resultCodeEnum = (ResultCodeEnum) map.get("state");
        map.remove("state");
        return Result.build(map, resultCodeEnum);
    }

    /**
     * 修改用户
     *
     * @param userUpdateVo
     * @return
     */
    @ApiOperation(value = "修改用户信息")
    @PutMapping("/auth/update")
    public Result update(UserUpdateVo userUpdateVo) {
        if (ObjectUtils.isEmpty(userUpdateVo)) {
            return Result.fail(ResultCodeEnum.USER_REPEAT);
        }
        User user = new User();
        user.setId(userUpdateVo.getId());
        user.setUsername(userUpdateVo.getUsername());
        user.setPassword(userUpdateVo.getPassword());
        user.setPermission(userUpdateVo.getPermission());
        user.setStudentNumber(userUpdateVo.getStudentNumber());
        user.setName(userUpdateVo.getName());
        user.setType(userUpdateVo.getType());

        boolean update = userService.updateById(user);
        if (update) {
            Map<String, Object> map = new HashMap<>(1);
            map.put("user", user);
            return Result.ok(map);
        } else {
            return Result.fail(ResultCodeEnum.USER_REPEAT);
        }
    }

    /**
     * 删除用户
     *
     * @param userId
     * @return
     */
    @ApiOperation(value = "删除用户")
    @DeleteMapping("/auth/delete")
    public Result delete(String userId) {
        boolean delete = userService.removeById(userId);
        return delete ? Result.ok() : Result.fail(ResultCodeEnum.DELETE_FAIL);
    }


}
