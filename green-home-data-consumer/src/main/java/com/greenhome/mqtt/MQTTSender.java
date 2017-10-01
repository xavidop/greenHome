package com.greenhome.mqtt;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class MQTTSender implements Callable {
	@Override
	public Object onCall(MuleEventContext context) throws Exception {
		
		String payload = context.transformMessageToString();
		
		String topic = "greenhome";
		String content = payload;
		int qos = 1;
		String broker = "tcp://m20.cloudmqtt.com:12444";

		// MQTT client id to use for the device. "" will generate a client id
		// automatically
		String clientId = "backendRESTFul";

		MemoryPersistence persistence = new MemoryPersistence();
		try {
			MqttClient mqttClient = new MqttClient(broker, clientId, persistence);
			mqttClient.setCallback(new MqttCallback() {
				public void messageArrived(String topic, MqttMessage msg) throws Exception {
					System.out.println("Recived:" + topic);
					System.out.println("Recived:" + new String(msg.getPayload()));
				}

				public void deliveryComplete(IMqttDeliveryToken arg0) {
					System.out.println("Delivary complete");
				}

				public void connectionLost(Throwable arg0) {
					// TODO Auto-generated method stub
				}
			});

			MqttConnectOptions connOpts = new MqttConnectOptions();
			connOpts.setCleanSession(true);
			connOpts.setUserName("greenhome");
			connOpts.setPassword(new char[] { 'g', 'r', 'e', 'e', 'n', 'h', 'o','m','e' });
			mqttClient.connect(connOpts);
			MqttMessage message = new MqttMessage(content.getBytes());
			message.setQos(qos);
			System.out.println("Publish message: " + message);
			mqttClient.subscribe(topic, qos);
			mqttClient.publish(topic, message);
			mqttClient.disconnect();
			
			return payload;
			
		} catch (MqttException me) {
			System.out.println("reason " + me.getReasonCode());
			System.out.println("msg " + me.getMessage());
			System.out.println("loc " + me.getLocalizedMessage());
			System.out.println("cause " + me.getCause());
			System.out.println("excep " + me);
			me.printStackTrace();
			return payload;
		}

	}
}
