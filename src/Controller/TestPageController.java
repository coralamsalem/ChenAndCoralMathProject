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
            Simple= new SimpleMathPageController(TeacherModel,TeacherView);
            TeacherView.setSign1('+');
            TeacherView.setSign2('+');
            TeacherView.setSign3('+');
            TeacherView.setSign4('+');
            TeacherView.setSign5('+');
            TeacherView.setSign6('+');
            TeacherView.setSign7('+');
        }

    }
    private class subListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if (homePage.getTSComboBox().equals("Teacher")) {
                Simple = new SimpleMathPageController(TeacherModel, TeacherView);
                TeacherView.setSign1('-');
                TeacherView.setSign2('-');
                TeacherView.setSign3('-');
                TeacherView.setSign4('-');
                TeacherView.setSign5('-');
                TeacherView.setSign6('-');
                TeacherView.setSign7('-');
            }
            if (homePage.getTSComboBox().equals("Student"))
            {
                Simple = new SimpleMathPageController(TeacherView, StudentView);
            }
        }

    }
    private class mulListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (homePage.getTSComboBox().equals("Teacher")) {
                Simple = new SimpleMathPageController(TeacherModel, TeacherView);
                TeacherView.setSign1('*');
                TeacherView.setSign2('*');
                TeacherView.setSign3('*');
                TeacherView.setSign4('*');
                TeacherView.setSign5('*');
                TeacherView.setSign6('*');
                TeacherView.setSign7('*');
            }
            if (homePage.getTSComboBox().equals("Student"))
            {
                Simple = new SimpleMathPageController(TeacherView, StudentView);
            }
        }

    }
    private class divListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (homePage.getTSComboBox().equals("Teacher")) {
                Simple = new SimpleMathPageController(TeacherModel, TeacherView);
                TeacherView.setSign1('%');
                TeacherView.setSign2('%');
                TeacherView.setSign3('%');
                TeacherView.setSign4('%');
                TeacherView.setSign5('%');
                TeacherView.setSign6('%');
                TeacherView.setSign7('%');
            }
            if (homePage.getTSComboBox().equals("Student"))
            {
                Simple = new SimpleMathPageController(TeacherView, StudentView);
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
