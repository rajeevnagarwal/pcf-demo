package com.telstra.pcfdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/")
public class Controller {

    @GetMapping("/info")
    public String getInfo() {
        return "Hello User";
    }
}
