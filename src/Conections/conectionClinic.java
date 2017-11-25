package Conections;

/**
 *
 * @author kevin
 */

import clinicLibrary.Clinic;
import java.io.*;
import java.util.ArrayList;

public class conectionClinic {
    
    static PrintStream out = System.out;
    // EL ARREGLO HAY QUE CAMBIARLE EL TIPO A CLINIC
    private static ArrayList <String> allClinics = new ArrayList<>();
    
    public static boolean registerNewClinicOnDB(Clinic pClinic)
    {   
        boolean validation = true;
        allClinics.add("CLINICAS");
        
        return validation;
    }
    
    public static ArrayList getAllClinicsFromDB()
    {
        try{
            // va la conexion con la DB y guarda todos los datos dentro de un arrayList :)
        }catch(Exception e){
            out.println("Error de conexion" + e);
        }
        
        return allClinics;
    }
    
    public static boolean modifyClinic(Clinic pClinic){
        boolean validation = true;
        allClinics.add("CLINICAS");
        
        return validation;
    }
}
