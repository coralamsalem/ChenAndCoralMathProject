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
    private JComboBox comboBox;
    private LoginPage loginPage;
    private TeacherLoginPageController Tlogin;
    private StudentLoginPageController Slogin;
    private TeacherRegisterPageController Tregister;
    private StudentRegisterPageController Sregister;
    private String value;

    public HomePageController()
    {
        homePage = new HomePage();
        LogBtn = homePage.getTheLogBtn();
        RegisterBtn = homePage.getTheRegisterBtn();
        comboBox = homePage.getTSComboBox();

        homePage.setVisible(true);

        LogBtn.addActionListener(new logListener());
        RegisterBtn.addActionListener(new registerListener());
        //comboBox.addActionListener(new comboBoxListener());
        //value = (String) comboBox.getSelectedItem();
        //System.out.println(value);

    }

    private class comboBoxListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JComboBox cb = (JComboBox)e.getSource();
            value = (String)cb.getSelectedItem();
            System.out.println(value);
        }
    }

    private class logListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            value = (String) comboBox.getSelectedItem();
            System.out.println(value);
            if (value.equals("Student"))
            {
                Slogin = new StudentLoginPageController();
            }
            else if (value.equals("Teacher"))
            {
                Tlogin = new TeacherLoginPageController();
            }
        }

    }

    private class registerListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            value = (String) comboBox.getSelectedItem();
            System.out.println(value);
            if (value.equals("Student"))
            {
                Sregister = new StudentRegisterPageController();
            }
            else if (value.equals("Teacher"))
            {
                Tregister = new TeacherRegisterPageController();
            }

        }
    }

}