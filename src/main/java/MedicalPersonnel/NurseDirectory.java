/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MedicalPersonnel;

import Management.Management;
import VaccineManagement.Vaccine;
import VaccineManagement.VaccineCenter;
import java.util.ArrayList;

/**
 *
 * @author sravy
 */
public class NurseDirectory {
   
     Management management;
     ArrayList<NurseProfile> listOfNurseProfiles;
    
    public NurseDirectory(Management management){
        this.management = management;
    }
    
    public NurseProfile newNurseProfile(String name){
        NurseProfile nurse = new NurseProfile(name);
        listOfNurseProfiles.add(nurse);
        return nurse;
    }
  
}
