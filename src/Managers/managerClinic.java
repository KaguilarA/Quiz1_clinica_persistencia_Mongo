package Managers;

/**
 *
 * @author Becky
 */

import clinicLibrary.Clinic;
import Conections.conectionClinic;

public class managerClinic {
    
    public static boolean registerClinic (String pid, String pname, 
            String paddress, int pphone)
    {
        boolean validation;
        
        Clinic newClinic = new Clinic(pid, pname, paddress, pphone);
        
        try{
            conectionClinic.saveClinic(newClinic);
            validation = true;
        }catch(Exception e){
            validation = false;
        }
        
        
        return validation;
    }
    
}
