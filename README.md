# RabbitMQ

Базовый вариант работы с RabbitMQ на Java с использованием фреймворка Spring Boot.

Проект состоит из двух программ:
- Producer. Запускает сообщения в очередь.
- Consumer. Получает сообщения из очереди по ключу.

Для простоты использованы константные величины:
- порт Producer'а 8086;
- порт Consumer'a 8087;
- обменник называется "testExchange";
- ключ очереди "testRoutingKey";
- очередь называется "queue";

Для работы на localhost'е можно запустить контейнер в docker'е с помощью docker-compose.yml.
После запуска Producer'а и Consumer'а можно сделать запрос (например, с помощью Postman) по адресу http://localhost:8086/send c body:

```
{
  "message": "simple text",
  "routingKey": "testRoutingKey"
}
```
