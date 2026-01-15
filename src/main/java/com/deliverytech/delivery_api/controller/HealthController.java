package com.deliverytech.delivery_api.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.util.Map;
@RestController

public class HealthController {
  @GetMapping("/health")
  public Map<String, String> health(){
    return Map.of(
      "status", "UP",
      "timestamp", LocalDateTime.now().toString(),
      "service", "Delivery API",
      "javaVersion" , System.getProperty("java.version"));

  }

  @GetMapping ("/info")
  public AppInfo info(){
    return new AppInfo(
      "Delivery Tech API", "1.0.0",
      "[Enio Gabriel]", "JDK 21", "Spring Boot 3.2.x"
    );
  }

  //Record para modelar as informações do Java 14+
  public record AppInfo(
    String name,
    String version,
    String author,
    String javaVersion,
    String framework
  ){}

}
