package com.vp.controller;

import com.vp.service.NumberFeginservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NumberFeignController{

     @Autowired
     private NumberFeginservice numberFeginservice;

     @RequestMapping("/getnember")
     public List<String> getnember() {
          try {
               Thread.sleep(3000);
          } catch (InterruptedException e) {
               e.printStackTrace();
          }
          return  numberFeginservice.getnember();
     }
}
