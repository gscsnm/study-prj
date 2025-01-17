package com.samin.swaggerdemo.controller;

import com.samin.swaggerdemo.vo.TestVo;
import io.swagger.annotations.Api;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Api("测试接口集合")
@RestController
public class TestController {

    @PostMapping("/test")
    public Map<String, String> test(@RequestBody TestVo testVo) {
        return new HashMap<String, String>() {
            {
                put("msg", "test");
            }
        };
    }
}