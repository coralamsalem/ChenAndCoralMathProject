package Controller;

import Viewer.HomePage;
import Viewer.LoginPage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePageController
{
    private HomePage homePage;
    private JButton RegisterBtn;
    private JButton LogBtn;
    private LoginPage loginPage;
    private LoginPageController login;
    private RegisterPageController register;

    public HomePageController()
    {
        homePage = new HomePage();
        LogBtn = homePage.getLogBtn();
        RegisterBtn = homePage.getRegisterBtn();

        homePage.setVisible(true);

        LogBtn.addActionListener(new logListener());
        RegisterBtn.addActionListener(new registerListener());


    }

    private class logListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            login = new LoginPageController();
        }
    }

    private class registerListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            register = new RegisterPageController();
        }
    }






}
