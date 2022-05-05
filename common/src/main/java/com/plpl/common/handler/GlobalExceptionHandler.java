package com.plpl.common.handler;


import com.plpl.common.result.Result;
import com.plpl.common.exception.PlplException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理器
 *
 * @author lzq
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 其他异常处理
     *
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e) {
        e.printStackTrace();
        return Result.fail();
    }

    /**
     * 自定义异常处理方法
     *
     * @param e
     * @return
     */
    @ExceptionHandler(PlplException.class)
    @ResponseBody
    public Result error(PlplException e) {
        e.printStackTrace();
        return Result.build(e.getCode(), e.getMessage());
    }
}
