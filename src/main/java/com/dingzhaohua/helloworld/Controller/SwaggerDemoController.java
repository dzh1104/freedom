package com.dingzhaohua.helloworld.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
// 路径
@RequestMapping("api")
@Api("swaggerDemoController相关的api")
public class SwaggerDemoController {
    @ApiOperation(value = "测试swagger2的功能", notes = "使用swagger2的demo")
    // 字段（id） 描述（用户ID）参数类型 是否必填 数据类型
    // dataType 应该要为 String，因为在swagger2页面中的输入框 拿到的是 字符串类型的，不修改为 String，页面中的输入框会报错
    @ApiImplicitParam(name = "id", value = "用户ID", paramType = "path", required = true, dataType = "String")
    // 路径 请求类型
    @RequestMapping(value = "swagger2/{id}", method = RequestMethod.GET)
    public String testSwagger2 (@PathVariable String id) {
        return id;
    }
}
