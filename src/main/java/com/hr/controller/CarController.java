package com.hr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class CarController {

    @Autowired
    private JdbcTemplate template;

    @RequestMapping("query")
    public List<Map<String,Object>> query(){

        return template.queryForList("select * from car");

    }

}
