package Controller;

import Model.Login;
import Model.Test;
import Viewer.LoginPage;
import Viewer.TestPage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LoginPageController {
    private Test newTest;
    private LoginPage loginViewer;
    private Login loginModel;
    private boolean isLoggedIn = false;
    private String pro;
    private TestPageController testPage;

    public LoginPageController(LoginPage loginViewer, Login loginModel, String value)
    {
        this.loginViewer = loginViewer;
        this.loginModel = loginModel;
        this.pro = value;
        loginViewer.showLoginPage();
        loginViewer.getLoginButton().addActionListener(new loginListener());
    }

    public LoginPage getLoginPage() {
        return loginViewer;
    }

    public void showLoginViewer() { loginViewer.showLoginPage(); }

    private class loginListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {


            try {
                isLoggedIn = loginModel.checkUser(loginViewer.getUsername(),loginViewer.getPasswordField1(),pro);
            } catch (Exception exception) {
                exception.printStackTrace();
            }

            if(isLoggedIn)
            {
                try {
                    testPage = new TestPageController(pro);
                    testPage.showTestPage();
                    System.out.println("In");
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    System.out.println("Not");
                }


            }


            }


        }
    }





/*
    private class loginListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (viewer.getComboBox().equals("Teacher"))
            {
                String f = "C:\\Users\\Moran\\IdeaProjects\\ChenAndCoralMathProject\\Teacher.txt";
            }
            else
            {
                String f = "C:\\Users\\Moran\\IdeaProjects\\ChenAndCoralMathProject\\Student.txt";
            }
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
                            testPage = new TeacherTestPageController();
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

*/