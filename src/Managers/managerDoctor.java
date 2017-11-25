package Managers;

import clinicLibrary.Doctor;
import Conections.conectionDoctor;
/**
 *
 * @author Becky
 */
public class managerDoctor {
    
    public static boolean registerDoctor (String pdoctorCode, String pid, String pemail, String ppassword, String pname, String psecondname, String psurname, String psecondSurname, String paddress, int prol)
    {
        boolean validation;
        
        Doctor newDoctor = new Doctor(pdoctorCode, pid, pemail, ppassword, pname, psecondname, psurname, psecondSurname, paddress, prol);
        
        try{
            conectionDoctor.saveDoctorOnDB(newDoctor);
            validation = true;
        }catch(Exception e){
            validation = false;
        }
        
        
        return validation;
    }
}
