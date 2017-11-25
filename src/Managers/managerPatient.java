package Managers;

import Conections.conectionPatient;
import clinicLibrary.Patient;
/**
 *
 * @author Becky
 */
public class managerPatient {
    
    public static boolean registerPatient (String pbloodType, String pid, String pemail, String ppassword, String pname, String psecondname, String psurname, String psecondSurname, String paddress, int prol)
    {
        boolean validation;
        
        Patient newPatient = new Patient(pbloodType, pid, pemail, ppassword, pname, psecondname, psurname, psecondSurname, paddress, prol);
        
        try{
            conectionPatient.savePatientOnDB(newPatient);
            validation = true;
        }catch(Exception e){
            validation = false;
        }
        
        
        return validation;
    }
}
