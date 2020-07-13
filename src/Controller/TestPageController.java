package Controller;

import Model.Teacher;
import Viewer.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestPageController {

    private TestPage testpage;
    private LoginPage loginPage;
    private HomePage homePage;
    private SimpleMathPageController Simple;
    private ProblemTestController problem;
    private Teacher TeacherModel;
    private TeacherSimpleTest TeacherView;
    private SimpleMathTest StudentView;
    private TeacherMathProblem TeacherPro;
    private MathProblemPage StudentPro;
    private String value;
    private String sign;
    private JComboBox comboBox;

    private JButton AddBtn;
    private JButton SubBtn;
    private JButton MulBtn;
    private JButton DivBtn;
    private JButton LitBtn;
    private JButton PreBtn;

    public TestPageController() {
        testpage = new TestPage();
        AddBtn = testpage.getAddBtn();
        SubBtn = testpage.getSubBtn();
        MulBtn = testpage.getMulBtn();
        DivBtn = testpage.getDivBtn();
        LitBtn = testpage.getLitBtn();
        PreBtn = testpage.getPreBtn();
        comboBox=  homePage.getTSComboBox();
        testpage.setVisible(true);

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

        public void actionPerformed(ActionEvent e)
        {
            value = (String) comboBox.getSelectedItem();
            sign= "+";
            if (value.equals("Teacher"))
            {
                Simple = new SimpleMathPageController(TeacherModel, TeacherView);
                TeacherView.setSign1(sign);
                TeacherView.setSign2(sign);
                TeacherView.setSign3(sign);
                TeacherView.setSign4(sign);
                TeacherView.setSign5(sign);
                TeacherView.setSign6(sign);
                TeacherView.setSign7(sign);
            }
            if (value.equals("Student"))
            {
                Simple = new SimpleMathPageController(TeacherView, StudentView);
                StudentView.setSign1(sign);
                StudentView.setSign2(sign);
                StudentView.setSign3(sign);
                StudentView.setSign4(sign);
                StudentView.setSign5(sign);
                StudentView.setSign6(sign);
                StudentView.setSign7(sign);
            }
        }

    }
    private class subListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            value = (String) comboBox.getSelectedItem();
            sign= "-";
            if (value.equals("Teacher")) {
                Simple = new SimpleMathPageController(TeacherModel, TeacherView);
                TeacherView.setSign1(sign);
                TeacherView.setSign2(sign);
                TeacherView.setSign3(sign);
                TeacherView.setSign4(sign);
                TeacherView.setSign5(sign);
                TeacherView.setSign6(sign);
                TeacherView.setSign7(sign);
            }
            if (value.equals("Student"))
            {
                Simple = new SimpleMathPageController(TeacherView, StudentView);
                StudentView.setSign1(sign);
                StudentView.setSign2(sign);
                StudentView.setSign3(sign);
                StudentView.setSign4(sign);
                StudentView.setSign5(sign);
                StudentView.setSign6(sign);
                StudentView.setSign7(sign);
            }
        }

    }
    private class mulListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
             sign= "*";
            value = (String) comboBox.getSelectedItem();
            if (value.equals("Teacher"))
            {

                Simple = new SimpleMathPageController(TeacherModel, TeacherView);
                TeacherView.setSign1(sign);
                TeacherView.setSign2(sign);
                TeacherView.setSign3(sign);
                TeacherView.setSign4(sign);
                TeacherView.setSign5(sign);
                TeacherView.setSign6(sign);
                TeacherView.setSign7(sign);
            }
            if (value.equals("Student"))
            {
                Simple = new SimpleMathPageController(TeacherView, StudentView);
                StudentView.setSign1(sign);
                StudentView.setSign2(sign);
                StudentView.setSign3(sign);
                StudentView.setSign4(sign);
                StudentView.setSign5(sign);
                StudentView.setSign6(sign);
                StudentView.setSign7(sign);
            }
        }

    }
    private class divListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            value = (String) comboBox.getSelectedItem();
            sign= "%";
            if (value.equals("Teacher"))
            {
                Simple = new SimpleMathPageController(TeacherModel, TeacherView);
                TeacherView.setSign1(sign);
                TeacherView.setSign2(sign);
                TeacherView.setSign3(sign);
                TeacherView.setSign4(sign);
                TeacherView.setSign5(sign);
                TeacherView.setSign6(sign);
                TeacherView.setSign7(sign);
            }
            if (value.equals("Student"))
            {
                Simple = new SimpleMathPageController(TeacherView, StudentView);
                StudentView.setSign1(sign);
                StudentView.setSign2(sign);
                StudentView.setSign3(sign);
                StudentView.setSign4(sign);
                StudentView.setSign5(sign);
                StudentView.setSign6(sign);
                StudentView.setSign7(sign);
            }
        }


    }
    private class litListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            problem= new ProblemTestController(TeacherModel, TeacherPro);
        }

    }
    private class preListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            problem= new ProblemTestController(TeacherPro, StudentPro);
        }

    }
}
