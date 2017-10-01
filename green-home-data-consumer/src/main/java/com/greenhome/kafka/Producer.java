package com.greenhome.kafka;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class Producer {
	private static Producer instance = null;
	
	static Properties propertyFile = new Properties();
	
	private final KafkaProducer<Integer, String> producer;
	private final String topic;
	int messageNo = 1;

	public Producer(String topic) throws IOException {
		
		Properties props = new Properties();
		props.put("bootstrap.servers",
				propertyFile.getProperty("kafka.serverURL") + ":" 
								+ propertyFile.getProperty("kafka.serverPort"));
		props.put("client.id", "DemoProducer");
		props.put("key.serializer", 
				"org.apache.kafka.common.serialization.IntegerSerializer");
		props.put("value.serializer",
				"org.apache.kafka.common.serialization.StringSerializer");
		
		producer = new KafkaProducer<Integer, String>(props);
		this.topic = topic;
	}

	public static Producer getInstance() throws IOException {
		InputStream input = Producer.class.getClassLoader()
				.getResourceAsStream("application.properties");
		propertyFile.load(input);
		
	      if(instance == null) {
	         instance = new Producer(propertyFile.getProperty("kafka.topicName"));
	      }
	      return instance;
	   }
	
	public void sendMessagge(String message) {
		messageNo = (int )(Math.random() * Integer.MAX_VALUE + 1);
		try {
			producer.send(new ProducerRecord<Integer, String>(topic, messageNo, message)).get();
			System.out.println("Sent message: (" + messageNo + ", " + message + ")");
		} catch (Exception e) {
			e.printStackTrace();
		}

		++messageNo;
	}
}
