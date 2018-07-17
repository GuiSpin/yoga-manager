package com.api.guispin.yogamanager.message;

import com.api.guispin.yogamanager.YogaManagerApplication;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class Sender {


    private final RabbitTemplate rabbitTemplate;

    @Autowired
    public Sender(final RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Scheduled(fixedDelay = 3000L)
    public void sendMessage() {
        final Message message = new Message("Hello there!", new Random().nextInt(50), false);
        rabbitTemplate.convertAndSend(YogaManagerApplication.EXCHANGE_NAME, YogaManagerApplication.ROUTING_KEY, message);
    }
}

