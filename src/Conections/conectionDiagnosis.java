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
    private static ArrayList <String> allDiagnosis = new ArrayList<>();
    
    public static ArrayList <String> saveDiagnosis(Diagnosis pDiagnosis)
    {
        try{
            // va la conexion con la DB y guarda todos los datos dentro de un arrayList :)
            allDiagnosis.add("Diagnosticos");

            }catch(Exception e){
                out.println("Error de conexion" + e);
            }

        return allDiagnosis;
    
    }
}
