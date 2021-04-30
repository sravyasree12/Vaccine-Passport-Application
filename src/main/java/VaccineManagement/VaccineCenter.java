/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VaccineManagement;

import MedicalPersonnel.NurseProfile;
import PatientManagement.PatientHistory;
import PatientManagement.PatientProfile;
import Verify.Verification;
import com.github.javafaker.Faker;
import java.time.LocalDateTime;
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
    public ArrayList<ZonedDateTime> listOfSlots;
    public HashMap<ZonedDateTime, PatientProfile> slotBookingMap;
    ArrayList<NurseProfile> listOfAssignedNurses;
    
    
    //the constructor has been made protected to avoid object creation elsewhere 
    //Vaccine Center objects can be created only via Vaccine Inventory using addVaccineCenter()
    protected VaccineCenter(String vaccineCenterName, String vaccineCenterAddress){
        
        this.vaccineCenterName = vaccineCenterName;
       this.vaccineCenterAddress = vaccineCenterAddress;
        this.centerUUID = UUID.randomUUID().toString();
        this.slotBookingMap = new HashMap<ZonedDateTime, PatientProfile>();
        this.listOfAssignedNurses = new ArrayList<NurseProfile>();
        this.listOfSlots = new ArrayList<ZonedDateTime>();

    }
//    
//     //this method allows patient to schedule vaccine appointment based on total number of vaccines in a vaccine center
//     //all vaccines in a vaccine center will be available in slots to schedule for patients
//      //total vaccine slots
//    public void scheduleVaccineAppointment(ZonedDateTime d, PatientProfile pDetails){  //test method later
//      Verification vp = new Verification(pDetails);
//        if((pDetails.isPatientEligibleForVaccine()== false) || (vp.isPatientIDValid() == false)) {
//            System.out.println("Sorry! You are not eligible for vaccination.");
//          }
//      if(numberOfAvailableSlots() == 0 || slotBookingMap.containsKey(d)){
//        return;
//        }
//      slotBookingMap.put(d, pDetails);
//     }
    
    //this method tells about the number of vaccination slots available in a vaccine center
      // available slots = total slots - booked slots
    public long numberOfAvailableSlots(){  
        return (this.vaccineAvailability - slotBookingMap.size());     
    }
    
    public HashMap<ZonedDateTime, PatientProfile> updateSlotBookingMap(ZonedDateTime date, PatientProfile pp){
        slotBookingMap.put(date, pp);   
        return slotBookingMap; 
    }

    //adds different date, time to the list of slots.
    public void addTimeSlot(ZonedDateTime date){
        listOfSlots.add(date);
    }
    
    public ArrayList<NurseProfile> getListOfAssignedNurses() {
        return listOfAssignedNurses;
    }

    public ArrayList<ZonedDateTime> getListOfSlots() {
        return listOfSlots;
    }

    public long getVaccineAvailability() {
        return vaccineAvailability;
    }

    public void setVaccineAvailability(long vaccineAvailability) {
        this.vaccineAvailability = vaccineAvailability;
    }
    
    
    
     @Override
    public String toString(){
        return  "\n" + vaccineCenterName + "\n"
                + vaccineCenterAddress + "\n"
                + centerUUID + "\n" 
                + "Number of available vaccine slots:" + numberOfAvailableSlots();
                
                
                
               
    }
    
    
}
