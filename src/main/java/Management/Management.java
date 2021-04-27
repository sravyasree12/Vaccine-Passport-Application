/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;

import MedicalPersonnel.NurseDirectory;
import PatientManagement.PatientDirectory;
import VaccineManagement.VaccineCenterDirectory;

/**
 *
 * @author sravy
 */
public class Management {
    String managementName;
    private NurseDirectory nurseDirectory;
    private VaccineCenterDirectory vaccineCenterDirectory;
    private PatientDirectory patientDirectory;
    
    public Management(String managementName){
        this.managementName = managementName;
        nurseDirectory = new NurseDirectory(this);
        vaccineCenterDirectory = new VaccineCenterDirectory(this);
        patientDirectory = new PatientDirectory(this);
    }

    public String getManagementName() {
        return managementName;
    }

    public NurseDirectory getNurseDirectory() {
        return nurseDirectory;
    }

    public VaccineCenterDirectory getVaccineCenterDirectory() {
        return vaccineCenterDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }
    
    
    
}
