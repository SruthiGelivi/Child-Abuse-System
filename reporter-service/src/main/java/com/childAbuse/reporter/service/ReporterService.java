package com.childAbuse.reporter.service;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class ReporterService {

    @RequestMapping("/home")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(ReporterService.class, args);
    }
}
