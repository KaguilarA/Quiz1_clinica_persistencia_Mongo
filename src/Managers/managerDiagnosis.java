package Managers;

import java.io.*;
import java.util.ArrayList;
import Conections.conectionDiagnosis;
import clinicLibrary.Diagnosis;

/**
 *
 * @author Becky
 */
public class managerDiagnosis {
    
    static PrintStream out = System.out;
    // EL ARREGLO HAY QUE CAMBIARLE EL TIPO A DIAGNOSIS
    static ArrayList <String> allDiagnosis = new ArrayList<>();
    
    public static boolean registerDiagnosis (String pid, String pname, String pdescription)
    {
        boolean validation;
        
        Diagnosis newDiagnosis = new Diagnosis(pid, pname, pdescription);
        
        try{
            conectionDiagnosis.registerNewCDiagnosisOnDB(newDiagnosis);
            validation = true;
        }catch(Exception e){
            validation = false;
            out.println("Error de gestion" + e);
        }
        
        return validation;
    }
    
    public static void getDiagnosis ()
    {
        try{
            allDiagnosis = conectionDiagnosis.getAllDiagnosisFromDB();
        }catch(Exception e){
            out.println("Error de gestion" + e);
        }
    }
    
     public static boolean modifyDiagnosis (String pid, String pname, String pdescription)
    {
        boolean validation;
        
        Diagnosis newDiagnosis = new Diagnosis(pid, pname, pdescription);
        
        try{
            conectionDiagnosis.modifyDiagnosis(newDiagnosis);
            validation = true;
        }catch(Exception e){
            validation = false;
            out.println("Error de gestion" + e);
        }
        
        return validation;
    }
}
