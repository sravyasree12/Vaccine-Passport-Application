/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VaccineManagement;

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
    

    //to avoid anyone from creating vaccine objects anywhere else.
    protected Vaccine(String vaccineName) {
       
        this.vaccineUUID = UUID.randomUUID().toString();
        this.vaccineName = vaccineName;
        this.mfgDate = ZonedDateTime.now();    //displays current date as mfg date
        //this.expDate = ZonedDateTime.now() + ti   //displayes (mfg date + 90 days)
    }


}
