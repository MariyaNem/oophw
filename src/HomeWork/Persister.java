package HomeWork;

public class Persister implements Saveable{
    private User user;

    public Persister(User user){
        this.user = user;
    }

    public void save(){
        System.out.println("Save: " + user.getName());
    }
}