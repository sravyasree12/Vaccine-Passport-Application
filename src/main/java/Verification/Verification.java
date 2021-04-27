/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Verification;

import PatientManagement.PatientProfile;
import java.util.ArrayList;
import java.util.Random;

/**
 *
* @author Sravya Sree Ogirala
 */
public class Verification {
    String typeOfID;
    String idNumber;
    PatientProfile pDetails; //name of Patient

    public Verification(String typeOfID, String idNumber) {
        this.typeOfID = typeOfID;
        this.idNumber = idNumber;
    }
    
    //to verify if the patient is valid or not by checking government ID
    // implementation detail: the idea is i am randomly returning true 80% of the time and false 20% of the time.
    // in the real world, this method will be validated with a database of IDs which is out of scope for this assignment.
    public boolean isPatientIDValid(){
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
    
//    //to verify the authenticity of vaccine center
//    //check using vaccine center uuid
//    public boolean isVaccineCenterValid(){
//        ArrayList<UUID> vc = new ArrayList<UUID>();
//        
//        
//    }
//    
//    //to verify authenticity of vaccine
//    //check using vaccine uuid
//    public boolean isVaccineValid(){
//        
//    }
//    
//    //to verify authenticity of Nurse
//    //check using nurse employee ID
//    public boolean isNurseValid(){
//        
//    }
    
    
    
    
    
    
}
