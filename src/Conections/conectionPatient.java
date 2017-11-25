
package Conections;

import clinicLibrary.Patient;
import java.util.ArrayList;
import java.io.*;

/**
 *
 * @author Becky
 */
public class conectionPatient {
    
    static PrintStream out = System.out;
    private static ArrayList <String> allPatients = new ArrayList<>();
    
    public static boolean savePatientOnDB(Patient pDoctor){
    
        boolean validation = true;
        allPatients.add("PACIENTES");
        
        return validation;
    }
    
    public static ArrayList getAllPatientsFromDB()
    {
        try{
            // va la conexion con la DB y guarda todos los datos dentro de un arrayList :)
        }catch(Exception e){
            out.println("Error de conexion" + e);
        }
        
        return allPatients;
    }
    
    
    public static boolean modifyPatient(Patient pPatient){
        boolean validation = true;
        allPatients.add("CLINICAS");
        
        return validation;
    }
    
}
