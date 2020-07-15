package Model;
import Model.FileManager;
import java.io.IOException;
import java.util.Objects;
import java.util.Set;

public class UserRepository implements IUserRepository
{
    private static String FILENAME = "Users";
    private Set<User> users;
    private FileManager<User> fileManager;
    private User newUser;

    private static UserRepository SoleInstance;

    public static UserRepository getInstance() throws Exception
    {
     if (SoleInstance == null)
     {
         //if there is no instance available, create new one:

             SoleInstance = new UserRepository();

     }
     return SoleInstance;
    }
    public UserRepository() throws IOException,ClassNotFoundException
    {
        this.fileManager = new FileManager<User>(FILENAME);
        this.users = this.fileManager.read();
    }


    @Override
    public void add(User user) throws Exception {
       if (user == null) {
            throw new Exception("must have a value");
        }

        if (this.users.contains(user)) {
            throw new Exception("Already exists!");

        }
        this.users.add(user);
        this.fileManager.write(users);
    }

    @Override
    public void delete(String id) throws IOException {
        if (newUser.getID().equals(id))
        {
            this.users.remove(new User(newUser));
            this.fileManager.write(this.users);
        }

    }


    @Override
    public Set<User> findAll() {
        return this.users;
    }

    @Override
    public User findByName(String name) {
        for (User user : users) {
            if (name.equals(user)) {
                return user;
            }
        }
        return null;
    }

    public boolean checkLogin(String username, String password, String pro) {

        for (User user : users)
        {
            if(username.equals(user.getUsername()) &&  password.equals(user.getPassword())&& pro.equals(user.getProfession()))
                return true;
        }
        return false;
    }

    public String getPro(String username) {
        for (User user : users)
        {
            String userNameInFile = user.getUsername();
            if( Objects.equals(userNameInFile, username))
                return user.getProfession();
        }
        return null;
    }




}
