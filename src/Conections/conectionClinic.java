package Conections;

/**
 *
 * @author kevin
 */

import clinicLibrary.Clinic;
import java.util.ArrayList;

public class conectionClinic {
    
    // EL ARREGLO HAY QUE CAMBIARLE EL TIPO A CLINIC
    private static ArrayList <String> allClinics = new ArrayList<>();
    
    public static void saveClinic(Clinic pClinic){}
    
    public static ArrayList<String> getClinics()
    {
        allClinics.add("CLINICAS");
        
        return allClinics;
    }
}
