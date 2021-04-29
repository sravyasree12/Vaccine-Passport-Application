/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VaccineManagement;

import Management.Management;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 *
* @author Sravya Sree Ogirala
 */

 //this is a catalog of vaccines
     /*
    to maintain a track of vaccine usage i.e to track no of vaccines used, 
    no of vaccines distributed to each vaccine center.
     */ 
    //maintains list of vaccine centers
    //acts like vaccine catalog and maintains list of vaccines
 public class VaccineInventory {
      public static long totalNumberOfVaccines = 0;
      public static long numberOfVaccinesUsed;
      public ArrayList<VaccineCenter> listOfVaccineCenters; //list of vaccine centers
      public ArrayList<Vaccine> listOfVaccines; //vaccine catalog
     
     public VaccineInventory(){
       listOfVaccineCenters = new ArrayList<VaccineCenter>();
       listOfVaccines = new ArrayList<Vaccine>();
      }
  
    //method to create vaccines and add to the inventory
     public Vaccine manufactureVaccine(String vaccineName){ 
       totalNumberOfVaccines += 1;
       Vaccine vaccine = new Vaccine(vaccineName);
       getListOfVaccines().add(vaccine);
       return vaccine;
     }

    //method to add vaccine centers to vaccine inventory
     public VaccineCenter addVaccineCenter(String vaccineCenterName, String vaccineCenterAddress){   
        VaccineCenter center = new VaccineCenter(vaccineCenterName, vaccineCenterAddress);
         listOfVaccineCenters.add(center);
        return center; 
      }
    
     public ArrayList<VaccineCenter> getListOfVaccineCenters() {
        return listOfVaccineCenters;
    }
     
     public ArrayList<Vaccine> getListOfVaccines(){
         return listOfVaccines;
     }
}
