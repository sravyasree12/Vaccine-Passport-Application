/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MedicalPersonnel;

import PatientManagement.PatientProfile;
import VaccineManagement.Vaccine;
import VaccineManagement.VaccineInventory;
import java.util.HashMap;
import java.util.UUID;
import java.util.*;

/**
 *
* @author Sravya Sree Ogirala
 */
public class NurseProfile {
    String name;
    String employeeID;
    HashMap<PatientProfile, Vaccine> vaccinePatientMap;
    //HashMap<NurseProfile, patientVaccineDetails> nurseVaccinationRecord; // create later when required

    
    //the constructor has been made protected to avoid object creation elsewhere 
    public NurseProfile(String name) {
      this.name = name;
      this.employeeID = UUID.randomUUID().toString();
      vaccinePatientMap = new HashMap<PatientProfile,Vaccine>();
     //System.out.println("Error: Not allowed to create Nurse objects here.");
    }
    
    //method adds which patient got which vaccine details to a hashmap
     public void addVaccineRecord(PatientProfile pDetails, Vaccine vDetails){
       vaccinePatientMap.put(pDetails, vDetails);
    }
    
    //this method will update the vaccine record of patient
    public void updateVaccineStatus(PatientProfile pDetails, Vaccine vDetails){
         vaccinePatientMap.put(pDetails, vDetails);
          pDetails.isVaccinated = true;
    }
    
    @Override
    public String toString(){
        return  "Name: " + name + "\n" + "EmpID: " + employeeID ;
               
                
    }
   
}
