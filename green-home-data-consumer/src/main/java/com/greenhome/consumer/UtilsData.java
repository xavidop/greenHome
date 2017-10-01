package com.greenhome.consumer;

import java.util.List;

import com.iotsens.sdk.IoTSensApiClient;
import com.iotsens.sdk.measures.Measure;
import com.iotsens.sdk.measures.MeasuresRequest;
import com.iotsens.sdk.measures.MeasuresRequestBuilder;

public class UtilsData {
	
	public Measure getLastMeasureSensor(String sensor,IoTSensApiClient apiClient, String sensorId){
		try {
			// hacemos la peticion
			MeasuresRequest request = MeasuresRequestBuilder.
										aMeasureRequest(sensorId, sensor).
										withLimit(1).
										build();
			List<Measure> measures = apiClient.getMeasures(request);

			// devolvemos el ultimo
			return measures.get(0);
		} catch (Exception e) {
			Measure m = new Measure();
			m.setValue("0");
			return m;
		}
	}
	
	public List<Measure> getMeasureSensor(String sensor,IoTSensApiClient apiClient, String sensorId){
		
		try {
			MeasuresRequest request = MeasuresRequestBuilder.aMeasureRequest(sensorId, sensor)
					.withLimit(1)
					.build();
			List<Measure> measures = apiClient.getMeasures(request);
			return measures;
		} catch (Exception e) {
			return null;
		}
	}
	
}
