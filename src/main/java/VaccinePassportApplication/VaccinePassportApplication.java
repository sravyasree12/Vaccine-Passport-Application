/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VaccinePassportApplication;

import Management.Management;
import MedicalPersonnel.NurseDirectory;
import MedicalPersonnel.NurseProfile;
import PatientManagement.PatientDirectory;
import PatientManagement.PatientProfile;

import VaccineManagement.Address;
import VaccineManagement.Vaccine;
import VaccineManagement.VaccineCenter;
import VaccineManagement.VaccineInventory;
import com.github.javafaker.Faker;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 *
* @author Sravya Sree Ogirala
 */
public class VaccinePassportApplication {

    public static void main(String[] args) { 
     Faker f = new Faker(); 
     Random random = new Random();
     
     
     Management management = new Management();
    HashMap<ZonedDateTime, PatientProfile> slotBookingMap = new HashMap<ZonedDateTime, PatientProfile>();

    //profiles
    for (int i=0; i<=30; i++){
         //vaccine centers with address
       management.getVaccineInventory().addVaccineCenter(f.medical().hospitalName(), f.address().fullAddress()); 
    }  
     
    //list of vaccine centers
    List<VaccineCenter> vcList = management.getVaccineInventory().listOfVaccineCenters;

    for (int i =0; i<=30; i++){
         // patient name and address
        String address = f.address().fullAddress();
         String name = f.name().fullName();
        management.getPatientDirectory().newPatientProfile(name, address); 
        VaccineCenter vc = vcList.get(random.nextInt(vcList.size()));
        NurseDirectory nd = management.getNurseDirectory();
        nd.addNurse(name, vc); //nurse name 
     }  
     
     //ArrayLists
     for (int i =0; i<=50; i++){
       ArrayList<Vaccine> listOfVaccines = management.getVaccineInventory().getListOfVaccines(); //list of vaccines
       ArrayList<VaccineCenter> listOfVaccineCenters = management.getVaccineInventory().getListOfVaccineCenters(); //list of vaccine centers
       ArrayList<PatientProfile> listOfPatientProfiles = management.getPatientDirectory().getListOfPatientProfiles(); // list of patients
       ArrayList<NurseProfile> listOfNurseProfiles = management.getNurseDirectory().getListOfNurseProfiles(); //list of nurses
       
     }
//      //finish later
//     for(Vaccine vaccine: management.getVaccineInventory().getListOfVaccines()){
//         VaccineInventory vi = new VaccineInventory();
//         vi.manufactureVaccine("AstraZeneca"); //change vaccine name later
//          for(int i=0; i<20 ;i++){
//             
//             }
//         }
     
         //vaccine inventory 
            System.out.println("\t\tVaccine Inventory:\t");
            int x;
           for(x = 0; x < 2; x++){
               VaccineInventory vaccineInventory = management.getVaccineInventory();
              // Vaccine vaccine = vaccineInventory.manufactureVaccine().get(x);
               System.out.println(vaccineInventory);
               x++;
           }
     
          // vaccine centers details
          System.out.println("Vaccine Centers:\n");
            int j;
           for(j = 0; j < 30; j++){
               VaccineInventory vaccineInventory = management.getVaccineInventory();
               VaccineCenter center = vaccineInventory.getListOfVaccineCenters().get(j);
               System.out.println(center);
               j ++; 
           }
           
           //nurses details
            System.out.println("Nurse profiles:\n");
            int i;
           for(i = 0; i < 10; i++){
               NurseDirectory nd = management.getNurseDirectory();
               NurseProfile np = nd.getListOfNurseProfiles().get(i);
               System.out.println(np);
               i ++;
           }
           
           //patient details with name, address and uuid along with initial vaccine status
           System.out.println("\tPatient Details:\t");
            int y;
           for(y = 0; y < 100; y++){
              PatientDirectory pdirec = management.getPatientDirectory();
               PatientProfile pdetails = pdirec.getListOfPatientProfiles().get(y);
               System.out.println(pdetails);
               y++;
           }
           
           
           //after vaccination, display patient vaccine certificate
           
           
           
     }
      
       
     
     
    
}
