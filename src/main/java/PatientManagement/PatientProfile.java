/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagement;

import MedicalPersonnel.NurseProfile;
import VaccineManagement.Address;
import VaccineManagement.Vaccine;
import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

/**
 *
 * @author Sravya Sree Ogirala
 */
enum Gender {
  MALE, 
  FEMALE;
}

public class PatientProfile {
    String name;
    int age;
    String patientUUID;
    Gender gender;
    long mobileNumber;
    String emailAddress;
    String address;  
    String insuranceID;
    public boolean isVaccinated;
    ArrayList<PatientHistory> listOfPatientHistory;
    String patientVaccineRecordID;
    
    public PatientProfile(String name,String address) {
        Faker f = new Faker();
        this.name = name;
        this.address = address;
        this.age = age;
        this.gender = Gender.MALE;
        this.mobileNumber = mobileNumber;
        this.emailAddress = emailAddress;
        //this.insuranceID = f.finance().creditCard();
        this.isVaccinated = false;
        this.patientVaccineRecordID = patientVaccineRecordID;         
        this.patientUUID = UUID.randomUUID().toString();
    }
     /**
      * "isPatientEligibleForVaccine" method determines the medical eligibility of the patient for vaccine.
      * @return Boolean true: when eligible for vaccine (medically fit to receive vaccine)
      *                 false: when ineligible for vaccine (medically unfit to receive vaccine)
      */
     
    public boolean isPatientEligibleForVaccine(){
        PatientHistory ph = getListOfPatientHistory().get(listOfPatientHistory.size() - 1);
        if((age > 16) && 
                (ph.getRespiratoryRate() > 12 && ph.getRespiratoryRate() < 20) &&
                (ph.getHeartRate() > 55 && ph.getHeartRate() < 105) &&
                (ph.getSystolicBloodPressure() > 110 && ph.getSystolicBloodPressure() < 120)){
            System.out.println("Patient is Eligible for vaccine");
        }  
        return true;         
    }
    
     
    /**
     * "isPatientVaccinated" method determines if patient initially is vaccinated or not
     * @return Boolean true: previously vaccinated
     *                 false: not vaccinated previously  
     */
  // 
    public boolean isPatientVaccinated(){
        return isVaccinated;  
    }

    public ArrayList<PatientHistory> getListOfPatientHistory() {
        return listOfPatientHistory;
    }

    public String getPatientVaccineRecordID() {
        return patientVaccineRecordID;
    }

    public void setPatientVaccineRecordID(String patientVaccineRecordID) {
        this.patientVaccineRecordID = patientVaccineRecordID;
        
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPatientUUID() {
        return patientUUID;
    }
    
    
    
    
     /*
    * Override the toString method to get a meaningful response upon printing the string.
    */
     @Override
    public String toString(){
        return  "Name:" + name + 
                "\n\tUUID:" + patientUUID +
                "\n\tAddress:" + address + 
                "\n\tVaccine Status:" + isVaccinated +
                "\n\tEligible for vaccine:" + isPatientEligibleForVaccine();

}
}
