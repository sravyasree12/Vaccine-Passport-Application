/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VaccineManagement;

import Management.Management;
import PatientManagement.PatientProfile;
import java.util.ArrayList;

/**
 *
 * @author sravy
 */
public class VaccineCenterDirectory {
    Management management;
    ArrayList<VaccineCenter> listOfVaccineCenters; //list of vaccine centers
    
    public VaccineCenterDirectory(Management management){
        this.management = management;
    }
    
    public VaccineCenter newVaccineCenter(String vaccineCenterName, Address vaccineCenterAddress){
        VaccineCenter center = new VaccineCenter(vaccineCenterName, vaccineCenterAddress);
        listOfVaccineCenters.add(center);
        return center;
    }
    
}
