/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;

import MedicalPersonnel.NurseDirectory;
import PatientManagement.PatientDirectory;
import VaccineManagement.VaccineInventory;

/**
 *
 * @author sravy
 */
public class Management {
    String managementName;
    private NurseDirectory nurseDirectory;
    private PatientDirectory patientDirectory;
    private VaccineInventory vaccineInventory;
    
    public Management(){
        this.managementName = managementName;
        nurseDirectory = new NurseDirectory();
        patientDirectory = new PatientDirectory();
        vaccineInventory = new VaccineInventory();
    }

    public String getManagementName() {
        return managementName;
    }

    public NurseDirectory getNurseDirectory() {
        return nurseDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }
    
    public VaccineInventory getVaccineInventory(){
        return vaccineInventory;
    }
   
    
    
    
}
