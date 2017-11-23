
package clinicLibrary;

import java.util.Date;
/**
 *
 * @author Becky
 */
public class Appointment {
    protected Patient idPatient;
    protected Doctor idDoctor;
    protected String description;
    protected Date appointmentDate;

    public Appointment() {
    }
    
    public Appointment(Patient idPatient, Doctor idDoctor, String description, Date appointmentDate) {
        this.idPatient = idPatient;
        this.idDoctor = idDoctor;
        this.description = description;
        this.appointmentDate = appointmentDate;
    }
    
    public Patient getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(Patient idPatient) {
        this.idPatient = idPatient;
    }

    public Doctor getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(Doctor idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    @Override
    public String toString() {
        return "Appointment{" + "idPatient=" + idPatient + ", idDoctor=" + idDoctor + ", description=" + description + ", appointmentDate=" + appointmentDate + '}';
    }
    
    
    
}
