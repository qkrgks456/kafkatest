package com.example.kafkatest.controller;

import com.example.kafkatest.TestDto;
import com.example.kafkatest.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final KafkaTemplate<String, Object> kafkaTemplate;
    private final TestService testService;

    @GetMapping("/")
    public ResponseEntity<String> test(@RequestParam String check) {
        System.out.println(testService.test(check));
        return ResponseEntity.ok().body("ok");
    }

    @GetMapping("/test")
    public ResponseEntity<String> casheDelete(@RequestParam String check) {
        testService.cacheDelete();
        return ResponseEntity.ok().body("ok");
    }
}
