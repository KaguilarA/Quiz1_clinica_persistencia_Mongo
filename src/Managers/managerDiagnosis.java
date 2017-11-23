package Managers;

import Conections.conectionDiagnosis;
import clinicLibrary.Diagnosis;

/**
 *
 * @author Becky
 */
public class managerDiagnosis {
    
    public static boolean registerPatient (String id, String name, String description)
    {
        boolean validation;
        
        Diagnosis newDiagnosis = new Diagnosis(id, name, description);
        
        try{
            conectionDiagnosis.saveDiagnosis(newDiagnosis);
            validation = true;
        }catch(Exception e){
            validation = false;
        }
        
        
        return validation;
    }
}
