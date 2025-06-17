package com.sample.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainController {
    @GetMapping("/sbb")
    @ResponseBody
    public String test() {
        return "Test";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
    
}
