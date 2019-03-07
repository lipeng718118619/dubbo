package com.lp.dubbo.controller;


import com.lp.dubbo.provider.NotifyService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{
    @Reference(version = "${service.version}")
    private NotifyService notifyService;

    @GetMapping(path = "/test")
    public String getSayHello()
    {
        return notifyService.sayHello("lipeng");
    }
}
