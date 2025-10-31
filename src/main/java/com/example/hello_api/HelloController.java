package com.example.hello_api;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/api/hello")
  public Map<String, String> sayHello() {
    return Map.of("message", "Hello, World!", "status", "success");
  }
}
