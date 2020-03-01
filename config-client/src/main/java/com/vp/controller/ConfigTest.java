package com.vp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigTest {
    @Value("${userName}")
    private String userName;

    @RequestMapping(value = "/getConfig")
    public String getConfig() {
        return userName;
    }

}
