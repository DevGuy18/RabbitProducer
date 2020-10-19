package com.behl.timotious;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloRabbitProducer {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	public void sendHello(String name) {
		for (int i = 1; i <= 100; i++) {
			rabbitTemplate.convertAndSend("course.hello", "Hello " + name);
		}
	}

}
