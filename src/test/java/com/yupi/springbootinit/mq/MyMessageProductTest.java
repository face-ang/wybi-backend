package com.yupi.springbootinit.mq;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class MyMessageProductTest {

    @Resource
    private MyMessageProducer myMessageProducer;

    @Resource
    private RabbitTemplate rabbitTemplate;

    @Test
    void sendMessage() {
        myMessageProducer.sendMessage("code_exchange", "my_routingKey", "你好呀");
    }

    @Test
    public void testSendMessage() {
        rabbitTemplate.convertAndSend(
                "code_exchange",
                "my_routingKey",
                "Hello atguigu");
    }
}
