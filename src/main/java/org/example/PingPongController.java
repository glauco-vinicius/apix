package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class PingPongController {

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @PostMapping("/ping")
    public String receivedPing() {
        return "Received ping";
    }

    @GetMapping("/pong")
    public String pong() {
        return "ping";
    }

    @PostMapping("/pong")
    public String receivedPong() {
        return "Received pong";
    }

    public static void main(String[] args) {
        SpringApplication.run(PingPongController.class, args);
    }
}