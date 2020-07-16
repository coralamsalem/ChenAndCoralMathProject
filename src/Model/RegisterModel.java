package Model;

import javax.swing.*;

public class RegisterModel {

    private JPanel RegisterPage;
    private JTextField IdText;
    private JTextField NameText;
    private JTextField LastNameText;
    private JTextField UsernameText;
    private JTextField PasswordText;
    private JLabel IdLabel;
    private JLabel NameLabel;
    private JLabel LastNameLabel;
    private JLabel UsernameLabel;
    private JLabel PasswordLabel;
    private JButton RegisterBtn;

    public void AddUser(User newUser)
    {
        User user = new User(newUser.getID(), newUser.getName(), newUser.getLastName(), newUser.getUsername(), newUser.getPassword(), newUser.getProfession());
        try
        {
            //userRepository.add(account);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }


}
