package Controller;

import Model.Login;
import Model.RegisterModel;
import Viewer.HomePage;
import Viewer.LoginPage;
import Viewer.RegisterPage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePageController
{
    private HomePage homePage;
    private String value;

    public HomePageController(HomePage homePage)
    {

        this.homePage = homePage;
        homePage.setVisible(true);
        this.homePage.addRegisterListener( new registerListener());
        this.homePage.addLoginListener(new logListener());


    }

    private class logListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            value = (String) homePage.getTSComboBox().getSelectedItem();
            try
            {
                LoginPage loginPage = new LoginPage();
                Login loginModel = new Login();
                LoginPageController loginController = new LoginPageController(loginPage, loginModel, value);
            }
            catch (Exception exception)
            {
               // exception.printStackTrace();
            }
        }
    }

    private class registerListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            value = (String) homePage.getTSComboBox().getSelectedItem();
            try
            {
                RegisterPage registerView = new RegisterPage();
                RegisterModel registerModel = new RegisterModel();
                RegisterPageController registerController = new RegisterPageController( registerModel,registerView, value);
                //homePage.exitPage();
            }
            catch (Exception exception)
            {
                // exception.printStackTrace();
            }
        }
    }
}