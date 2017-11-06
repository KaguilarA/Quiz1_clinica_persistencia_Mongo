package clinicLibrary;

/**
 *
 * @author kevin
 */

import java.util.ArrayList;

public class Clinic {
    protected ArrayList <Doctor> listOfDoctors = new ArrayList<>();
    protected String id, name, address;
    protected int phone;
    
    // Empty Constructor
    public Clinic() {
    }
    
    // Constrctor
    public Clinic(String pid, String pname, String paddress, int pphone) {
        this.id = pid;
        this.name = pname;
        this.address = paddress;
        this.phone = pphone;
    }

    // Gets
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public int getPhone() {
        return phone;
    }
    public ArrayList<Doctor> getListOfDoctors() {
        return listOfDoctors;
    }
    
    // Sets
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    public void setListOfDoctors(ArrayList<Doctor> listOfDoctors) {
        this.listOfDoctors = listOfDoctors;
    }

    @Override
    public String toString() {
        return "Clinic{" + "listOfDoctors=" + listOfDoctors + ", id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + '}';
    }
    
}
