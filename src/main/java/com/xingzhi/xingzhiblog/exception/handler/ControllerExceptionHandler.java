package com.xingzhi.xingzhiblog.exception.handler;

import com.xingzhi.xingzhiblog.exception.SystemException;
import com.xingzhi.xingzhiblog.common.result.ResponseObject;
import com.xingzhi.xingzhiblog.common.result.ResponseUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: xingzhiblog
 * @description: 全局控制器异常处理
 * @author: 行之
 * @create: 2020-12-23 14:37
 **/
@Slf4j
@ControllerAdvice
@ResponseBody
public class ControllerExceptionHandler {

    @ExceptionHandler(SystemException.class)
    public ResponseObject systemExceptionHander(HttpServletRequest request, SystemException e) throws Exception {
        ResponseUtil res = new ResponseUtil();
        e.printStackTrace();
        log.error("Requst URL : {}，SystemException : {}", request.getRequestURL(), e);
        return res.failed(e.toString());
    }

}
