package Controller;

import Viewer.LoginPage;
import Viewer.RegisterPage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TeacherRegisterPageController extends JFrame {

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
    private File f;

    public TeacherRegisterPageController()
    {
        viewer = new RegisterPage();

        IdText = viewer.getIdText();
        NameText = viewer.getTheNameText();
        LastNameText = viewer.getTheLastNameText();
        UsernameText = viewer.getTheUsernameText();
        PasswordText = viewer.getThePasswordText();
        RegisterBtn = viewer.getTheRegisterBtn();

        viewer.setVisible(true);

        RegisterBtn.addActionListener(new registerListener());

        f = new File("C:\\Users\\Moran\\IdeaProjects\\Teacher.txt");

    }

    private class registerListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            try(FileWriter fw = new FileWriter("Teacher.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw))
            {
                //out.println("ID: ");
                out.println(String.valueOf(IdText.getText()));
                //out.println("Name: ");
                out.println(String.valueOf(NameText.getText()));
                //out.println("Last Name: ");
                out.println(String.valueOf(LastNameText.getText()));
                //out.println("Username: ");
                out.println(String.valueOf(UsernameText.getText()));
                //out.println("Password: ");
                out.println(String.valueOf(PasswordText.getText()));
                out.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }

        }

    }

    void saveToFile(String fileName, JTextField textField) throws Exception {
        FileOutputStream out = new FileOutputStream(fileName, true);
        out.write(textField.getText().getBytes());
    }
}
