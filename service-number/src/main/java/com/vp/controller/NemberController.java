package com.vp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.List;

@RestController
public class NemberController {

    @Value("${server.port}")
    private String serverport;

    @RequestMapping("/getNemberList")
    public List<String> getNemberList() {
        List<String> listUser = new ArrayList<String>();
        listUser.add("WANGXINJI");
        listUser.add(serverport);
        return listUser;
    }

    @RequestMapping("/getZuulnumber")
    @ResponseBody
    public String getZuulnumber() {
        return "number";
    }
}
