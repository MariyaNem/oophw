package HomeWork;

public class Main{
    public static void main(String[] args){
        User user = new User("Maria");

        Saveable saveable = new Persister(user);
        saveable.save();

        Reportable reportable = new ReportUser(user);
        reportable.report();
    }
}