package Managers;

/**
 *
 * @author Becky
 */

import java.io.*;
import clinicLibrary.Clinic;
import Conections.conectionClinic;
import java.util.ArrayList;

public class managerClinic {
    
    static PrintStream out = System.out;
    // EL ARREGLO HAY QUE CAMBIARLE EL TIPO A CLINIC
    static ArrayList <String> allClinics = new ArrayList<>();
    
    public static boolean registerClinic (String pid, String pname, 
            String paddress, int pphone)
    {
        boolean validation;
        
        Clinic newClinic = new Clinic(pid, pname, paddress, pphone);
        
        try{
            conectionClinic.registerNewClinicOnDB(newClinic);
            validation = true;
        }catch(Exception e){
            out.println("Error de gestion" + e);
            validation = false;
        }
        
        
        return validation;
    }
    
    public static void getClinics ()
    {
        try{
            allClinics = conectionClinic.getAllClinicsFromDB();
        }catch(Exception e){
            out.println("Error de gestion" + e);
        }
    }
    
    public static boolean modifyClinic (String pid, String pname, 
            String paddress, int pphone)
    {
        boolean validation;
        
        Clinic newClinic = new Clinic(pid, pname, paddress, pphone);
        
        try{
            conectionClinic.modifyClinic(newClinic);
            validation = true;
        }catch(Exception e){
            out.println("Error de gestion" + e);
            validation = false;
        }
        
        
        return validation;
    }
}
