package com.example.bluegreentest.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private boolean testYn;

    public int test01(){
        if(testYn == true) {
            return 1;
        } else {
            return 0;
        }

    }

}
