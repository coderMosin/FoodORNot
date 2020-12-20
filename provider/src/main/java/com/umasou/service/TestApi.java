package com.umasou.service;

import com.umasou.ITestApi;
import org.apache.dubbo.config.annotation.Service;

@Service
public class TestApi implements ITestApi {

    @Override
    public String sayHello() {
        return "让我试试";
    }
}
