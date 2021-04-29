/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VaccineManagement;

import com.github.javafaker.Faker;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.UUID;
import java.util.*;

/**
 *
 * @author Sravya Sree Ogirala
 */
public class Vaccine {
    VaccineInventory vaccineInventory;
    String vaccineUUID;
    String vaccineName;
    ZonedDateTime mfgDate;
    //ZonedDateTime expDate; // keep exp date later
    

    //to avoid anyone from creating vaccine objects anywhere else.
    // vaccine objects can be created only through Vaccine Inventory
    protected Vaccine(String vaccineName) {
       // Faker f = new Faker();
        this.vaccineInventory = vaccineInventory;
        this.vaccineUUID = UUID.randomUUID().toString();
        this.vaccineName = "GlaxoSmithKline"; //vaccine name to be decided later f.medical().medicineName();  
        this.mfgDate = ZonedDateTime.now();    //displays current date as mfg date
        //this.expDate = ZonedDateTime.now() + ti   //displayes (mfg date + 90 days)
    }
    
     /*
    * Override the toString method to get a meaningful response upon printing the string.
    */
         @Override
    public String toString(){
        return  " " + vaccineName + "--" + vaccineUUID;
               
               
    }


}
