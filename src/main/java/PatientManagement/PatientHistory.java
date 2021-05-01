/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagement;

import java.time.ZonedDateTime;
import java.util.ArrayList;

/**
 *
 * @author Sravya Sree Ogirala
 */
enum MeasurementType{
    KILOS,
    POUNDS
}
public class PatientHistory {
     private int respiratoryRate;
     private int heartRate;
     private int systolicBloodPressure;
     double weight;
     private ZonedDateTime creationTime;
     double weightInPounds;
     double weightInKilos;
    MeasurementType weightMeasurement;

    public PatientHistory(
            int respiratoryRate, 
            int heartRate, 
            int systolicBloodPressure){
           
         
        this.respiratoryRate = respiratoryRate;
        this.heartRate = heartRate;
        this.systolicBloodPressure = systolicBloodPressure;
     
        
        if (weightMeasurement == MeasurementType.KILOS){
            this.weightInKilos = weight;
            this.weightInPounds = weight * 2.2;
        }
        else if (weightMeasurement == MeasurementType.POUNDS){
            this.weightInKilos = weightPoundsToKilos(weight);
            this.weightInPounds = weight;
        }
        
        this.creationTime = ZonedDateTime.now();
        }

    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getSystolicBloodPressure() {
        return systolicBloodPressure;
    }

    public void setSystolicBloodPressure(int systolicBloodPressure) {
        this.systolicBloodPressure = systolicBloodPressure;
    }

    public double getWeightInKilos() {
        return weightInKilos;
    }

    public void setWeightInKilos(double weightInKilos) {
        this.weightInKilos = weightInKilos;
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    public ZonedDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(ZonedDateTime creationTime) {
        this.creationTime = creationTime;
    }

    
    
     /*
       Override the toString method to get a meaningful response upon
       printing the string.
       */
     @Override
    public String toString(){
        return 
                "Respiratory Rate: " + respiratoryRate
                +"\n Heart Rate: " + heartRate
                +"\n Systolic Blood Pressure: " + systolicBloodPressure
                +"\n Weight in Kilos: " + weightInKilos
                +"\n Weight in Pounds: " + weightInPounds
                +"\n Creation Time: " + creationTime;
           
    }
        
    public double weightPoundsToKilos(double pounds){
        double kilos = pounds/(2.2);
        return kilos;
    }
      
    }

    
    
    
    

