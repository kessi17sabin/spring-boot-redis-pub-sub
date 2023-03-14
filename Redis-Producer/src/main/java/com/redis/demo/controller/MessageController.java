package com.redis.demo.controller;

import com.redis.demo.service.RedisMessagePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produce")
public class MessageController {

    @Autowired
    private RedisMessagePublisher messagePublisher;

    @GetMapping("")
    public String publishMessage(@RequestParam String message) {
        messagePublisher.publish(message);
        System.out.println("message published" + message);
        return message;
    }
}
