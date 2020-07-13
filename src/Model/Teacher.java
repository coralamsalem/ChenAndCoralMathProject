package Model;

public class Teacher extends User
{

    public Teacher(String id, String name, String lastName, String username, String password, String profession) {
        super(id, name, lastName, username, password, profession);
    }

    public Teacher(User newUser) {
        super(newUser);
    }
}
