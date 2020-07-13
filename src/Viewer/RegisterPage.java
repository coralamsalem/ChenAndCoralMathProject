package Viewer;

import javax.swing.*;

public class RegisterPage extends JFrame {
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

    public RegisterPage()
    {
        JPanel Register = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,400);
        getContentPane().add(Register);
        Register.add(RegisterPage);
    }


    public JTextField getIdText() {
        return IdText;
    }

    public void setIdText(JTextField idText) {
        IdText = idText;
    }

    public JTextField getTheNameText() {
        return NameText;
    }

    public void setNameText(JTextField nameText) {
        NameText = nameText;
    }

    public JTextField getTheLastNameText() {
        return LastNameText;
    }

    public void setLastNameText(JTextField lastNameText) {
        LastNameText = lastNameText;
    }

    public JTextField getTheUsernameText() {
        return UsernameText;
    }

    public void setUsernameText(JTextField usernameText) {
        UsernameText = usernameText;
    }

    public JTextField getThePasswordText() {
        return PasswordText;
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


}
