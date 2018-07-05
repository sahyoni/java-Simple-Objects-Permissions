import java.util.ArrayList;
import java.util.List;

public class Manager extends Person implements TryInterface {

    private List<Employee> employees;
    private List<Praktikant> praktikants;
    private List<Rights> rights;

    @Override
    public List<Rights> getRights() {
        List<Rights> rights = new ArrayList<>();
        rights.add(Rights.read);
        rights.add(Rights.write);
        rights.add(Rights.delete);
        return rights;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Praktikant> getPraktikants() {
        return praktikants;
    }

    public void setPraktikants(List<Praktikant> praktikants) {
        this.praktikants = praktikants;
    }

    @Override
    public String getCompanyName() {
        return Company;
    }

    @Override
    public void displayCompanyName() {
        System.out.println("Company Name : " + getCompanyName());

    }


}


