public class Services {


    private static String serviceA = " Service A Available ";
    private static String serviceB = " Service B Available ";
    private static String serviceC = " Service C Available ";



    public static String userPermission(Person per) {
        if (per.getJobPosition().equals(Positions.MANAGER)) {
            return serviceA + String.format("for %s", per.getName()) + "\n" + serviceB + String.format("for %s", per.getName()) + "\n" + serviceC + String.format("for %s", per.getName()) + "\n";
        } else if (per.getJobPosition().equals(Positions.EMPLOYEE)) {
            return serviceA + String.format("for %s", per.getName()) + "\n" + serviceB + String.format("for %s", per.getName()) + "\n";
        } else {
            return serviceC + String.format("for %s", per.getName()) + "\n";
        }
    }

    public static void checkRights(Person person) {
        if ( person.getRights().contains(Rights.read)) {
            System.out.println("Read Allowed");
        } if (person.getRights().contains(Rights.write)) {
            System.out.println("Write Allowed");
        } if (person.getRights().contains(Rights.delete)) {
            System.out.println("Delete Alowed");
        } else System.out.println("Denied");
    }
}