package Model;

import java.io.IOException;
import java.util.Set;

public interface IUserRepository {

    void add(User user) throws Exception;

    void delete(String id) throws IOException;

    Set<User> findAll();

    User findByName(String name);

    public boolean checkLogin(String username, String password,String pro);

    String getPro(String username);
    Boolean FindUser(String username);
    String[] getUserList();
}
