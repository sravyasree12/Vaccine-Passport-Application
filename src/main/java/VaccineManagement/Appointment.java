/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VaccineManagement;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Sravya Sree Ogirala
 */

public class Appointment {
    public HashMap<VaccineCenter, ArrayList<ZonedDateTime>> allSlotsMap;
   
    public Appointment(){
        this.allSlotsMap = new HashMap<VaccineCenter, ArrayList<ZonedDateTime>>();
    }
    
    /**
     * "displayAllSlotsMap" method displays all the vaccine slots in vaccine center
     * @param listOfVaccineCenters from List<VaccineCenter>
     * @return HashMap<VaccineCenter, ArrayList<ZonedDateTime>>
     */
   
    public HashMap<VaccineCenter, ArrayList<ZonedDateTime>> displayAllSlotsMap(List<VaccineCenter> listOfVaccineCenters){
        for(VaccineCenter vc: listOfVaccineCenters){
            allSlotsMap.put(vc, vc.getListOfSlots());
        }   
        return allSlotsMap;
    }  
}
