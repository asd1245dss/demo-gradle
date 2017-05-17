package com.wpg.demo.gradle.controller;

import com.wpg.demo.gradle.service.HomeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChangWei Li
 * @version 2017-05-16 14:25
 */
@RestController
public class HomeController {

    private final HomeService homeService;

    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    @GetMapping("/")
    public String home() {
        return this.homeService.home();
    }

}
