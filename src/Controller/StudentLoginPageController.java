package Controller;

import Viewer.LoginPage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class StudentLoginPageController {

    private JTextField Username;
    private JPasswordField passwordField1;
    private JButton loginButton;
    private JButton registerButton;
    private LoginPage viewer;

    public StudentLoginPageController()
    {
        viewer = new LoginPage();
        passwordField1 = viewer.getPasswordField1();
        Username = viewer.getUsername();
        loginButton = viewer.getLoginButton();
        registerButton = viewer.getRegisterButton();

        viewer.setVisible(true);

        loginButton.addActionListener(new loginListener());
    }

    private class loginListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String f = "C:\\Users\\Moran\\IdeaProjects\\ChenAndCoralMathProject\\Student.txt";
            try
            {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String line, user, pass;
                boolean isLoginSuccess = false;
                Scanner scanner;
                scanner = new Scanner(br).useDelimiter( ",");
                while (scanner.hasNext()) {
                    String lineFromFile = scanner.nextLine();
                    //System.out.println(lineFromFile);
                    if (lineFromFile.equals(String.valueOf(Username.getText()))) {
                        lineFromFile = scanner.nextLine();
                        if (lineFromFile.equals(String.valueOf(passwordField1.getText()))) {
                            isLoginSuccess = true;
                        }
                    }

                }
                if (isLoginSuccess) {
                    //JOptionPane.showMessageDialog(null, "Correct", "Success",JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("Success");
                }
                else
                {
                    System.out.println("incorrect username or password");
                }
            } catch (IOException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }

        }

    }

}
