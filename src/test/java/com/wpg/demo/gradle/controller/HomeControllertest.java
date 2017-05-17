package com.wpg.demo.gradle.controller;

import com.wpg.demo.gradle.service.HomeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author ChangWei Li
 * @version 2017-05-16 15:23
 */
@RunWith(SpringRunner.class)
@WebMvcTest(HomeController.class)
public class HomeControllertest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private HomeService homeService;

    @Test
    public void home() throws Exception {

        String homeReturn = "Hello Mock";

        when(homeService.home()).thenReturn(homeReturn);

        this.mockMvc
                .perform(get("/"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString(homeReturn)));
    }

}
