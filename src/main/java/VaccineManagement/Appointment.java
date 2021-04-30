/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VaccineManagement;

import VaccineManagement.*;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author sravy
 */

//to schedule appointments

public class Appointment {
   public HashMap<VaccineCenter, ArrayList<ZonedDateTime>> allSlotsMap;
   
   public Appointment(){
       this.allSlotsMap = new HashMap<VaccineCenter, ArrayList<ZonedDateTime>>();
   }
   
   public HashMap<VaccineCenter, ArrayList<ZonedDateTime>> displayAllSlotsMap(List<VaccineCenter> listOfVaccineCenters){
       for(VaccineCenter vc: listOfVaccineCenters){
           allSlotsMap.put(vc, vc.getListOfSlots());
       }
           
      return allSlotsMap;
   }
    
}
