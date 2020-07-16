package Controller;

import Model.Test;
import Model.TestRepository.ITestRepository;
import Viewer.TeacherSimpleTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TeacherSimpleTestController

{
    ITestRepository testRepository;
    private Test TestModel;
    private TeacherSimpleTest TeacherView;
    String signTest;

    public TeacherSimpleTestController(Test TestModel, TeacherSimpleTest TeacherView)
    {

        this.TeacherView= TeacherView;
        this.TestModel= TestModel;

        this.TeacherView.showTeacerTestView();
        this.TeacherView.addButtonFinishListener(new TeacherSimpleTestController.button_Listener());
    }
    //public void showTeacerTestViewer() {
       // TeacherView.showTeacerTestView();
   // }
    class button_Listener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            Test newTest= new Test(TeacherView.getQue1firstNum(),TeacherView.getQue1secondNum(),TeacherView.getQue2firstNum(),TeacherView.getQue2secondNum(),TeacherView.getQue3firstNum(), TeacherView.getQue3secondNum(),TeacherView.getQue4firstNum(), TeacherView.getQue4secondNum(),TeacherView.getQue5firstNum(), TeacherView.getQue5secondNum(),TeacherView.getQue6firstNum(), TeacherView.getQue6secondNum(),TeacherView.getQue7firstNum(), TeacherView.getQue7secondNum(),signTest);
            try {
                testRepository.add(newTest);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }

    }
}

