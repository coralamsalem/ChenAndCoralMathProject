package Controller;

import Model.Teacher;
import Viewer.TeacherSimpleTest;
import Viewer.SimpleMathTest;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleMathPageController
{
    private Teacher TeacherModel;
    private TeacherSimpleTest TeacherView;
    private SimpleMathTest StudentView;
    private double grade=0;


    public SimpleMathPageController(Teacher TeacherModel,TeacherSimpleTest TeacherView)
    {
        this.TeacherView = new TeacherSimpleTest();
        this.TeacherModel = TeacherModel;
        this.TeacherView = TeacherView;
        TeacherView.addButtonFinishListener(new SimpleMathPageController.button_Listener());

    }
    public SimpleMathPageController(TeacherSimpleTest TeacherView, SimpleMathTest StudentView)
    {
        this.StudentView = new SimpleMathTest();
        this.TeacherView = TeacherView;
        this.StudentView= StudentView;

        StudentView.addStudentButtonListener(new SimpleMathPageController.StudentButton_Listener());
    }

    class button_Listener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            int Que1firstNum,Que2firstNum ,Que3firstNum,Que4firstNum,Que5firstNum,Que6firstNum,Que7firstNum;
            int Que1secondNum,Que2secondNum,Que3secondNum,Que4secondNum,Que5secondNum,Que6secondNum,Que7secondNum;

            Que1firstNum = TeacherView.getQue1firstNum();
            Que1secondNum = TeacherView.getQue1secondNum();

            StudentView.setQue1firstNum(Que1firstNum);
            StudentView.setQue1secondNum(Que1secondNum);


            Que2firstNum = TeacherView.getQue2firstNum();
            Que2secondNum = TeacherView.getQue2secondNum();

            StudentView.setQue2firstNum(Que2firstNum);
            StudentView.setQue2secondNum(Que2secondNum);


            Que3firstNum = TeacherView.getQue3firstNum();
            Que3secondNum = TeacherView.getQue3secondNum();

            StudentView.setQue3firstNum(Que3firstNum);
            StudentView.setQue3secondNum(Que3secondNum);


            Que4firstNum = TeacherView.getQue4firstNum();
            Que4secondNum = TeacherView.getQue4secondNum();

            StudentView.setQue4firstNum(Que4firstNum);
            StudentView.setQue4secondNum(Que4secondNum);


            Que5firstNum = TeacherView.getQue5firstNum();
            Que5secondNum = TeacherView.getQue5secondNum();

            StudentView.setQue5firstNum(Que5firstNum);
            StudentView.setQue5secondNum(Que5secondNum);


            Que6firstNum = TeacherView.getQue6firstNum();
            Que6secondNum = TeacherView.getQue6secondNum();

            StudentView.setQue6firstNum(Que6firstNum);
            StudentView.setQue6secondNum(Que6secondNum);


            Que7firstNum = TeacherView.getQue7firstNum();
            Que7secondNum = TeacherView.getQue7secondNum();

            StudentView.setQue7firstNum(Que7firstNum);
            StudentView.setQue7secondNum(Que7secondNum);

        }
    }
    class StudentButton_Listener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if (TeacherModel.AnswerOfTwoNumbers(TeacherView.getQue1firstNum(),TeacherView.getSign1(),TeacherView.getQue1secondNum(),StudentView.getAns1()));
                grade+= 100/7;

            if (TeacherModel.AnswerOfTwoNumbers(TeacherView.getQue2firstNum(),TeacherView.getSign2(),TeacherView.getQue2secondNum(),StudentView.getAns2()));
                grade+= 100/7;

            if (TeacherModel.AnswerOfTwoNumbers(TeacherView.getQue3firstNum(),TeacherView.getSign3(),TeacherView.getQue3secondNum(),StudentView.getAns3()));
                grade+= 100/7;

            if (TeacherModel.AnswerOfTwoNumbers(TeacherView.getQue4firstNum(),TeacherView.getSign4(),TeacherView.getQue4secondNum(),StudentView.getAns4()));
                grade+= 100/7;

            if (TeacherModel.AnswerOfTwoNumbers(TeacherView.getQue5firstNum(),TeacherView.getSign5(),TeacherView.getQue5secondNum(),StudentView.getAns5()));
                grade+= 100/7;

            if (TeacherModel.AnswerOfTwoNumbers(TeacherView.getQue6firstNum(),TeacherView.getSign6(),TeacherView.getQue6secondNum(),StudentView.getAns6()));
                grade+= 100/7;

            if (TeacherModel.AnswerOfTwoNumbers(TeacherView.getQue7firstNum(),TeacherView.getSign7(),TeacherView.getQue7secondNum(),StudentView.getAns7()));
                grade+= 100/7;


            JOptionPane.showMessageDialog(null,
                    "You'r grade is:"+grade,
                    "Grades",
                    JOptionPane.WARNING_MESSAGE);
        }
    }




}
