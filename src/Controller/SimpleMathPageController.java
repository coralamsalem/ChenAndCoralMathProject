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
    private JButton finishTestButton;
    private SimpleMathTest Simple;
    private Teacher TeacherModel;
    private TeacherSimpleTest TeacherView;
    private SimpleMathTest StudentView;

    public SimpleMathPageController(Teacher TeacherModel, TeacherSimpleTest TeacherView, SimpleMathTest StudentView)
    {
        this.TeacherModel = TeacherModel;
        this.TeacherView = TeacherView;
        this.StudentView= StudentView;

        TeacherView.addButtonFinishListener(new button_Listener());
    }
    class button_Listener implements ActionListener
    {
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
