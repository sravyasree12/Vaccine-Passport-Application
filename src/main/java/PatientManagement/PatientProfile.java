/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagement;

import MedicalPersonnel.NurseProfile;
import VaccineManagement.Address;
import VaccineManagement.Vaccine;
import java.util.ArrayList;
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
    Address address;  
    String insuranceID;
    public boolean isVaccinated;
    ArrayList<PatientHistory> listOfPatientHistory;
    
    
    public PatientProfile(String name, Address address) {
        
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.mobileNumber = mobileNumber;
        this.emailAddress = emailAddress;
        this.insuranceID = insuranceID;
        this.isVaccinated = false;

        this.patientUUID = UUID.randomUUID().toString();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPatientUUID() {
        return patientUUID;
    }

    public void setPatientUUID(String patientUUID) {
        this.patientUUID = patientUUID;
    }
    
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getInsuranceID() {
        return insuranceID;
    }

    public void setInsuranceID(String insuranceID) {
        this.insuranceID = insuranceID;
    }
    
  //this method determines the medical eligibility of the patient for vaccine.
    public boolean isPatientEligibleForVaccine(PatientHistory ph){
        if((age > 16) && 
                (ph.getRespiratoryRate() > 12 && ph.getRespiratoryRate() < 20) &&
                (ph.getHeartRate() > 55 && ph.getHeartRate() < 105) &&
                (ph.getSystolicBloodPressure() > 110 && ph.getSystolicBloodPressure() < 120)){
            System.out.println("Patient is Eligible for vaccine");
        }  
        return true;         
    }
   
  //determines if patient initially is vaccinated or not 
    public boolean isPatientVaccinated(){
        return isVaccinated;  
    }

}
