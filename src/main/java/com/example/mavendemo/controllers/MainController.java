package com.example.mavendemo.controllers;

import com.example.mavendemo.DTO.Demo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private Demo demo = new Demo();


    @GetMapping("")
    @ResponseBody
    public String getHome() {
        demo.setFirst("sweet home");
        return "Home " +demo.getFirst();
    }

}
