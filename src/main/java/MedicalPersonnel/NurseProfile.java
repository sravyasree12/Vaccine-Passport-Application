/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MedicalPersonnel;

import PatientManagement.PatientProfile;
import VaccineManagement.Vaccine;
import VaccineManagement.VaccineInventory;
import Certification.VaccineCertificate;
import VaccineManagement.VaccineCenter;
import com.github.javafaker.Faker;
import java.util.HashMap;
import java.util.UUID;
import java.util.*;
import Verify.*;
/**
 *
 * @author Sravya Sree Ogirala
 */
public class NurseProfile {
    String name;
    String employeeID;
    
    //HashMap<NurseProfile, patientVaccineDetails> nurseVaccinationRecord; // create later when required

    
    /**
     * the constructor has been made protected to avoid object creation elsewhere 
     * Only through Vaccine directory, nurse objects can be created.
     * this has been done to protect the nurse object and avoid creation of fake nurse objects.
     */ 
     protected NurseProfile(String name) {
      this.name = name;
      this.employeeID = UUID.randomUUID().toString();
     
     //System.out.println("Error: Not allowed to create Nurse objects here.");
    }
    
    /** 
     * "addVaccineRecord" method adds the details of which patient got which vaccine to a HashMap "vaccinePatientMap"
     * 
     * @param pDetails of Patient are taken
     * @param vDetails of Vaccine are taken
     * @return void
     */
     public void addVaccineRecord(PatientProfile pDetails, String name){
       VaccineCertificate.vaccinePatientMap.put(pDetails, name);
    }
     
    /**
     * "updateVaccineStatus" method will update the vaccine record of patient.
     * <p>
     * After vaccination, vaccine status i.e true/false of patient is updated here.
     * Nurse randomly generates new vaccine ID against patient name and adds to HashMap "patientVaccineIDMap".
     * This is useful to verify in future to cross-check with patient vaccine history.
     * 
     * @param pDetails from PatientProfile
     * @param vDetails from Vaccine
     * @return void
     */
   
    public void updateVaccineStatus(PatientProfile pDetails, VaccineCenter vc){
        pDetails.isVaccinated = true;
        //generating vaccine ID for the vaccine which was given to patient
        String vaccineRecordId = UUID.randomUUID().toString();
        pDetails.setPatientVaccineRecordID(vaccineRecordId);
        
        // add to the certificate hash map
        VaccineCertificate.vaccinePatientMap.put(pDetails, vaccineRecordId);
        Verification.patientVaccineIDMap.put(pDetails, vaccineRecordId);
        
        //reduce the vaccine availability in the vaccine center
        vc.setVaccineAvailability(vc.getVaccineAvailability() - 1);
    }
    
    /*
    * Override the toString method to get a meaningful response upon printing the string.
    */
    @Override
    public String toString(){
        return  "Name: " + name + 
                "\nEmpID: " + employeeID +
                "\n";
                        
    }
   
}
