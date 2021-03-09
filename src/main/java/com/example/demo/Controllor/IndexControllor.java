package com.example.demo.Controllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class IndexControllor {
    @RequestMapping("/index")
    private String hello() {
        return "/index.html";
    }

    @RequestMapping("fp")
    private String fp() {
        return "/Firstpage.html";
    }

    @RequestMapping("GetSSR")
    private String getSSR() {
        return "/GetSSR.html";
    }
}
