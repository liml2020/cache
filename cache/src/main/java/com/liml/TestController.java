package com.liml;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Cacheable(cacheNames="get")
    @GetMapping("get")
    public String add(){
        return "add";
    }
}
