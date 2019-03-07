package com.lp.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class DubboProviderServiceApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(DubboProviderServiceApplication.class, args);
    }

}
