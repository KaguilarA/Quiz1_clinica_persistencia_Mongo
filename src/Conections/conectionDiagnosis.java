package Conections;

/**
 *
 * @author kevin
 */

import clinicLibrary.Diagnosis;
import java.io.*;
import java.util.ArrayList;

public class conectionDiagnosis {
    
    static PrintStream out = System.out;
    // EL ARREGLO HAY QUE CAMBIARLE EL TIPO A DIAGNOSIS
    private static ArrayList <String> allDiagnosis = new ArrayList<>();
    
    public static ArrayList <String> registerNewCDiagnosisOnDB(Diagnosis pDiagnosis)
    {
        try{
            // va la conexion con la DB y guarda todos los datos dentro de un arrayList :)
            allDiagnosis.add("Diagnosticos");

            }catch(Exception e){
                out.println("Error de conexion" + e);
            }

        return allDiagnosis;
    
    }
    
    public static ArrayList getAllDiagnosisFromDB()
    {
        try{
            // va la conexion con la DB y guarda todos los datos dentro de un arrayList :)
        }catch(Exception e){
            out.println("Error de conexion" + e);
        }
        
        return allDiagnosis;
    }
    
    public static boolean modifyDiagnosis(Diagnosis pDiagnosis)
    {
        boolean validation = true;
        allDiagnosis.add("DIAGNOSTICOS");
        
        return validation;
    }
}
