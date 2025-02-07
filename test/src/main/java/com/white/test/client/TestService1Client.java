package com.white.test.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "TEST-SERVICE-1")
public interface TestService1Client {
    @GetMapping("/test")
    String getTestMessage();
}
