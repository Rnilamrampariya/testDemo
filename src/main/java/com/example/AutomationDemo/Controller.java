package com.example.AutomationDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class Controller {

    @GetMapping(value = "/getString")
    public String getMergedString(@RequestParam String inputString) {
        return "Hello" + " " + inputString;
    }
}
