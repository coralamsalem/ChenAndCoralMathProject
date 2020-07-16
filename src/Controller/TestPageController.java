package Controller;

import Model.Teacher;
import Model.Test;
import Viewer.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestPageController {
    private Teacher TeacherModel;
    private Test testModel;

    private SimpleMathPageController Simple;
    private ProblemTestController problem;
    private TeacherSimpleTestController teacherController;

    private TestPage testpage;
    private LoginPage loginPage;
    private HomePage homePage;
    private TeacherSimpleTest TeacherView;
    private SimpleMathTest StudentView;
    private TeacherMathProblem TeacherPro;
    private MathProblemPage StudentPro;

    private String value;
    private String sign;
    private String pro;


    //private JComboBox comboBox;

    private JButton AddBtn;
    private JButton SubBtn;
    private JButton MulBtn;
    private JButton DivBtn;
    private JButton LitBtn;
    private JButton PreBtn;

    public TestPageController(String pro) {

        testpage = new TestPage();
        AddBtn = testpage.getAddBtn();
        SubBtn = testpage.getSubBtn();
        MulBtn = testpage.getMulBtn();
        DivBtn = testpage.getDivBtn();
        LitBtn = testpage.getLitBtn();
        PreBtn = testpage.getPreBtn();
        //comboBox = homePage.getTSComboBox();
        testpage.setVisible(true);
        this.pro=pro;

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
            sign = "+";
            if(pro.equals("Teacher")) {

                teacherController = new TeacherSimpleTestController(testModel, TeacherView, sign);
            }
            if(pro.equals("Student"))
            {
                Simple= new SimpleMathPageController(testModel,StudentView,sign);
            }
        }

    }
    private class subListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            sign = "-";
            if(pro.equals("Teacher")) {

                teacherController = new TeacherSimpleTestController(testModel, TeacherView, sign);
            }
            if(pro.equals("Student"))
            {
                Simple= new SimpleMathPageController(testModel,StudentView,sign);
            }
        }

    }
    private class mulListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            sign = "*";
            if(pro.equals("Teacher")) {

                teacherController = new TeacherSimpleTestController(testModel, TeacherView, sign);
            }
            if(pro.equals("Student"))
            {
                Simple= new SimpleMathPageController(testModel,StudentView,sign);
            }

        }

    }
    private class divListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            sign = "%";
            if(pro.equals("Teacher")) {

                teacherController = new TeacherSimpleTestController(testModel, TeacherView, sign);
            }
            if(pro.equals("Student"))
            {
                Simple= new SimpleMathPageController(testModel,StudentView,sign);
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