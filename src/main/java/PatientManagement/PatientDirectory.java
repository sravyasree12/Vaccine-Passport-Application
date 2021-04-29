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
    ArrayList<PatientProfile> listOfPatientProfiles;
    
    public PatientDirectory(){
        this.listOfPatientProfiles = new ArrayList<>();
    }
    
    /**
     * "newPatientProfile" method creates Patients profiles and adds it to "listOfPatientProfiles" ArrayList 
     * @param address from Address
     * @return PatientProfile with patient details
     */
    
    public PatientProfile newPatientProfile(String name, String address){
        PatientProfile pp = new PatientProfile(name, address);
        getListOfPatientProfiles().add(pp);
        return pp;
    }
    
    public ArrayList<PatientProfile> getListOfPatientProfiles() {
        return listOfPatientProfiles;
    }

}
