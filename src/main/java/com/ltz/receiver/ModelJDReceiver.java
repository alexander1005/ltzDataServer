package com.ltz.receiver;


import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import server.spider.impl.Model;

import java.util.Map;

@EnableRabbit
@Component
public class ModelJDReceiver {

  @RabbitListener(queues = "jd")
  public void receive(Model msg,Message message,Channel channel) {
    System.out.println("ModelSMZDMReceiver  : " + msg.toString());
  }

}
