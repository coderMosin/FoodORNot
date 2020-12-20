package com.umasou.action;

import com.umasou.ITestApi;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class TestAction {
    @Reference
    private ITestApi iTestApi;

    public String doTest() {
        return iTestApi.sayHello();
    }
}
