package org.jeecg.modules.dss.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.jeecg.common.api.vo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/dss")
@Slf4j
@Api(tags = "新增模块测试接口")
public class MyTestController {

    @GetMapping(value="/test")
    @ApiOperation(value = "测试接口")
    public Result<?> test(){
        Map<String,String> map = new HashMap<>();
        map.put("name","abc");
        map.put("id","1");
        return Result.ok(map);
    }
}