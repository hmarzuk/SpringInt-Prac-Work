package org.springInt.prac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.Message;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.support.MessageBuilder;

public class MessageInvoker {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		MessageChannel channel1 = context.getBean("incomingChannel", MessageChannel.class);
		Message<String> message = MessageBuilder.withPayload("Message for input channel").build();
		channel1.send(message);
		
	}
}
