package clinicLibrary;

/**
 *
 * @author kevin
 */

import java.util.ArrayList;

public class Doctor extends User {
    
    protected ArrayList <Patient> patients = new ArrayList<>();
    protected ArrayList <Appointment> appointmentsList = new ArrayList<>();
    protected String doctorCode;

    // Empty Constructor
    public Doctor() {
        super();
    }

    // Constructor
    public Doctor(String pdoctorCode, String pid, String pemail, String ppassword, String pname, String psecondname, String psurname, String psecondSurname, String paddress, int prol) {
        super(pid, pemail, ppassword, pname, psecondname, psurname, psecondSurname, paddress, prol);
        this.doctorCode = pdoctorCode;
    }

    // Gets
    public String getDoctorCode() {
        return doctorCode;
    }
    public ArrayList<Patient> getPatientDiagnosis() {
        return patients;
    }

    public ArrayList<Appointment> getAppointmentsList() {
        return appointmentsList;
    }
    
    // Sets
    public void setDoctorCode(String doctorCode) {
        this.doctorCode = doctorCode;
    }
    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    public void setAppointmentsList(ArrayList<Appointment> appointmentsList) {
        this.appointmentsList = appointmentsList;
    }
    
    // To String
    @Override
    public String toString() {
        return "Doctor{" + "patients=" + patients + ", doctorCode=" + doctorCode + '}';
    }

}
