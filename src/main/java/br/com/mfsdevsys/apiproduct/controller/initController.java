package br.com.mfsdevsys.apiproduct.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class initController {

    @GetMapping
    public String init() {
        return "Application Start";
    }
}
