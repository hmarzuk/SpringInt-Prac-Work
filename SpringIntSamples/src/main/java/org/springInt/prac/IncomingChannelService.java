package org.springInt.prac;

import org.springframework.stereotype.Component;

@Component
public class IncomingChannelService {
	public String modifyMessage(String message){
		System.out.println("#### "+message);
		return "Modified from service >> Actual message is: "+message;
	}
}
