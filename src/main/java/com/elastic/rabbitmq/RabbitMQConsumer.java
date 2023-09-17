package com.elastic.rabbitmq;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableRabbit
public class RabbitMQConsumer {
    @RabbitListener(queues = "books_queue")
    public void consumeMessage(String message) {
        System.out.println("Received message from books_queue: " + message);
        // Burada gelen mesajı işlemek istediğiniz kodu ekleyebilirsiniz.
    }
}
