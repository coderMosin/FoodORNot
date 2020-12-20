package com.umasou.controller;

import com.umasou.action.TestAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestAction testAction;

    @GetMapping("/test")
    public String test() {
        return testAction.doTest();
    }

}
