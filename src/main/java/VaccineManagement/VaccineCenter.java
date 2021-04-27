/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VaccineManagement;

import MedicalPersonnel.NurseProfile;
import PatientManagement.PatientProfile;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import java.util.UUID;

/**
 *
* @author Sravya Sree Ogirala
 */

public class VaccineCenter {
    String vaccineCenterName;
    String vaccineCenterAddress; //give random address
    String centerUUID;
    long vaccineAvailability;
    HashMap<Date, PatientProfile> slotBookingMap;
    
    //the constructor has been made protected to avoid object creation elsewhere 
    protected VaccineCenter(String vaccineCenterName, Address vaccineCenterAddress){
        this.vaccineCenterName = vaccineCenterName;
       // this.vaccineCenterAddress = vaccineCenterAddress;
        this.centerUUID = UUID.randomUUID().toString();
        slotBookingMap = new HashMap<Date, PatientProfile>();

       }
    
    //method to add nurse to vaccine center
    public NurseProfile addNurse(String name){
        NurseProfile nurse = new NurseProfile(name);
        return nurse;
    }
 
    //this method allows patient to schedule vaccine appointment based on total number of vaccines in a vaccine center
    public void scheduleVaccineAppointment(PatientProfile pDetails, Date d){    //total vaccine slots
      if(availableSlots() == 0 || slotBookingMap.containsKey(d)){
        return;
        }
      slotBookingMap.put(d, pDetails);
     }
    
    //this method tells about the number of vaccination slots available in a vaccine center
    public long availableSlots(){  
           return (this.vaccineAvailability - slotBookingMap.size());  
           // available slots = total slots - booked slots
    }
    
     @Override
    public String toString(){
        return  "\n" + vaccineCenterName + "\n"
                + vaccineCenterAddress + "\n"
                + centerUUID + "\n";
               
    }
    
    
}
