package com.wpg.demo.gradle;

import com.wpg.demo.gradle.controller.HomeController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;

/**
 * @author ChangWei Li
 * @version 2017-05-16 15:10
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

    @Autowired
    private HomeController homeController;

    @Test
    public void main() throws Exception {
        assertThat(homeController).isNotNull();
    }

}