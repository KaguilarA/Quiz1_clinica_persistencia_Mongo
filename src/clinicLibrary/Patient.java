package clinicLibrary;

/**
 *
 * @author kevin
 */

import java.util.ArrayList;


public class Patient extends User{
    protected ArrayList <Diagnosis> patientDiagnosis = new ArrayList<>();
    protected ArrayList <Appointment> appointmentsList = new ArrayList<>();
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
    public ArrayList<Appointment> getAppoinment() {
        return appointmentsList;
    }
    public String getBloodType() {
        return bloodType;
    }

    // Sets
    public void setPatientDiagnosis(ArrayList<Diagnosis> patientDiagnosis) {
        this.patientDiagnosis = patientDiagnosis;
    }

    public void setAppoinment(ArrayList<Appointment> appoinment) {
        this.appointmentsList = appoinment;
    }
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    // To String
    @Override
    public String toString() {
        return "Patient{" + "patientDiagnosis=" + patientDiagnosis + ", appoinment=" + appointmentsList + ", bloodType=" + bloodType + '}';
    }
    
}
