package Controller;

import Model.Teacher;
import Model.Test;
import Model.TestRepository.ITestRepository;
import Model.TestRepository.TestRepository;
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
    private double grade=100;
    ITestRepository testRepository;
    private String signTest;


    public SimpleMathPageController(Test TestModel ,SimpleMathTest StudentView ,String sign) throws Exception
    {
        testRepository= TestRepository.getInstance();
        this.TestModel= TestModel;
        this.StudentView= StudentView;
        signTest=sign;
        StudentView.setQue1firstNum(testRepository.findByName(sign).getQue1firstNum());
        StudentView.setQue1secondNum(testRepository.findByName(sign).getQue1secondNum());
        StudentView.setQue2firstNum(testRepository.findByName(sign).getQue2firstNum());
        StudentView.setQue2secondNum(testRepository.findByName(sign).getQue2secondNum());
        StudentView.setQue3firstNum(testRepository.findByName(sign).getQue3firstNum());
        StudentView.setQue3secondNum(testRepository.findByName(sign).getQue3secondNum());
        StudentView.setQue4firstNum(testRepository.findByName(sign).getQue4firstNum());
        StudentView.setQue4secondNum(testRepository.findByName(sign).getQue4secondNum());
        StudentView.setQue5firstNum(testRepository.findByName(sign).getQue5firstNum());
        StudentView.setQue5secondNum(testRepository.findByName(sign).getQue5secondNum());
        StudentView.setQue6firstNum(testRepository.findByName(sign).getQue6firstNum());
        StudentView.setQue6secondNum(testRepository.findByName(sign).getQue6secondNum());
        StudentView.setQue7firstNum(testRepository.findByName(sign).getQue7firstNum());
        StudentView.setQue7secondNum(testRepository.findByName(sign).getQue7secondNum());
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

    class StudentButton_Listener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if (!TestModel.AnswerOfTwoNumbers(testRepository.findByName(signTest).getQue1firstNum(), signTest, testRepository.findByName(signTest).getQue1secondNum(), StudentView.getAns1())) {
                grade -= (100 / 7);
            }
            if (!TestModel.AnswerOfTwoNumbers(testRepository.findByName(signTest).getQue2firstNum(), signTest, testRepository.findByName(signTest).getQue2secondNum(), StudentView.getAns2())) {
                grade -= (100 / 7);
            }
            if (!TestModel.AnswerOfTwoNumbers(testRepository.findByName(signTest).getQue3firstNum(), signTest, testRepository.findByName(signTest).getQue3secondNum(), StudentView.getAns3())) {
                grade -= (100 / 7);
            }
            if (!TestModel.AnswerOfTwoNumbers(testRepository.findByName(signTest).getQue4firstNum(), signTest, testRepository.findByName(signTest).getQue4secondNum(), StudentView.getAns4())){
                grade -= (100 / 7);
            }
            if (!TestModel.AnswerOfTwoNumbers(testRepository.findByName(signTest).getQue5firstNum(), signTest, testRepository.findByName(signTest).getQue5secondNum(), StudentView.getAns5())) {
                grade -= (100 / 7);
            }
            if (!TestModel.AnswerOfTwoNumbers(testRepository.findByName(signTest).getQue6firstNum(), signTest, testRepository.findByName(signTest).getQue6secondNum(), StudentView.getAns6())) {
                grade -=( 100 / 7);
            }
            if (!TestModel.AnswerOfTwoNumbers(testRepository.findByName(signTest).getQue7firstNum(), signTest, testRepository.findByName(signTest).getQue7secondNum(), StudentView.getAns7())){
                grade-= (100/7);
            }

            JOptionPane.showMessageDialog(null,
                    "Your grade is: "+ grade,
                    "Grades",
                    JOptionPane.WARNING_MESSAGE);
            StudentView.exitPage();
        }
    }
}
