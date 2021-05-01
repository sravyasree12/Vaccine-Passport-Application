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
    
    /**
     * Protected constructor is used to prevent fraud vaccine centers elsewhere. 
     * Thus, vaccine center objects can be created only through Vaccine Inventory.
     * @param vaccineCenterName
     * @param vaccineCenterAddress 
     */
    protected VaccineCenter(String vaccineCenterName, String vaccineCenterAddress){
        
        this.vaccineCenterName = vaccineCenterName;
        this.vaccineCenterAddress = vaccineCenterAddress;
        this.centerUUID = UUID.randomUUID().toString();
        this.slotBookingMap = new HashMap<ZonedDateTime, PatientProfile>();
        this.listOfAssignedNurses = new ArrayList<NurseProfile>();
        this.listOfSlots = new ArrayList<ZonedDateTime>();
    }
    
    /**
     * "numberOfAvailableSlots" method tells about the 
     * number of vaccination slots available in a vaccine center.
     * available slots = total slots - booked slots
     * @return long
     */
    public long numberOfAvailableSlots(){  
        return (this.vaccineAvailability - slotBookingMap.size());     
    }
    
    /**
     * "updateSlotBookingMap" method updates the slotBookingMap HashMap
     * @param date from ZonedDateTime
     * @param pp from PatientProfile
     * @return HashMap<ZonedDateTime, PatientProfile> 
     */
    public HashMap<ZonedDateTime, PatientProfile> updateSlotBookingMap(ZonedDateTime date, PatientProfile pp){
        slotBookingMap.put(date, pp);   
        return slotBookingMap; 
    }
    
    /**
     * "addTimeSlot" method adds different date, time to the list of slots.
     * @param date from ZonedDateTime
     * @return void
     */
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
    
    /**
     * Override the toString method to get a meaningful response upon printing the string.
     */
    @Override
    public String toString(){
        return  "\n" + vaccineCenterName + "\n"
                + vaccineCenterAddress + "\n"
                + centerUUID + "\n" 
                + "Number of available vaccine slots:" + numberOfAvailableSlots();           
    } 
}
