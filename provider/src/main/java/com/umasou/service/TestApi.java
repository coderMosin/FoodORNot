package com.umasou.service;

import com.umasou.ITestApi;
import com.umasou.dao.INutrition;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

@DubboService
public class TestApi implements ITestApi {

    @Autowired
    private INutrition iNutrition;

    @Override
    public String sayHello() {
        return iNutrition.getNutrition().get(0).getName();
    }
}
