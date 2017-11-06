package clinicLibrary;

/**
 *
 * @author kevin
 */
public class Diagnosis {
    protected String id, name, description;

    // Empty Constructor
    public Diagnosis() {
    }

    // Constructor
    public Diagnosis(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    // Getts
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    
    // Sets
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    // To String
    @Override
    public String toString() {
        return "Diagnosis{" + "id=" + id + ", name=" + name + ", description=" + description + '}';
    }
}
