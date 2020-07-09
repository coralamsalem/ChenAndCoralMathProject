package Controller;

import Viewer.LoginPage;
import Viewer.TestPage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestPageController {

    private TestPage viewer;
    private JButton AddBtn;
    private JButton SubBtn;
    private JButton MulBtn;
    private JButton DivBtn;
    private JButton LitBtn;
    private JButton PreBtn;

    public TestPageController() {
        viewer = new TestPage();
        AddBtn = viewer.getAddBtn();
        SubBtn = viewer.getSubBtn();
        MulBtn = viewer.getMulBtn();
        DivBtn = viewer.getDivBtn();
        LitBtn = viewer.getLitBtn();
        PreBtn = viewer.getPreBtn();

        AddBtn.addActionListener(new addListener());
        SubBtn.addActionListener(new subListener());
        MulBtn.addActionListener(new mulListener());
        DivBtn.addActionListener(new divListener());
        LitBtn.addActionListener(new litListener());
        PreBtn.addActionListener(new preListener());


    }

    private class addListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {



        }

    }
    private class subListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {

        }

    }
    private class mulListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {

        }

    }
    private class divListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {

        }

    }
    private class litListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {

        }

    }
    private class preListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {

        }

    }
}
