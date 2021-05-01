/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MedicalPersonnel;

import PatientManagement.PatientProfile;
import Certification.VaccineCertificate;
import VaccineManagement.VaccineCenter;
import java.util.UUID;
import Verify.*;
/**
 *
 * @author Sravya Sree Ogirala
 */
public class NurseProfile {
    String name;
    String employeeID;
 
    /**
     *Protected constructor is used to prevent illegal nurse impersonation elsewhere.
     *Thus, nurse objects can be created only through Nurse Directory.
     */ 
    protected NurseProfile(String name) {
        this.name = name;
        this.employeeID = UUID.randomUUID().toString();
    }
    
    /** 
     * "addVaccineRecord" method adds the details of which patient got which vaccine 
     * to a HashMap "vaccinePatientMap"
     * @param pDetails from PatientProfile
     * @param name from String
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
        
        // adding to the certificate hash map
        VaccineCertificate.vaccinePatientMap.put(pDetails, vaccineRecordId);
        Verification.patientVaccineIDMap.put(pDetails, vaccineRecordId);
        
        //reducing the vaccine availability in the vaccine center
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
