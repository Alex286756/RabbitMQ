package ru.kuksov.RabbitMQProducer.model;

import lombok.Data;

@Data
public class MessageModel {

    private String message;
    private String routingKey;
}
