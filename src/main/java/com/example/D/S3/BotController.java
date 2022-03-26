package com.example.D.S3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BotController {


    @GetMapping("/hello")
    public String hello () {
        return "hello";
    }


}
