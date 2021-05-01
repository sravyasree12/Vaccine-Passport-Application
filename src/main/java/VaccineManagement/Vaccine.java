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
    String vaccineUUID;
    String vaccineName;
    ZonedDateTime mfgDate;
    //ZonedDateTime expDate; // keep exp date later
    
    /**
     * Protected constructor is used to prevent illegal vaccine manufacture elsewhere.
     * Thus, vaccine objects can be created only through Vaccine Inventory.
     * @param vaccineName 
     */
    protected Vaccine(String vaccineName){
        this.vaccineUUID = UUID.randomUUID().toString();
        this.vaccineName = vaccineName; 
        //displays current date as mfg date
        this.mfgDate = ZonedDateTime.now();    
        //this.expDate = ZonedDateTime.now() + ti   //displayes (mfg date + 90 days)
    }
    
    /**
    * Override the toString method to get a meaningful response upon printing the string.
    */
    @Override
    public String toString(){
        return  "Vaccine Name:" + vaccineName + 
                "Vaccine UUID:" + vaccineUUID +
                "Mfg Date:" + mfgDate;          
    }


}
