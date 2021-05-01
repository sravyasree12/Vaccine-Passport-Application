/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Certification;

import PatientManagement.PatientProfile;
import VaccineManagement.Vaccine;
import VaccineManagement.VaccineCenter;
import java.io.Serializable;
import java.lang.Object;
import java.security.cert.Certificate;
import java.time.ZonedDateTime;
import java.util.HashMap;
/**
 *
* @author Sravya Sree Ogirala
 */

//Certificate issued to the vaccinated person which is valid globally.
public class VaccineCertificate {
    public static HashMap<PatientProfile, String> vaccinePatientMap = new HashMap<PatientProfile, String>();

    /**
    * Certificate issued to the vaccinated person which is valid globally.
    * "printPatientCertificate" method takes PatientProfile input and prints vaccine certificate
    * @param PatientProfile
    * @return void
    */
    public static void printPatientCertificate(PatientProfile pp){
        System.out.println(
                "\n\t******VACCINE CERTIFICATE******\n" +
                "\tName:" + pp.getName() + 
                "\n\tID:" + pp.getPatientUUID() +
                "\n\tVaccine record:" + vaccinePatientMap.get(pp));
    }
}