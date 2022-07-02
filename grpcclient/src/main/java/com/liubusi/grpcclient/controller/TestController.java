package com.liubusi.grpcclient.controller;

import com.liubusi.grpcclient.service.TestGrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestGrpcService testGrpcService;

    @RequestMapping("/test")
    public String test() {
        return testGrpcService.test();
    }
}
