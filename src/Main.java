import java.util.ArrayList;
import java.util.List;



public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setName("Vasko");
        e1.setFamilyName("Aleksandr");
        e1.setGender(Gender.MALE);
        e1.setAge(30);
        e1.setJobPosition(Positions.EMPLOYEE);


        Employee e2 = new Employee();
        e2.setName("Robin");
        e2.setFamilyName("de lall");
        e2.setGender(Gender.MALE);
        e2.setAge(35);
        e2.setJobPosition(Positions.EMPLOYEE);


        Employee e3 = new Employee();
        e3.setName("Helena");
        e3.setFamilyName("Lebreton");
        e3.setGender(Gender.FEMALE);
        e3.setAge(40);
        e3.setJobPosition(Positions.EMPLOYEE);


        Manager m1 = new Manager();
        m1.setName("Florian");
        m1.setFamilyName("Muller");
        m1.setGender(Gender.MALE);
        m1.setAge(65);
        m1.setJobPosition(Positions.MANAGER);


        Praktikant p1 = new Praktikant();
        p1.setName("Mohammad");
        p1.setFamilyName("Sahyoni");
        p1.setGender(Gender.MALE);
        p1.setAge(27);
        p1.setJobPosition(Positions.PRAKTIKANT);

        Person person1 = new Person();
        person1.setName("laila");
        person1.setFamilyName("wanly");
        person1.setGender(Gender.FEMALE);
        person1.setAge(20);
        person1.setJobPosition(Positions.EMPLOYEE);


        e1.setManager(m1);
        e2.setManager(m1);
        e3.setManager(m1);
        p1.setManager(m1);


        List<Employee> employeelist = new ArrayList<>();
        employeelist.add(0, e1);
        employeelist.add(1, e2);
        employeelist.add(2, e3);


        List<Praktikant> praktikantList = new ArrayList<>();
        praktikantList.add(0, p1);


        m1.setEmployees(employeelist);
        m1.setPraktikants(praktikantList);

        Services.checkRights(e1);
        Services.checkRights(m1);
        Services.checkRights(p1);



        //m1.getRechte().forEach(per -> System.out.println(per));
       /* System.out.println(Permission.getread(m1));
        System.out.println(Permission.getread(e1));
        System.out.println(Permission.getread(p1));
        System.out.println("\n -------------------------");
        System.out.println(Permission.getdelete(m1));
        System.out.println(Permission.getdelete(e1));
        System.out.println(Permission.getdelete(p1));
        System.out.println("\n -------------------------");
        System.out.println(Permission.getwrite(m1));
        System.out.println(Permission.getwrite(e1));
        System.out.println(Permission.getwrite(p1));
        System.out.println("\n -------------------------");*/

      /*  System.out.println(m1.getRechte());
        System.out.println(e1.getRechte());
        System.out.println(p1.getRechte());

*/



        /*System.out.println("-------------------------");

        System.out.println(new Services().userPermission(m1));
        System.out.println(new Services().userPermission(e1));
        System.out.println(new Services().userPermission(p1));

        System.out.println(Services.userPermission(m1));
        System.out.println(Services.userPermission(e1));
        System.out.println(Services.userPermission(p1));

        System.out.println("-------------------------");
*/




/*
        e1.displayCompanyName();
        e1.displayCompanyName();
        e3.displayCompanyName();
        p1.displayCompanyName();
        m1.displayCompanyName();
*/
      /*  System.out.println(" Name: " + e1.getName() + "\n" + " Family-name: " + e1.getFamilyName() + "\n" + " Gender: " + e1.getGender() + "\n" + " Age: " + e1.getAge() + "\n" + " Job position: " + e1.getJobPosition() + "\n" + " Belongs to the Manager: " + e1.getManager().getName() + "\n" + " Company Name: " + e1.getCompanyName() + "\n" + Services.userPermission(e1) + "\n");
        System.out.println(" Name: " + e2.getName() + "\n" + " Family-name: " + e2.getFamilyName() + "\n" + " Gender: " + e2.getGender() + "\n" + " Age: " + e2.getAge() + "\n" + " Job position: " + e2.getJobPosition() + "\n" + " Belongs to the Manager: " + e2.getManager().getName() + "\n" + " Copmany Name: " + e2.getCompanyName() + "\n" + Services.userPermission(e2) + "\n");
        System.out.println(" Name: " + e3.getName() + "\n" + " Family-name: " + e3.getFamilyName() + "\n" + " Gender: " + e3.getGender() + "\n" + " Age: " + e3.getAge() + "\n" + " Job position: " + e3.getJobPosition() + "\n" + " Belongs to the Manager: " + e3.getManager().getName() + "\n" + " Company Name: " + e3.getCompanyName() + "\n" + Services.userPermission(e3) + "\n");
        System.out.println(" Name: " + p1.getName() + "\n" + " Family-name: " + p1.getFamilyName() + "\n" + " Gender: " + p1.getGender() + "\n" + " Age: " + p1.getAge() + "\n" + " Job position: " + p1.getJobPosition() + "\n" + " Belongs to the Manager: " + p1.getManager().getName() + "\n" + " ompany Name: " + p1.getCompanyName() + "\n" + Services.userPermission(p1) + "\n");
        System.out.println(String.format(" Name: " + m1.getName() + "\n" + " Family-name: " + m1.getFamilyName() + "\n" + " Gender: " + m1.getGender() + "\n" + " Age: " + m1.getAge() + "\n" + " Job position: " + m1.getJobPosition() + "\n" + " %s %s manage this Employees: " + *//*m1.getEmployee().toString()*//*  "\n" + " AND HE MANAGE THIS PRAKTIKANT ALSO: " + m1.getPraktikants().toString() + "\n" + " Company Name: " + m1.getCompanyName() + "\n" + " The count of Employees belongs to %s is: " + employeelist.size() + "\n" + " The count of Praktikant belongs to %s is: " + praktikantList.size() +"\n" + Services.userPermission(m1) + "\n", m1.getName(), m1.getFamilyName(), m1.getName(), m1.getName()));
         */   // for (Employee e : employeelist1) System.out.print(" " + e.getName());
    }
}
