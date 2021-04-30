/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VaccinePassportApplication;

import Certification.VaccineCertificate;
import Management.Management;
import MedicalPersonnel.NurseDirectory;
import MedicalPersonnel.NurseProfile;
import PatientManagement.PatientDirectory;
import PatientManagement.PatientHistory;
import PatientManagement.PatientProfile;

import VaccineManagement.Address;
import VaccineManagement.Vaccine;
import VaccineManagement.VaccineCenter;
import VaccineManagement.VaccineInventory;
import Verify.Verification;
import com.github.javafaker.Faker;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 *
* @author Sravya Sree Ogirala
 */
public class VaccinePassportApplication {

    public static void main(String[] args) { 
     Faker f = new Faker(); 
     Random random = new Random();
     
     Management management = new Management();
     
     //creating vaccines
     for(int b=0; b<=1000; b++){
         Vaccine vaccine = management.getVaccineInventory().manufactureVaccine("AstraZeneca");
     }

    System.out.println("\n\tVaccine Centers:\t");
    for (int i=0; i<=10; i++){
    //vaccine centers with address
       VaccineCenter vc = management.getVaccineInventory().addVaccineCenter(f.medical().hospitalName(), f.address().fullAddress()); 
       management.getVaccineInventory().assignVaccineToVaccineCenter(vc, 100);
       System.out.println(vc);
    }  
     
    //list of vaccine centers
    List<VaccineCenter> vcList = management.getVaccineInventory().listOfVaccineCenters;
    
    
    // creating 15 patients
    for(int i=0; i<15; i++){
        String address = f.address().fullAddress();
        String name = f.name().fullName();
        PatientProfile pp = management.getPatientDirectory().newPatientProfile(name, address);
        pp.addPatientHistory(random.nextInt(), random.nextInt(), random.nextInt());
        pp.addPatientHistory(random.nextInt(), random.nextInt(), random.nextInt());
        System.out.println("\nPatient Details:");
        System.out.println(pp);
    }
    
    
    NurseDirectory nd = management.getNurseDirectory();
    for (int b =0; b<=100; b++){
        System.out.println("\nNurse Details:");
        VaccineCenter vc = vcList.get(random.nextInt(vcList.size()));
        //nurse details
        String name1 = f.name().fullName();
        System.out.println(nd.addNurse(name1, vc)); 
        //nd.addNurse(name1, vc);
    }
    
    ZonedDateTime date = ZonedDateTime.now();
    VaccineCenter vc = vcList.get(random.nextInt(vcList.size()));
    //schedule appointment

    for(PatientProfile pp1 : management.getPatientDirectory().getListOfPatientProfiles()){
        
        pp1.scheduleVaccineAppointment(date, vc);
        NurseProfile nurse = vc.getListOfAssignedNurses().get(random.nextInt(10));
        nurse.updateVaccineStatus(pp1, vc);
        //prints vaccine certificate
        VaccineCertificate.printPatientCertificate(pp1);
    }
        
        //verifying the certificate
        for(PatientProfile pp1 : management.getPatientDirectory().getListOfPatientProfiles()){
            if(pp1.isVaccinated == true){
                Verification.verifiyVaccineCertificate(pp1);
            }
        }
        
        PatientProfile fakePerson = new PatientProfile("Fake Sravya", "Fake University");
        fakePerson.setPatientVaccineRecordID("This is a fake value to cheat the system");
       
        System.out.println(fakePerson.getPatientVaccineRecordID());
        
        Verification.verifiyVaccineCertificate(fakePerson);
        
        
  }
}
     
           
           
           
           
     
      
       
     
     
    

