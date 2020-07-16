package Controller;

import Model.Teacher;
import Viewer.MathProblemPage;
import Viewer.TeacherMathProblem;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProblemTestController
{

    private Teacher TeacherModel;
    private TeacherMathProblem TeacherView;
    private MathProblemPage StudentView;
    private double grade=0;

    public ProblemTestController(Teacher TeacherModel, TeacherMathProblem TeacherView)
    {
        this.TeacherView= new TeacherMathProblem();

        this.TeacherModel = TeacherModel;
        this.TeacherView = TeacherView;
        TeacherView.addButtonFinishListener(new ProblemTestController.button_Listener());
    }
    public ProblemTestController(TeacherMathProblem TeacherView, MathProblemPage StudentView)
    {
        this.StudentView= new MathProblemPage();
        this.TeacherView = TeacherView;
        this.StudentView= StudentView;


        StudentView.addStudentButtonListener(new ProblemTestController.StudentButton_Listener());
    }
    class button_Listener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            String que1,que2,que3;

            que1 = TeacherView.getQue1();
            StudentView.setQueNum1(que1);
            que2 = TeacherView.getQue2();
            StudentView.setQueNum1(que2);
            que3= TeacherView.getQue3();
            StudentView.setQueNum1(que3);
        }

    }
    class StudentButton_Listener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {

          if(TeacherModel.IsTrue(StudentView.getAnsNum1(),TeacherView.getAns1()))
          {
              grade+= 100/3;
          }
          if(TeacherModel.IsTrue(StudentView.getAnsNum2(),TeacherView.getAns2()))
          {
              grade+= 100/3;
          }
          if(TeacherModel.IsTrue(StudentView.getAnsNum3(),TeacherView.getAns3()))
          {
              grade+= 100/3;
          }
            JOptionPane.showMessageDialog(null, "You'r grade is:"+grade, "Grades", JOptionPane.WARNING_MESSAGE);
        }

    }
}
