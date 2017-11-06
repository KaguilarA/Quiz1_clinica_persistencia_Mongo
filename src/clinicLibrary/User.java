package clinicLibrary;

/**
 *
 * @author kevin
 */
public class User {
    protected String id, email, password, name, secondname, surname, secondSurname, address;
    protected int rol;

    // Empty Constructor
    public User() {
    }

    // Constructor
    public User(String pid, String pemail, String ppassword, String pname, String psecondname, String psurname, String psecondSurname, String paddress, int prol) {
        this.id = pid;
        this.email = pemail;
        this.password = ppassword;
        this.name = pname;
        this.secondname = psecondname;
        this.surname = psurname;
        this.secondSurname = psecondSurname;
        this.address = paddress;
        this.rol = prol;
    }

    // Getts
    public String getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getName() {
        return name;
    }
    public String getSecondname() {
        return secondname;
    }
    public String getSurname() {
        return surname;
    }
    public String getSecondSurname() {
        return secondSurname;
    }
    public String getAddress() {
        return address;
    }
    public int getRol() {
        return rol;
    }

    // Sets
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setRol(int rol) {
        this.rol = rol;
    }

    // To String
    @Override
    public String toString() {
        return "User{" + "id=" + id + ", email=" + email + ", password=" + password + ", name=" + name + ", secondname=" + secondname + ", surname=" + surname + ", secondSurname=" + secondSurname + ", address=" + address + ", rol=" + rol + '}';
    }

}
