import java.util.ArrayList;
import java.util.List;

public class Praktikant extends Person implements TryInterface {

    private Manager manager;
    private List<Rights> rights;



    @Override
    public List<Rights> getRights() {
        List<Rights> rights = new ArrayList<>();
        rights.add(Rights.read);
        return rights;
    }

    @Override
    public void setRights(List<Rights> rights) {
        this.rights = rights;
    }


    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return " Praktikant Name Is: " + getName();
    }

    @Override
    public String getCompanyName() {
        return Company;
    }

    @Override
    public void displayCompanyName() {
        System.out.println("Copmany Name : " + getCompanyName());

    }

}
