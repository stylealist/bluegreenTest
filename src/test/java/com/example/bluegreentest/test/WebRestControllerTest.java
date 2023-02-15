package com.example.bluegreentest.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.Map;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//@ExtendWith(SpringRunner.class)

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WebRestControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void ProfileCheck () {
        // when
        String profile = this.restTemplate.getForObject("/profile",String.class);

        // then
        assertThat(profile).isEqualTo("local");
    }

    @Test
    public void HealthCheck() {
        // when
        Map response = this.restTemplate.getForObject("/application/health-check", Map.class);
        String status = String.valueOf(response.get("status"));

        // then
        //assertThat(status).isEqualTo("UP");
    }
}
