package com.white.test.controller;

import com.white.dto.product.response.ProductResponse;
import com.white.test.client.TestService1Client;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class TestController {

    private final TestService1Client testService1Client;

    @GetMapping
    public ProductResponse test(@RequestBody ProductResponse productResponse) {
        return productResponse;
    }
    @GetMapping("/test")
    public String test() {
        return "test";
    }
    @GetMapping("/call-test-service-1")
    public String callTestService1() {
        return testService1Client.getTestMessage();
    }
}
