package com.yaten.poc.springboot;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class AppError {
    @RequestMapping("/error")
    String getError(){
        return "Something Wring happened.";
    }
}
