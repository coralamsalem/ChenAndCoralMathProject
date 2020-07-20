package Controller;

import Model.Teacher;
import Model.Test;
import Viewer.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestPageController {
    private Teacher TeacherModel;
    private SimpleMathPageController Simple;
    private TestPage testpage;
    private LoginPage loginPage;
    private HomePage homePage;
    private SimpleMathTest StudentView;

    private String value;
    private String sign;
    private String pro;


    //private JComboBox comboBox;

    private JButton AddBtn;
    private JButton SubBtn;
    private JButton MulBtn;
    private JButton DivBtn;


    public TestPageController(String pro) {

        testpage = new TestPage();
        AddBtn = testpage.getAddBtn();
        SubBtn = testpage.getSubBtn();
        MulBtn = testpage.getMulBtn();
        DivBtn = testpage.getDivBtn();

        this.pro = pro;

        AddBtn.addActionListener(new addListener());
        SubBtn.addActionListener(new subListener());
        MulBtn.addActionListener(new mulListener());
        DivBtn.addActionListener(new divListener());


    }

    public void showTestPage() {
        testpage.showTestPageView();
    }

    private class addListener implements ActionListener {
        @Override

        public void actionPerformed(ActionEvent e) {
            sign = "+";
            if (pro.equals("Teacher")) {

                TeacherSimpleTest TeacherView = new TeacherSimpleTest();
                Test testModel = new Test();
                TeacherSimpleTestController teacherController = new TeacherSimpleTestController(testModel, TeacherView, sign);
                testpage.exitPage();
            }

            if (pro.equals("Student")) {
                SimpleMathTest StudentView = new SimpleMathTest();
                Test testModel = new Test();
                try {
                    SimpleMathPageController Simple = new SimpleMathPageController(testModel, StudentView, sign);
                    testpage.exitPage();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }

            }
        }

    }

    private class subListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            sign = "-";
            if (pro.equals("Teacher")) {

                TeacherSimpleTest TeacherView = new TeacherSimpleTest();
                Test testModel = new Test();
                TeacherSimpleTestController teacherController = new TeacherSimpleTestController(testModel, TeacherView, sign);
                testpage.exitPage();
            }

            if (pro.equals("Student")) {
                SimpleMathTest StudentView = new SimpleMathTest();
                Test testModel = new Test();
                try {
                    SimpleMathPageController Simple = new SimpleMathPageController(testModel, StudentView, sign);
                    testpage.exitPage();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }

            }

        }

    }

    private class mulListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            sign = "*";
            if (pro.equals("Teacher")) {

                TeacherSimpleTest TeacherView = new TeacherSimpleTest();
                Test testModel = new Test();
                TeacherSimpleTestController teacherController = new TeacherSimpleTestController(testModel, TeacherView, sign);
                testpage.exitPage();
            }

            if (pro.equals("Student")) {
                SimpleMathTest StudentView = new SimpleMathTest();
                Test testModel = new Test();
                try {
                    SimpleMathPageController Simple = new SimpleMathPageController(testModel, StudentView, sign);
                    testpage.exitPage();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
    }

    private class divListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            sign = "%";
            if (pro.equals("Teacher")) {

                TeacherSimpleTest TeacherView = new TeacherSimpleTest();
                Test testModel = new Test();
                TeacherSimpleTestController teacherController = new TeacherSimpleTestController(testModel, TeacherView, sign);
                testpage.exitPage();
            }

            if (pro.equals("Student")) {
                SimpleMathTest StudentView = new SimpleMathTest();
                Test testModel = new Test();
                try {
                    SimpleMathPageController Simple = new SimpleMathPageController(testModel, StudentView, sign);
                    testpage.exitPage();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }

            }
        }
    }

}