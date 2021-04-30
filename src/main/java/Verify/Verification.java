/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Verify;

import PatientManagement.PatientProfile;
import VaccineManagement.VaccineCenter;
import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 *
* @author Sravya Sree Ogirala
 */
public class Verification {
    String typeOfID;
    String idNumber;
    PatientProfile pDetails; 
    //VaccineCenter vCenter;
    //this HashMap maps the patient name and vaccine ID as Key,Value pair respectively to verify if the patient got vaccinated or not
    public static HashMap<PatientProfile, String> patientVaccineIDMap = new HashMap<PatientProfile, String>();

    public Verification(PatientProfile pDetails) {
      this.pDetails =  pDetails;
    }
    
    //to verify if the patient is valid or not by checking government ID
    // implementation detail: the idea is i am randomly returning true 80% of the time and false 20% of the time.
    // in the real world, this method will be validated with a database of IDs which is out of scope for this assignment.
    public static boolean isPatientIDValid(){
        ArrayList<Boolean> b = new ArrayList<Boolean>();
        b.add(Boolean.TRUE);
        b.add(Boolean.TRUE);
        b.add(Boolean.TRUE);
        b.add(Boolean.TRUE);
        b.add(Boolean.FALSE);
        //source for this line: https://www.geeksforgeeks.org/getting-random-elements-from-arraylist-in-java
        int index = (int)(Math.random() * b.size());
     
        if (b.get(index) == Boolean.TRUE){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    //verify vaccine certificate given to person whether it's genuine and valid or not
    //check if vaccinePatientMap and patient name match or not
    public static boolean verifiyVaccineCertificate(PatientProfile pp){
        if((patientVaccineIDMap.containsKey(pp)) && patientVaccineIDMap.get(pp).equals(pp.getPatientVaccineRecordID())){
            System.out.println("Certificate verification completed."); 
            return true;
        } else {
            System.out.println("Vaccine is not verified"); 
            return false;
        }
        
    }
    
    
    
    

}
