package clinicLibrary;

/**
 *
 * @author kevin
 */

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User{
    protected ArrayList <Diagnosis> patientDiagnosis = new ArrayList<>();
    protected ArrayList <Date> appoinment = new ArrayList<>();
    protected String bloodType;

    // Empty Constructor
    public Patient() {
        super();
    }

    public Patient(String pbloodType, String pid, String pemail, String ppassword, String pname, String psecondname, String psurname, String psecondSurname, String paddress, int prol) {
        super(pid, pemail, ppassword, pname, psecondname, psurname, psecondSurname, paddress, prol);
        this.bloodType = pbloodType;
    }

    // Gets
    public ArrayList<Diagnosis> getPatientDiagnosis() {
        return patientDiagnosis;
    }
    public ArrayList<Date> getAppoinment() {
        return appoinment;
    }
    public String getBloodType() {
        return bloodType;
    }

    // Sets
    public void setPatientDiagnosis(ArrayList<Diagnosis> patientDiagnosis) {
        this.patientDiagnosis = patientDiagnosis;
    }
    public void setAppoinment(ArrayList<Date> appoinment) {
        this.appoinment = appoinment;
    }
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    // To String
    @Override
    public String toString() {
        return "Patient{" + "patientDiagnosis=" + patientDiagnosis + ", appoinment=" + appoinment + ", bloodType=" + bloodType + '}';
    }
    
}
