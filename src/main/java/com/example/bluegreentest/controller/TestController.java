package com.example.bluegreentest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {


    public int test01() {
        return 1;
    }

}
