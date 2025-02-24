package com.yupi.springbootinit.mq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;


/**
 * 用于创建测试程序用到的队列和交换机（只用在程序中执行一次）
 */
public class MqInitMain {
    public static void main(String[] args) {
        try {
            ConnectionFactory factory = new ConnectionFactory();
            factory.setHost("108.160.140.107");
            factory.setPort(5672);
            factory.setUsername("guest");
            factory.setPassword("123456");
            Connection connection = factory.newConnection();
            Channel channel = connection.createChannel();
            String EXCHAGE_NAME = "code_exchange";
            channel.exchangeDeclare(EXCHAGE_NAME, "direct");
            // 创建队列
            String queueName = "code_queue";
            channel.queueDeclare(queueName, true, false, false, null);
            channel.queueBind(queueName, EXCHAGE_NAME, "my_routingKey");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
