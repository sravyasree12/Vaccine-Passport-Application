/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Certification;

import PatientManagement.PatientProfile;
import VaccineManagement.Vaccine;
import VaccineManagement.VaccineCenter;
import java.io.Serializable;
import java.lang.Object;
import java.security.cert.Certificate;
import java.time.ZonedDateTime;
/**
 *
* @author Sravya Sree Ogirala
 */

//Certificate issued to the vaccinated person which is valid globally.
public abstract class VaccineCertificate {
    PatientProfile pDetails;
    Vaccine vDetails;
    VaccineCenter vcDetails;
    ZonedDateTime dateAndTime;
   
    public VaccineCertificate(
            PatientProfile pDetails, 
            Vaccine vDetails, 
            VaccineCenter vcDetails, 
            ZonedDateTime dateAndTime) {
        this.pDetails = pDetails;
        this.vDetails = vDetails;
        this.vcDetails = vcDetails;
        this.dateAndTime = dateAndTime;
    }

  
    
    
    
    
    
}
