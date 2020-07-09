package Controller;

import Viewer.LoginPage;
import Viewer.RegisterPage;

import javax.swing.*;

public class RegisterPageController {

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
    private RegisterPage viewer;

    public RegisterPageController()
    {
        viewer = new RegisterPage();

        NameText = viewer.getNameText();
        LastNameText = viewer.getLastNameText();
        UsernameText = viewer.getUsernameText();
        PasswordText = viewer.getPasswordText();
        RegisterBtn = viewer.getRegisterBtn();

        viewer.setVisible(true);

        //loginButton.addActionListener(new loginListener);
    }
}
