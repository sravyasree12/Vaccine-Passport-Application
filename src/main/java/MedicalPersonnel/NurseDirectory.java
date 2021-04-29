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
import java.util.List;
import java.util.Random;

/**
 *
 * @author sravy
 */
public class NurseDirectory {
 
    ArrayList<NurseProfile> listOfNurseProfiles;
    
    public NurseDirectory(){
        listOfNurseProfiles = new ArrayList<>();
    }
    
    /**
     * "addNurse" method adds new nurse to nurse directory. 
     * Upon creating this nurse, the nurse is randomly assigned to vaccine center.
     * Only by using this method we can create nurse objects.
     * This is done to avoid creation of fake nurse objects elsewhere.
     * 
     * @param name from String
     * @return NurseProfile
     */

    public NurseProfile addNurse(String name, VaccineCenter center){
        NurseProfile nurse = new NurseProfile(name);
        listOfNurseProfiles.add(nurse);
        List<NurseProfile> nurses = center.getListOfAssignedNurses();
        System.out.println(nurses);
        nurses.add(nurse);

        return nurse;
    }
    
    public ArrayList<NurseProfile> getListOfNurseProfiles() { 
        return listOfNurseProfiles;
    }
  
}
