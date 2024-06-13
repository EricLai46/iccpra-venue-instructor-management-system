package com.example.iccpra;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IccpraController {

  @GetMapping("/api/data")
  public Map<String, String> getData() {
    Map<String, String> response = new HashMap<>();
    response.put("message", "Hello from Spring Boot!");
    return response;
  }
}