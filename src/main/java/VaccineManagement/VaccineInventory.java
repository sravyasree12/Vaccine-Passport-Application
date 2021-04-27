/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VaccineManagement;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

/**
 *
* @author Sravya Sree Ogirala
 */
public class VaccineInventory {
    //this is a catalog of vaccines
     /*
    to maintain a track of vaccine usage i.e to track no of vaccines used, 
    no of vaccines distributed to each vaccine center.
     */ 
    public static long totalNumberOfVaccines = 0;
    public static long numberOfVaccinesUsed;
    ArrayList<String> listOfVaccines;

    //method to create vaccines to the inventory
    public Vaccine manufactureVaccine(String vaccineName){ 
       totalNumberOfVaccines += 1;
       Vaccine v = new Vaccine(vaccineName);
       return v;
    }
    
    //method to add vaccine centers to vaccine inventory
    public VaccineCenter addVaccineCenter(String vaccineCenterName, Address vaccineCenterAddress){   
        VaccineCenter center = new VaccineCenter(vaccineCenterName, vaccineCenterAddress);
        return center; 
      }

    public long getTotalNumberOfVaccines() {
        return totalNumberOfVaccines;
    }

    public void setTotalNumberOfVaccines(long totalNumberOfVaccines) {
        this.totalNumberOfVaccines = totalNumberOfVaccines;
    }
    
    public long getNumberOfVaccinesUsed() {
        return numberOfVaccinesUsed;
    }

    public void setNumberOfVaccinesUsed(long numberOfVaccinesUsed) {
        this.numberOfVaccinesUsed = numberOfVaccinesUsed;
    }
    
    
    
    
}
