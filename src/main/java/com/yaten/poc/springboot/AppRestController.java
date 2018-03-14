package com.yaten.poc.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController {

    @RequestMapping("/")
    public String get(){
        return "Hello World"+
                " I Love Harneet.";
    }
}
