/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagement;

import Management.Management;
import VaccineManagement.Address;
import java.util.ArrayList;

/**
 *
* @author Sravya Sree Ogirala
 */
public class PatientDirectory {
    Management management;
    ArrayList<PatientProfile> listOfPatientProfiles;
    
    public PatientDirectory(Management management){
        this.management = management;
    }
    
    public PatientProfile newPatientProfile(String name, Address address){
        PatientProfile pp = new PatientProfile(name, address);
        listOfPatientProfiles.add(pp);
        return pp;
    }

}
