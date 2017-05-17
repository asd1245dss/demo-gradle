package com.wpg.demo.gradle.service;

import org.springframework.stereotype.Service;

/**
 * @author ChangWei Li
 * @version 2017-05-16 15:30
 */
@Service
public class HomeService {

    public String home() {
        return "Hello World";
    }

}
