package org.springInt.prac;

import org.springframework.integration.annotation.ServiceActivator;


public class SubscriberService {
	@ServiceActivator
	public void getMessageFromProducer(String value){
		System.out.println("Received message: [ "+value+" ]");
	}
	
	public void getTester(String mesg){
		System.out.println("hi");
	}
}
