package com.greenhome.consumer;

import static com.iotsens.sdk.IoTSensApiClientBuilder.aIoTSensClient;

import java.io.InputStream;
import java.util.Properties;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

import com.greenhome.domain.GreenHomeObject;
import com.iotsens.sdk.IoTSensApiClient;
import com.iotsens.sdk.measures.Measure;

public class DataConsumer implements Callable {

	static Properties propertyFile = new Properties();

	public static String APPLICATION_ID = null; // must be proper
												// application
												// identifier
	public static String SECRET = null; // must be proper secret
	public static String DEFAULT_USER = null; // must be a proper user
	public static String SENSOR_ID = null; // must be a proper sensor id
	
	@Override
	public Object onCall(MuleEventContext context) throws Exception {
		
		try {
			
			InputStream input = DataConsumer.class.
					getClassLoader().getResourceAsStream("application.properties");
			propertyFile.load(input);
			
			APPLICATION_ID = propertyFile.getProperty("iotsens.clientAppCode");
			SECRET =  propertyFile.getProperty("iotsens.clientAppSecret");
			DEFAULT_USER =  propertyFile.getProperty("iotsens.username");
			SENSOR_ID =  propertyFile.getProperty("sensors.sensorId");
			
			IoTSensApiClient apiClient = aIoTSensClient()
					.withApplication(APPLICATION_ID)
					.withSecret(SECRET)
					.withDefaultUser(DEFAULT_USER)
					.build();
			
			UtilsData utils =  new UtilsData();
			GreenHomeObject data =  new GreenHomeObject();
			
			data.setMessage_type("SENSOR");
			
			Measure srv = utils.getLastMeasureSensor("SRV", apiClient, SENSOR_ID);
			data.setSRV(Integer.parseInt(srv.getValue()));
			
			Measure bzr = utils.getLastMeasureSensor("BZR", apiClient, SENSOR_ID);
			data.setBZR(Integer.parseInt(bzr.getValue()));
			
			Measure led1 = utils.getLastMeasureSensor("LED1", apiClient, SENSOR_ID);
			data.setLED1(Integer.parseInt(led1.getValue()));
			
			Measure led2 = utils.getLastMeasureSensor("LED2", apiClient, SENSOR_ID);
			data.setLED2(Integer.parseInt(led2.getValue()));
			
			Measure led3 = utils.getLastMeasureSensor("LED3", apiClient, SENSOR_ID);
			data.setLED3(Integer.parseInt(led3.getValue()));
			
			Measure led4 = utils.getLastMeasureSensor("LED4", apiClient, SENSOR_ID);
			data.setLED4(Integer.parseInt(led4.getValue()));
			
			Measure fan = utils.getLastMeasureSensor("FAN", apiClient, SENSOR_ID);
			data.setFAN(Integer.parseInt(fan.getValue()));
			
			Measure temp1 = utils.getLastMeasureSensor("TEMP1", apiClient, SENSOR_ID);
			data.setTEMP1(Integer.parseInt(temp1.getValue()));
			
			Measure hum1 = utils.getLastMeasureSensor("HUM1", apiClient, SENSOR_ID);
			data.setHUM1(Integer.parseInt(hum1.getValue()));
			
			Measure temp2 = utils.getLastMeasureSensor("TEMP2", apiClient, SENSOR_ID);
			data.setTEMP2(Integer.parseInt(temp2.getValue()));
			
			Measure hum2 = utils.getLastMeasureSensor("HUM2", apiClient, SENSOR_ID);
			data.setHUM2(Integer.parseInt(hum2.getValue()));
			
			Measure temp3 = utils.getLastMeasureSensor("TEMP3", apiClient, SENSOR_ID);
			data.setTEMP3(Integer.parseInt(temp3.getValue()));
			
			Measure hum3 = utils.getLastMeasureSensor("HUM3", apiClient, SENSOR_ID);
			data.setHUM3(Integer.parseInt(hum3.getValue()));
			
			Measure pir = utils.getLastMeasureSensor("PIR", apiClient, SENSOR_ID);
			data.setPIR(Integer.parseInt(pir.getValue()));
			
			Measure lux = utils.getLastMeasureSensor("LUX", apiClient, SENSOR_ID);
			data.setLUX(Integer.parseInt(lux.getValue()));
			
			Measure mag = utils.getLastMeasureSensor("MAG", apiClient, SENSOR_ID);
			data.setMAG(Integer.parseInt(mag.getValue()));
			
			Measure hum = utils.getLastMeasureSensor("HUM", apiClient, SENSOR_ID);
			data.setHUM(Integer.parseInt(hum.getValue()));
			
			Measure sun = utils.getLastMeasureSensor("SUN", apiClient, SENSOR_ID);
			data.setSUN(Integer.parseInt(sun.getValue()));
			
			Measure nfc = utils.getLastMeasureSensor("NFC", apiClient, SENSOR_ID);
			data.setNFC(Integer.parseInt(nfc.getValue()));

			System.out.println(srv);
			System.out.println(bzr);
			System.out.println(led1);
			System.out.println(led2);
			System.out.println(led3);
			System.out.println(led4);
			System.out.println(fan);
			System.out.println(temp1);
			System.out.println(hum1);
			System.out.println(temp2);
			System.out.println(hum2);
			System.out.println(temp3);
			System.out.println(hum3);
			System.out.println(pir);
			System.out.println(lux);
			System.out.println(mag);
			System.out.println(hum);
			System.out.println(sun);
			System.out.println(nfc);
			
			String dataSerialized = data.toString();
			
			System.out.println(dataSerialized);
			
	        return dataSerialized;
	        
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
			return null;
		}

	}
}
