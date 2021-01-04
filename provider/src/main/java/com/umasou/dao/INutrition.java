package com.umasou.dao;

import com.umasou.model.Nutrition;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface INutrition {
    @Select("select * from nutrition")
    public List<Nutrition> getNutrition();
}
