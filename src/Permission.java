public class Permission {
    private static String read = "read";
    private static String write = "write";
    private static String delete = "delete";

    public static String getread(Person per) {
        if (per.getJobPosition() == Positions.MANAGER || per.getJobPosition() == Positions.EMPLOYEE || per.getJobPosition() == Positions.PRAKTIKANT)
            return per.getName() + " can " + read;
        else
            return "Read NOT ALLOWED FOR " + per.getName() + " due Job-Position is: " + per.getJobPosition() ;
    }


    public static String getwrite(Person per) {
        if (per.getJobPosition() == Positions.MANAGER || per.getJobPosition() == Positions.EMPLOYEE) {
            return per.getName() + " can " + write;
        } else return "Write NOT ALLOWED FOR " + per.getName() + " due Job-Position is: " + per.getJobPosition() ;
    }


    public static String getdelete(Person per) {
        if (per.getJobPosition() == Positions.MANAGER) {
            return per.getName() + " can " + delete;
        } else
            return "Delete NOT ALLOWED FOR " + per.getName() + " due Job-Position is: " + per.getJobPosition() ;
    }


}
