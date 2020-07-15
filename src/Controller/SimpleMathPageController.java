package Controller;

import Model.Teacher;
import Model.Test;
import Model.TestRepository.ITestRepository;
import Viewer.SimpleMathTest;
import Viewer.TeacherSimpleTest;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleMathPageController

{
    private Test TestModel;
   private Teacher TeacherModel;
    private SimpleMathTest StudentView;
    private TeacherSimpleTest TeacherView;
    private double grade=0;
    //private File f;
    ITestRepository testRepository;

    public SimpleMathPageController(Test TestModel,SimpleMathTest StudentView ,String sign)
    {
        TestModel= testRepository.findByName(sign);
        this.StudentView = new SimpleMathTest();
        this.TestModel= TestModel;
        this.StudentView= StudentView;
        //TestModel= testRepository.findByName(sign)
        StudentView.setQue1firstNum(this.TestModel.getQue1firstNum());
        StudentView.setQue1secondNum(this.TestModel.getQue1secondNum());
        StudentView.setQue2firstNum(this.TestModel.getQue2firstNum());
        StudentView.setQue2secondNum(this.TestModel.getQue2secondNum());
        StudentView.setQue3firstNum(this.TestModel.getQue3firstNum());
        StudentView.setQue3secondNum(this.TestModel.getQue3secondNum());
        StudentView.setQue4firstNum(this.TestModel.getQue4firstNum());
        StudentView.setQue4secondNum(this.TestModel.getQue4secondNum());
        StudentView.setQue5firstNum(this.TestModel.getQue5firstNum());
        StudentView.setQue5secondNum(this.TestModel.getQue5secondNum());
        StudentView.setQue6firstNum(this.TestModel.getQue6firstNum());
        StudentView.setQue6secondNum(this.TestModel.getQue6secondNum());
        StudentView.setQue7firstNum(this.TestModel.getQue7firstNum());
        StudentView.setQue7secondNum(this.TestModel.getQue7secondNum());
        StudentView.setSign1(sign);
        StudentView.setSign2(sign);
        StudentView.setSign3(sign);
        StudentView.setSign4(sign);
        StudentView.setSign5(sign);
        StudentView.setSign6(sign);
        StudentView.setSign7(sign);
        this.StudentView.showStudentTestView();

        StudentView.addStudentButtonListener(new SimpleMathPageController.StudentButton_Listener());
    }
 //   public void showStudentTestViewer() {
  //      StudentView.showStudentTestView();
 //   }

    class StudentButton_Listener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if (TestModel.AnswerOfTwoNumbers(TestModel.getQue1firstNum(),TestModel.getSign(),TestModel.getQue1secondNum(),StudentView.getAns1()));
                grade+= 100/7;

            if (TestModel.AnswerOfTwoNumbers(TestModel.getQue2firstNum(),TestModel.getSign(),TestModel.getQue2secondNum(),StudentView.getAns2()));
                grade+= 100/7;

            if (TestModel.AnswerOfTwoNumbers(TestModel.getQue3firstNum(),TestModel.getSign(),TestModel.getQue3secondNum(),StudentView.getAns3()));
                grade+= 100/7;

            if (TestModel.AnswerOfTwoNumbers(TestModel.getQue4firstNum(),TestModel.getSign(),TestModel.getQue4secondNum(),StudentView.getAns4()));
                grade+= 100/7;

            if (TestModel.AnswerOfTwoNumbers(TestModel.getQue5firstNum(),TestModel.getSign(),TestModel.getQue5secondNum(),StudentView.getAns5()));
                grade+= 100/7;

            if (TestModel.AnswerOfTwoNumbers(TestModel.getQue6firstNum(),TestModel.getSign(),TestModel.getQue6secondNum(),StudentView.getAns6()));
                grade+= 100/7;

            if (TestModel.AnswerOfTwoNumbers(TestModel.getQue7firstNum(),TestModel.getSign(),TestModel.getQue7secondNum(),StudentView.getAns7()));
                grade+= 100/7;


            JOptionPane.showMessageDialog(null,
                    "You'r grade is:"+grade,
                    "Grades",
                    JOptionPane.WARNING_MESSAGE);
        }
    }




}
