package com.greenhome.kafka;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class KafkaUtils implements Callable {

	@Override
	public Object onCall(MuleEventContext context) throws Exception {
		 Producer producerThread = Producer.getInstance();
	     producerThread.sendMessagge(context.getMessageAsString());
		
		return context.transformMessageToString();
 
	}

}
