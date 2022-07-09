package com.webproject.webportfolio;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @RequestMapping("/")
    public String index(){
        return "HelloWorld!";
    }
}
