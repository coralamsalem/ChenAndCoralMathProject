package Controller;

import Viewer.SimpleMathTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleMathPageController
{
    private JButton finishTestButton;
    private SimpleMathTest Simple;
    private JComboBox sign1;
    private JComboBox sign2;
    private JComboBox sign3;
    private JComboBox sign4;
    private JComboBox sign5;
    private JComboBox sign6;
    private JComboBox sign7;
    private String signs[]={"+","-","*","%"};

    public SimpleMathPageController() {
        finishTestButton.addActionListener(new Finish_Test());

        Simple = new SimpleMathTest();

    }
    public void showTestFrame()
    {
        Simple.setVisible(true);
    }
    private class Finish_Test implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,
                    "You'r grade is:",
                    "Grades",
                    JOptionPane.WARNING_MESSAGE);
        }

    }

}
