package com.example.demo;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CicdController {

    @GetMapping("/hi")
    public String demo() {

        return "안녕 이게 되네 이게 접속이 되나봐";
    }
}
