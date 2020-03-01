package com.vp.service;


import com.vp.service.ErrorImpl.NumberFeginCallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@FeignClient(value = "service-nember",fallback = NumberFeginCallback.class)
public interface NumberFeginservice {

     @RequestMapping("/getNemberList")
     public List<String> getnember();
}
