package com.vp.service.ErrorImpl;

import com.vp.service.NumberFeginservice;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class NumberFeginCallback implements NumberFeginservice {

    public List<String> getnember() {
        List<String> l = new ArrayList<String>();
        l.add("雪崩啊,降级了");
        return l;
    }
}
