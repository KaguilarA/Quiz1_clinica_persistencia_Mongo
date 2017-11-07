package clinicLibrary;

/**
 *
 * @author kevin
 */

import java.io.*;
import com.mongodb.*;
import java.util.ArrayList;

public class Manager {
    
    // Global variables
    static PrintStream out = System.out;
    private static ArrayList <Clinic> allClinics = new ArrayList<>();
    private static ArrayList <Diagnosis> allDiagnosis = new ArrayList<>();
    private static ArrayList <User> allUser = new ArrayList<>();
    
    // Database Variales
    protected static MongoClientURI uri  = new MongoClientURI("mongodb://admin:teamweb@ds243055.mlab.com:43055/db_clinic");
    
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
            
            // Cursor de Usuarios
            DBCursor fuser = users.find();
            while (fuser.hasNext()) {
                DBObject list = fuser.next();
                out.println("Yo soy la lista de usuarios " + list);
                BasicDBObject userObj = (BasicDBObject) list;
                String userId = userObj.getString("id");
                String userName = userObj.getString("name");
                String userSecondName = userObj.getString("secondname");
                String userSurname = userObj.getString("surname");
                String userSeconSurname = userObj.getString("secondSurname");
                String userAddress = userObj.getString("address");
                String userEmail = userObj.getString("email");
                String userPassword = userObj.getString("password");
                int userRol = Integer.parseInt(userObj.getString("rol"));
                
                if (userRol == 1) 
                {
                    String doctorCode = userObj.getString("doctorCode");
                    Doctor mongoDoctor = new Doctor(doctorCode, userId, userEmail, userPassword, userName, userSecondName, userSurname, userSeconSurname, userAddress, userRol);
                    allUser.add(mongoDoctor);
                }
                else 
                {
                    String patientBloodType = userObj.getString("booldtype");
                    Patient mongoPatient = new Patient (patientBloodType, userId, userEmail, userPassword, userName, userSecondName, userSurname, userSeconSurname, userAddress, userRol);
                    allUser.add(mongoPatient);
                }
            }
            
            // Find all diagnosis and put into an arraylist
            DBCursor fdiagnosis = diagnosis.find();
            while (fdiagnosis.hasNext()) 
            {
                DBObject list = fdiagnosis.next();
                out.println("Yo soy la lista de diagnosticos " + list);
                BasicDBObject diagnosisObj = (BasicDBObject) list;
                String diagnosisName = diagnosisObj.getString("name");
                String diagnosisId = diagnosisObj.getString("id");
                String diagnosisDescription = diagnosisObj.getString("description");
                Diagnosis mongoDiagnosis = new Diagnosis (diagnosisId, diagnosisName, diagnosisDescription);
                allDiagnosis.add(mongoDiagnosis);
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
     * Function to get user list in system
     * @return List of users
     */
    public static String [] getUserList()
    {
        int size = allUser.size();
        String [] users = new String[size];
        int i = 0;
        
        for (User tempUser:allUser)
        {
            users[i] = tempUser.toString();
            i++;
        }
       
        return users;
    }
    
    /**
     * Function to get diagnosis list in system
     * @return List of diagnosis
     */
    public static String [] getDiagnosisList()
    {
        int size = allDiagnosis.size();
        String [] diagnosis = new String[size];
        int i = 0;
        
        for (Diagnosis tempDiagnosis:allDiagnosis)
        {
            diagnosis[i] = tempDiagnosis.toString();
            i++;
        }
       
        return diagnosis;
    }
    
    /**
     * Function to register a new Clinic
     * @param pid
     * @param pname
     * @param paddress
     * @param pphone
     * @return validation
     */
    public static boolean registerClinic (String pid, String pname, String paddress, int pphone)
    {
        boolean validation;
        
        Clinic newClinic = new Clinic(pid, pname, paddress, pphone);
        
        if (newClinic != null)
        {
            allClinics.add(newClinic);
            validation = true;
        } else 
        {
            validation = false;
        }
        
        return validation;
    }
}
