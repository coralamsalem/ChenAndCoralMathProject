package Controller;

import Model.Test;
import Model.TestRepository.ITestRepository;
import Model.TestRepository.TestRepository;
import Viewer.TeacherSimpleTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TeacherSimpleTestController

{
    ITestRepository testRepository;
    private Test TestModel;
    private TeacherSimpleTest TeacherView;
    String signTest;

    public TeacherSimpleTestController(Test TestModel, TeacherSimpleTest TeacherView,String sign)
    {
        this.TeacherView= TeacherView;
        this.TestModel= TestModel;
        signTest= sign;
        this.TeacherView.setSign1(signTest);
        this.TeacherView.setSign2(signTest);
        this.TeacherView.setSign3(signTest);
        this.TeacherView.setSign4(signTest);
        this.TeacherView.setSign5(signTest);
        this.TeacherView.setSign6(signTest);
        this.TeacherView.setSign7(signTest);

        this.TeacherView.showTeacherTestView();
        this.TeacherView.addButtonFinishListener(new TeacherSimpleTestController.button_Listener());
    }

    class button_Listener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            Test newTest= new Test(TeacherView.getQue1firstNum(),TeacherView.getQue1secondNum(),TeacherView.getQue2firstNum(),TeacherView.getQue2secondNum(),TeacherView.getQue3firstNum(), TeacherView.getQue3secondNum(),TeacherView.getQue4firstNum(), TeacherView.getQue4secondNum(),TeacherView.getQue5firstNum(), TeacherView.getQue5secondNum(),TeacherView.getQue6firstNum(), TeacherView.getQue6secondNum(),TeacherView.getQue7firstNum(), TeacherView.getQue7secondNum(),signTest);
            try {
                testRepository = TestRepository.getInstance();
                testRepository.delete(signTest);
                testRepository.add1(newTest);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            TeacherView.exitPage();
        }

    }


}

