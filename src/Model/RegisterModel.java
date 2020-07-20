package Model;

import javax.swing.*;


public class RegisterModel {

    UserRepository userRepository;

    public RegisterModel() throws Exception { }

    public void AddUser(User newUser) throws Exception
    {
        userRepository= UserRepository.getInstance();
        User user = new User(newUser.getID(), newUser.getName(), newUser.getLastName(), newUser.getUsername(), newUser.getPassword(), newUser.getProfession());
        userRepository.add(user);

    }


}