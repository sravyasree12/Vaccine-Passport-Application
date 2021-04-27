/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VaccinePassportApplication;

import Management.Management;
import MedicalPersonnel.NurseProfile;
import PatientManagement.PatientProfile;
import VaccineManagement.Address;
import VaccineManagement.Vaccine;
import VaccineManagement.VaccineCenter;
import VaccineManagement.VaccineCenterDirectory;
import VaccineManagement.VaccineInventory;
import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 *
* @author Sravya Sree Ogirala
 */
public class VaccinePassportApplication {

    public static void main(String[] args) { 
     Faker f = new Faker(); 
     Random random = new Random();
     
     
     Management management = new Management("Simpson's Management");
    Address address = new Address(f.address().streetAddress());
    Address address2 = new Address(f.address().buildingNumber());
      
     
     
     //vaccine centers with address
     for (int i =0; i<=5; i++){
       management.getVaccineCenterDirectory().newVaccineCenter(f.medical().hospitalName(), address2);
       management.getPatientDirectory().newPatientProfile(f.name().fullName(), address);
       management.getNurseDirectory().newNurseProfile(f.name().fullName());
         
     }
        
        
      
        
    }
    
}
