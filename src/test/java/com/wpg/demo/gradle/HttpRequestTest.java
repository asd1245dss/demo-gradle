package com.wpg.demo.gradle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;

/**
 * start server with a random port(it's useful to avoid conflicts in test environments)
 * @author ChangWei Li
 * @version 2017-05-16 15:18
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void homeMessage() throws Exception {
        assertThat(this.restTemplate
                .getForObject("http://localhost:" + port + "/", String.class))
                .contains("Hello World");
    }

}
