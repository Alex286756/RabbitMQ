package ru.kuksov.RabbitMQProducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.kuksov.RabbitMQProducer.model.MessageModel;
import ru.kuksov.RabbitMQProducer.producer.RabbitMQProducerService;

@RestController
public class RabbitController {

    private final RabbitMQProducerService rabbitMQProducerService;

    @Autowired
    public RabbitController(RabbitMQProducerService rabbitMQProducerService) {
        this.rabbitMQProducerService = rabbitMQProducerService;
    }

    @GetMapping("/send")
    public void sendMessageToRabbit(@RequestBody MessageModel messageModel) {
        rabbitMQProducerService.sendMessage(messageModel.getMessage(), messageModel.getRoutingKey());
    }

    @GetMapping("/health")
    public String healthCheck() {
        return "OK";
    }
}
