/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VaccineManagement;

import java.util.ArrayList;

/**
 *
 * @author Sravya Sree Ogirala
 */

/**
 * Vaccine Inventory is responsible for manufacture of vaccines.
 * Maintains list of vaccine centers and adding vaccine centers.
/* Can maintain a track of vaccine usage i.e track no of vaccines used,
 * no of vaccines distributed to each vaccine center.
 */
public class VaccineInventory {

    public static long totalNumberOfVaccines = 0;
    public static long numberOfVaccinesUsed;
    public ArrayList<VaccineCenter> listOfVaccineCenters; //list of vaccine centers
    public ArrayList<Vaccine> listOfVaccines; //vaccine catalog

    public VaccineInventory() {
        this.listOfVaccineCenters = new ArrayList<VaccineCenter>();
        this.listOfVaccines = new ArrayList<Vaccine>();
    }
    
    /**
     * "manufactureVaccine" method used to create vaccines and add to the vaccine inventory
     * @param vaccineName from String
     * @return Vaccine
     */
    public Vaccine manufactureVaccine(String vaccineName) {
        totalNumberOfVaccines += 1;
        Vaccine vaccine = new Vaccine(vaccineName);
        getListOfVaccines().add(vaccine);
        return vaccine;
    }
    
    /**
     * "addVaccineCenter" method adds vaccine centers to ArrayList of vaccine centers
     * @param vaccineCenterName from String
     * @param vaccineCenterAddress from String
     * @return VaccineCenter
     */
    public VaccineCenter addVaccineCenter(String vaccineCenterName, String vaccineCenterAddress) {
        VaccineCenter center = new VaccineCenter(vaccineCenterName, vaccineCenterAddress);
        listOfVaccineCenters.add(center);
        // upon registering a center, some vaccines are assigned to it.
        assignVaccineToVaccineCenter(center);
        return center;
    }
    
    /**
     * "assignVaccineToVaccineCenter" method equally divides vaccines to each vaccine center.
     * @param vc from VaccineCenter
     * @return void
     */
    public void assignVaccineToVaccineCenter(VaccineCenter vc) {
        long count = totalNumberOfVaccines / listOfVaccineCenters.size();
        vc.setVaccineAvailability(count);
    }
    
    
    /**
     * "assignVaccineToVaccineCenter" method overloads the above method to directly take the count 
     * instead of calculating it.
     * @param vc from VaccineCenter
     * @param count from long
     */
    public void assignVaccineToVaccineCenter(VaccineCenter vc, long count) {
        if (count < totalNumberOfVaccines) {
            vc.setVaccineAvailability(count);
        } 
        else {
            System.out.println("Too many vaccines requested. Did not assign vaccines. total number of vaccines are: " + totalNumberOfVaccines);
        }
    }
    
    public ArrayList<VaccineCenter> getListOfVaccineCenters() {
        return listOfVaccineCenters;
    }
    
    public ArrayList<Vaccine> getListOfVaccines() {
        return listOfVaccines;
    }
}
