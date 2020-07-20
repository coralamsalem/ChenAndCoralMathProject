package Viewer;

import Controller.RegisterPageController;

import javax.swing.*;

public class RegisterPage extends JFrame {
    private JPanel RegisterPage;
    private HomePage homePage;
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
    private String pro;

    public RegisterPage()
    {
        JPanel Register = new JPanel();
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setBounds(380,200,600,400);
        getContentPane().add(Register);
        Register.add(RegisterPage);
    }


    public String getIdText() { return IdText.getText(); }

    public void showRegisterView()
    {
        this.setVisible(true);
    }

    public void setIdText(JTextField idText) {
        IdText = idText;
    }

    public String getTheNameText() {
        return NameText.getText();
    }

    public void setNameText(JTextField nameText) {
        NameText = nameText;
    }

    public String getTheLastNameText() { return LastNameText.getText(); }

    public void setLastNameText(JTextField lastNameText) {
        LastNameText = lastNameText;
    }

    public String getTheUsernameText() { return UsernameText.getText(); }

    public void setUsernameText(JTextField usernameText) { UsernameText = usernameText; }

    public String getThePasswordText() {
        return PasswordText.getText();
    }

    public void setPasswordText(JTextField passwordText) {
        PasswordText = passwordText;
    }

    public JLabel getIdLabel() {
        return IdLabel;
    }

    public void setIdLabel(JLabel idLabel) {
        IdLabel = idLabel;
    }

    public JLabel getNameLabel() {
        return NameLabel;
    }

    public void setNameLabel(JLabel nameLabel) {
        NameLabel = nameLabel;
    }

    public JLabel getLastNameLabel() {
        return LastNameLabel;
    }

    public void setLastNameLabel(JLabel lastNameLabel) {
        LastNameLabel = lastNameLabel;
    }

    public JLabel getUsernameLabel() {
        return UsernameLabel;
    }

    public void setUsernameLabel(JLabel usernameLabel) {
        UsernameLabel = usernameLabel;
    }

    public JLabel getPasswordLabel() {
        return PasswordLabel;
    }

    public void setPasswordLabel(JLabel passwordLabel) {
        PasswordLabel = passwordLabel;
    }

    public JButton getTheRegisterBtn() {
        return RegisterBtn;
    }

    public void setRegisterBtn(JButton registerBtn) {
        RegisterBtn = registerBtn;
    }

    public void exitPage() { this.dispose(); }

}
