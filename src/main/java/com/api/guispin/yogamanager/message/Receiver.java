package com.api.guispin.yogamanager.message;

import com.api.guispin.yogamanager.YogaManagerApplication;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class Receiver {


    @RabbitListener(queues = YogaManagerApplication.QUEUE_GENERIC_NAME)
    public void receiveMessage(final org.springframework.amqp.core.Message message) {
        System.out.println("Received message as generic: {}"+ message.toString());
    }

    @RabbitListener(queues = YogaManagerApplication.QUEUE_SPECIFIC_NAME)
    public void receiveMessage(final Message customMessage) {
        System.out.print("Received message as specific class: {}"+ customMessage.toString());
    }
}
