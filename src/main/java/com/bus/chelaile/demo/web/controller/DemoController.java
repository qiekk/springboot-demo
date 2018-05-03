package com.bus.chelaile.demo.web.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(path = "/version/test", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String test() {
        return "test success";
    }
}
