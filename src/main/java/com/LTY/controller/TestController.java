package com.LTY.controller;
import com.LTY.domin.ResponseResult;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author 刘泰源
 * @version 1.8
 * 测试项目是否正常启动
 */
@RestController
@Slf4j
public class TestController {
    @GetMapping("/test")
    @ApiOperation(value = "测试接口")
    public ResponseResult test(){
        log.info("欢迎");
        return ResponseResult.okResult(200, "欢迎使用LTY的项目架构");
    }
}
