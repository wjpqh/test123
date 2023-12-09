package com.example.demo.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testContronller {


    @RequestMapping("/test")
    public  String str(){

        return "123";
    }

}
