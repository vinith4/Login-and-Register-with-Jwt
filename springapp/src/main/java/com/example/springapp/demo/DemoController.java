package com.example.springapp.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @PostMapping("/hello")
    public ResponseEntity<String> sayhello1() {
        return  ResponseEntity.ok("hello ");
    }
}
