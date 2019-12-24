package com.example.firewarningclient.data.model;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class sensordata {
    public String timestamp;
    public String temperature;
    public String mqppm;
    public int humidity;
    public String sensorId;

    public sensordata(){}

    public sensordata(String timestamp, String mqppm, String temperature, int humidity, String sensorId){
        this.timestamp = timestamp;
        this.mqppm = mqppm;
        this.temperature = temperature;
        this.humidity = humidity;
        this.sensorId = sensorId;
    }

    public int getHumidity() {
        return this.humidity;
    }

    public String getMqppm() {
        return this.mqppm;
    }

    public String getTimestamp(){
        return this.timestamp;
    }

    public String getTemperature() {
        return this.temperature;
    }

    public String getSensorId(){
        return this.sensorId;
    }

}
