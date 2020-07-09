package Controller;

import Viewer.LoginPage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPageController {

    private JTextField Username;
    private JPasswordField passwordField1;
    private JButton loginButton;
    private JButton registerButton;
    private LoginPage viewer;

    public LoginPageController()
    {
        viewer = new LoginPage();
        passwordField1 = viewer.getPasswordField1();
        Username = viewer.getUsername();
        loginButton = viewer.getLoginButton();
        registerButton = viewer.getRegisterButton();

        viewer.setVisible(true);

        //loginButton.addActionListener(new loginListener);
    }
/*
    private class loginListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            LoginPage = new LoginPage();
            LoginPage.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }
*/
}
