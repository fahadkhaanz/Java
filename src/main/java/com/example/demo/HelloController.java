package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/buggy")
    public String getResult() {
        int result = 10 / 0;
        return "This will never be reached";
    }

    @GetMapping("/nullpointer")
    public String GetMessage() {
        String message = null;
        return message.toUpperCase();
    }
}