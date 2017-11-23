package clinicLibrary;

/**
 *
 * @author kevin
 */

import java.io.*;
import com.mongodb.*;
import com.google.gson.*;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;

public class Manager {
    
    // Global variables
    static PrintStream out = System.out;
    private static ArrayList <Clinic> allClinics = new ArrayList<>();
    private static ArrayList <Diagnosis> allDiagnosis = new ArrayList<>();
    private static ArrayList <User> allUser = new ArrayList<>();
    
    // Database Variales
    protected static MongoClientURI uri  = 
            new MongoClientURI("mongodb://admin:teamweb@ds243055.mlab.com:43055/db_clinic");
    /**
     * Get Mongo data 
     * @param args
     * @throws Exception 
     */
    public static void main(String[] args) throws Exception
    {
        try
        { 
            // Credentials to MongoDB (Mlab)
            MongoClient client = new MongoClient(uri);
            DB db = client.getDB(uri.getDatabase());
            
            // Collections in DB
            DBCollection clinics = db.getCollection("Clinics");
            DBCollection users = db.getCollection("Users");
            DBCollection diagnosis = db.getCollection("Diagnosis");
            
            // Find all clinics and put into an arraylist
            DBCursor fclinic = clinics.find();
            
            try{
                while (fclinic.hasNext())
                {
                    DBObject list = fclinic.next();
                    out.println("Yo soy la lista de clinicas " + list);
                    
                    // Agregan al arraylist todos los datos de mongo
                    BasicDBObject clinicObj = (BasicDBObject) list;
                    String clinicName = clinicObj.getString("name");
                    String clinicId = clinicObj.getString("id");
                    String clinicAddress = clinicObj.getString("address");
                    int clinicPhone = Integer.parseInt(clinicObj.getString("phone"));
                    Clinic mongoClinic = new Clinic(clinicId,clinicName, clinicAddress, clinicPhone);
                    allClinics.add(mongoClinic);
                }
            } finally {
                fclinic.close();
            }
            
            out.println("MongoDB Conected");

        }catch(Exception e)
        {
            out.println(e.getMessage());
        }
        
        out.println("Server is ready");

    } 
    
    // Gets lists of data
    
    /**
     * Function to get clinics in system
     * @return List of clinics
     */
    public static String [] getClinicList()
    {
        
        int size = allClinics.size();
        String [] clinics = new String[size];
        int i = 0;
        
        for (Clinic tempClinic:allClinics)
        {
            clinics[i] = tempClinic.toString();
            i++;
        }
        
        return clinics;
    }
    
    /**
     * Function to register a new Clinic
     * @param pid
     * @param pname
     * @param paddress
     * @param pphone
     * @return validation
     */
    public static boolean registerClinic (String pid, String pname, 
            String paddress, int pphone) throws UnknownHostException
    {
        boolean validation;
        
        String id, name, address;
        int phone;
        
        id = "005";
        name= "Hospital de prueba";
        address = "Limon";
        
        phone = 12345678;
        
        Clinic newClinic = new Clinic(id, name, address, phone);
        
        try {
           
            // Creamos un objeto de tipo GSON
            Gson clinicGSON = new Gson();

            // Convertimos el objeto clinica en un JSON por medio de GSON
            String clinicJSON = clinicGSON.toJson(newClinic); 

            // Convertimos el JSON  un Obeto de Mongo BD (BSON)
            BasicDBObject basicDBObject = new BasicDBObject("Clinic", clinicJSON);

            // Abrimos la conexion con MongoDB y le enviamos el nuevo objeto
            MongoClient client = new MongoClient(uri);
            DB db = client.getDB(uri.getDatabase());
            DBCollection colleccionClinicas = db.getCollection("Clinics");
            colleccionClinicas.save(basicDBObject);

            validation = true;
     
        } catch(Exception e)
        {
            out.println(e.getMessage());
            
            validation = false;
        }
        
        
        return validation;
    }
}
