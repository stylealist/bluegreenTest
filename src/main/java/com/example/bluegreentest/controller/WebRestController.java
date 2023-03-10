package com.example.bluegreentest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequiredArgsConstructor
public class WebRestController {

    private final Environment env;

    @GetMapping(value = "/profile")
    public String getProfile() {
        return Arrays.stream(env.getActiveProfiles())
                .findFirst()
                .orElse("");
    }
    // set에서만 실행 가능한 api
    @GetMapping(value = "/test")
    public String getTest() {
        return "TEST URL";
    }

}
