package Viewer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame{

    private JPanel loginView;
    private JTextField Username;
    private JPasswordField passwordField1;
    private JButton loginButton;
    private JLabel loginText;

    private String pro;
    private HomePage homePage;

    public LoginPage()
    {
        JPanel Login = new JPanel();
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setBounds(380,200,600,400);
        getContentPane().add(Login);
        Login.add(loginView);
    }

    public String getPro() {
        return pro;
    }

    public void setPro(String pro) {
        this.pro = pro;
    }

    public void showLoginPage() { this.setVisible(true); }

    public String getUsername() {
        return Username.getText();
    }

    public void setUsername(JTextField username) {
        Username = username;
    }

    public String getPasswordField1() {
        return passwordField1.getText();
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

    public String getComboBox() { return homePage.getTSComboBox().getSelectedItem().toString(); }

    public void exitPage() { this.dispose(); }

    public void SetLogInText(boolean logged)
    {
        if(!logged)
            loginText.setText("Wrong username or password");
        else
            loginText.setText("");
    }
}