package Viewer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame{

    private JPanel loginView;
    private JTextField Username;
    private JPasswordField passwordField1;
    private JButton loginButton;
    private JButton registerButton;

    public LoginPage()
    {
        JPanel Login = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,400);
        getContentPane().add(Login);
        Login.add(loginView);

    }

    public JTextField getUsername() {
        return Username;
    }

    public void setUsername(JTextField username) {
        Username = username;
    }

    public JPasswordField getPasswordField1() {
        return passwordField1;
    }

    public void setPasswordField1(JPasswordField passwordField1) {
        this.passwordField1 = passwordField1;
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(JButton loginButton) {
        this.loginButton = loginButton;
    }

    public JButton getRegisterButton() {
        return registerButton;
    }

    public void setRegisterButton(JButton registerButton) {
        this.registerButton = registerButton;
    }
}