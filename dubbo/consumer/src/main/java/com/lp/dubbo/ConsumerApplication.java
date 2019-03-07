package com.lp.dubbo;

import com.lp.dubbo.provider.NotifyService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsumerApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
