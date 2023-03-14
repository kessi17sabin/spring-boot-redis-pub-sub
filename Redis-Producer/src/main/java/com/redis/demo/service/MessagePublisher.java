package com.redis.demo.service;

public interface MessagePublisher {
    void publish(final String message);
}
