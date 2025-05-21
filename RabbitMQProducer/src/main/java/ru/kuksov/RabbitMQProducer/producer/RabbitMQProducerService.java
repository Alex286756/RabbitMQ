package ru.kuksov.RabbitMQProducer.producer;

public interface RabbitMQProducerService {

    void sendMessage(String message, String routingKey);
}
