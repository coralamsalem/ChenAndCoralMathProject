package Viewer;

import javax.swing.*;

import java.awt.event.ActionListener;

public class TeacherSimpleTest extends JFrame
{
    private JPanel TeacherView;
    private JTextField que1secondNum;
    private JTextField que1firstNum;
    private JComboBox sign1;
    private JTextField que2firstNum;
    private JTextField que3secondNum;
    private JTextField que3firstNum;
    private JTextField que2secondNum;
    private JTextField que4secondNum;
    private JTextField que4firstNum;
    private JTextField que5secondNum;
    private JTextField que5firstNum;
    private JTextField que6secondNum;
    private JTextField que6firstNum;
    private JTextField que7secondNum;
    private JTextField que7firstNum;
    private JComboBox sign7;
    private JComboBox sign6;
    private JComboBox sign5;
    private JComboBox sign4;
    private JComboBox sign3;
    private JComboBox sign2;
    private JButton finishButton;

    public TeacherSimpleTest()
    {
        JPanel teacherTest = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,400);
        getContentPane().add(teacherTest);
        teacherTest.add(TeacherView);
    }
    public void addButtonFinishListener(ActionListener finish) {
        finishButton.addActionListener(finish);
    }



    public int getQue1secondNum() {
        return Integer.parseInt(que1secondNum.getText());
    }

    public void setQue1secondNum(JTextField que1secondNum) {
        this.que1secondNum = que1secondNum;
    }

    public int getQue1firstNum() {
        return Integer.parseInt(que1firstNum.getText());
    }

    public void setQue1firstNum(JTextField que1firstNum) {
        this.que1firstNum = que1firstNum;
    }

    public JComboBox getSign1() {
        return sign1;
    }

    public void setSign1(JComboBox sign1) {
        this.sign1 = sign1;
    }

    public int getQue2firstNum() {
        return Integer.parseInt(que2firstNum.getText());
    }

    public void setQue2firstNum(JTextField que2firstNum) {
        this.que2firstNum = que2firstNum;
    }

    public int getQue3secondNum() {
        return Integer.parseInt(que3secondNum.getText());
    }

    public void setQue3secondNum(JTextField que3secondNum) {
        this.que3secondNum = que3secondNum;
    }

    public int getQue3firstNum() {
      return Integer.parseInt(que3firstNum.getText());
    }

    public void setQue3firstNum(JTextField que3firstNum) {
        this.que3firstNum = que3firstNum;
    }

    public int getQue2secondNum() {
        return Integer.parseInt(que2secondNum.getText());
    }

    public void setQue2secondNum(JTextField que2secondNum) {
        this.que2secondNum = que2secondNum;
    }

    public int getQue4secondNum() {
        return Integer.parseInt(que4secondNum.getText());
    }

    public void setQue4secondNum(JTextField que4secondNum) {
        this.que4secondNum = que4secondNum;
    }

    public int getQue4firstNum() {
        return Integer.parseInt(que4firstNum.getText());
    }

    public void setQue4firstNum(JTextField que4firstNum) {
        this.que4firstNum = que4firstNum;
    }

    public int getQue5secondNum() {
        return Integer.parseInt(que5secondNum.getText());
    }

    public void setQue5secondNum(JTextField que5secondNum) {
        this.que5secondNum = que5secondNum;
    }

    public int getQue5firstNum() {
        return Integer.parseInt(que5firstNum.getText());
    }

    public void setQue5firstNum(JTextField que5firstNum) {
        this.que5firstNum = que5firstNum;
    }

    public int getQue6secondNum() {
        return Integer.parseInt(que6secondNum.getText());
    }

    public void setQue6secondNum(JTextField que6secondNum) {
        this.que6secondNum = que6secondNum;
    }

    public int getQue6firstNum() {
        return Integer.parseInt(que6firstNum.getText());
    }

    public void setQue6firstNum(JTextField que6firstNum) {
        this.que6firstNum = que6firstNum;
    }

    public int getQue7secondNum() {
        return Integer.parseInt(que7secondNum.getText());
    }

    public void setQue7secondNum(JTextField que7secondNum) {
        this.que7secondNum = que7secondNum;
    }

    public int getQue7firstNum() {
        return Integer.parseInt(que7firstNum.getText());
    }

    public void setQue7firstNum(JTextField que7firstNum) {
        this.que7firstNum = que7firstNum;
    }

    public JComboBox getSign7() {
        return sign7;
    }

    public void setSign7(JComboBox sign7) {
        this.sign7 = sign7;
    }

    public JComboBox getSign6() {
        return sign6;
    }

    public void setSign6(JComboBox sign6) {
        this.sign6 = sign6;
    }

    public JComboBox getSign5() {
        return sign5;
    }

    public void setSign5(JComboBox sign5) {
        this.sign5 = sign5;
    }

    public JComboBox getSign4() {
        return sign4;
    }

    public void setSign4(JComboBox sign4) {
        this.sign4 = sign4;
    }

    public JComboBox getSign3() {
        return sign3;
    }

    public void setSign3(JComboBox sign3) {
        this.sign3 = sign3;
    }

    public JComboBox getSign2() {
        return sign2;
    }

    public void setSign2(JComboBox sign2) {
        this.sign2 = sign2;
    }


}
