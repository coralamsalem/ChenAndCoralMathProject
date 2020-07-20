package Controller;

import Model.Login;
import Model.Test;
import Viewer.HomePage;
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
                isLoggedIn = loginModel.checkUser(loginViewer.getUsername(), loginViewer.getPasswordField1(), pro);
            } catch (Exception exception) {
                exception.printStackTrace();
            }

            if (isLoggedIn) {
                try {
                    testPage = new TestPageController(pro);
                    testPage.showTestPage();
                    loginViewer.exitPage();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
            else
            {
                loginViewer.SetLogInText(false);
            }
        }
    }
}