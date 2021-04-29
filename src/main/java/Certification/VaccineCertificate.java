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
import java.util.HashMap;
/**
 *
* @author Sravya Sree Ogirala
 */

//Certificate issued to the vaccinated person which is valid globally.
public class VaccineCertificate {
    public HashMap<PatientProfile, String> vaccinePatientMap;
    
    
    //takes key input and returns value output
    public void printPatientCertificate(PatientProfile pp){
        System.out.println(
                "****VACCINE PASSPORT****\n" +
                "Name:" + pp.getName() + 
                "\n\tID:" + pp.getPatientUUID() +
                "\n\tAge:" + pp.getAge() +
                "\n\tVaccine record:" + vaccinePatientMap.get(pp)
        );
    }
}