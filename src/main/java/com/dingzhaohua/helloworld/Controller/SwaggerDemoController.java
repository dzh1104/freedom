package com.dingzhaohua.helloworld.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

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
    // @RequestMapping(value = "swagger2/{id}", method = RequestMethod.GET)

    // 需要指定访问的方式，否则会导致其中一个影响就是swagger2显示所有的方法
    @RequestMapping("swagger2/{id}")
    // @GetMapping("swagger2/{id}")
    public String testSwagger2 (@PathVariable String id) {
        return id;
    }
}
