package com.redis.consumer.queue;

public interface MessagePublisher {
    void publish(final String message);
}
