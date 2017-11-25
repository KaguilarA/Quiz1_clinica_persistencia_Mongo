package Conections;

import clinicLibrary.Doctor;
import java.io.PrintStream;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Becky
 */
public class conectionDoctor {
    
    static PrintStream out = System.out;
    private static ArrayList <String> allDoctors = new ArrayList<>();
    
    public static boolean saveDoctorOnDB(Doctor pDoctor){
    
        boolean validation = true;
        allDoctors.add("DOCTORES");
        
        return validation;
    }
    
    public static ArrayList getAllDoctorsFromDB(){
        
        try{
        // va conexion con DB y guarda todos los datos dentro de un arrayList
        }catch(Exception e){
            out.println("Error de conexión" + e);
        }
        return allDoctors;
    }
    
    public static boolean modifyDoctor(Doctor pDoctor){
        boolean validation = true;
        allDoctors.add("DOCTORS");
        
        return validation;
    }
}
