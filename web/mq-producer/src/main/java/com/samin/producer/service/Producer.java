package com.samin.producer.service;

import com.samin.common.SystemConstant;
import com.samin.common.entity.MessageBody;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 生产者
 *
 * @author samin
 * @date 2022-12-25
 */
@Component
public class Producer implements CommandLineRunner {

    private final RabbitTemplate rabbitTemplate;

    public Producer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Sending message...");

        rabbitTemplate.convertAndSend(SystemConstant.topicExchangeName, "foo.bar.baz", "Hello from RabbitMQ!");

        Thread.sleep(3000L);

        MessageBody messageBody = MessageBody.builder().msgId(1L).text("foo").content("bar").userId(1L).build();
        rabbitTemplate.setMessageConverter(new Jackson2JsonMessageConverter());
        rabbitTemplate.convertAndSend(SystemConstant.topicExchangeName, "msg.foo", messageBody);
    }
}