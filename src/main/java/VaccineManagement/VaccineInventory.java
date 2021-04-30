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
       this.listOfVaccineCenters = new ArrayList<VaccineCenter>();
       this.listOfVaccines = new ArrayList<Vaccine>();
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
         
         // upon registering a center, some vaccines are assigned to it.
         assignVaccineToVaccineCenter(center);
        return center; 
      }
     
     
     public void assignVaccineToVaccineCenter(VaccineCenter vc){
         // equally divide vaccines to each center
         long count = totalNumberOfVaccines/listOfVaccineCenters.size();
         vc.setVaccineAvailability(count);
     }

     // overload the above method to directly take the count instead of calculating
     public void assignVaccineToVaccineCenter(VaccineCenter vc, long count){
         if (count < totalNumberOfVaccines){
             vc.setVaccineAvailability(count);
         } else {
             System.out.println("Too many vaccines requested. Did not assign vaccines. total number of vaccines are: " + totalNumberOfVaccines);
         }
     }

     public ArrayList<VaccineCenter> getListOfVaccineCenters() {
        return listOfVaccineCenters;
    }
     
     public ArrayList<Vaccine> getListOfVaccines(){
         return listOfVaccines;
     }
}
