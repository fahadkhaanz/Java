package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/buggy")
    public String getResult() {
        try{
            int result = 10 / 0;
            return "This will never be reached";
        } catch (Exception e){
            return "An error occurred: " + e.getMessage();
        }
    }

    @GetMapping("/nullpointer")
    public String GetMessage() {
        String message = null;
        if (message == null){
            return "Message is null";
        }
        return message.toUpperCase();
    }
}