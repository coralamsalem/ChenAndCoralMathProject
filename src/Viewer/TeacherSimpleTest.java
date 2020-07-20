package Viewer;

import javax.swing.*;
import java.awt.event.ActionListener;

public class TeacherSimpleTest extends JFrame
{
    private JTextField que1secondNum;
    private JTextField que1firstNum;
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
    private JButton finishButton;
    private JTextArea sign1;
    private JTextArea sign2;
    private JTextArea sign3;
    private JTextArea sign4;
    private JTextArea sign5;
    private JTextArea sign6;
    private JTextArea sign7;
    private JPanel TeacherSimpleTest;

    public TeacherSimpleTest()
    {
        getContentPane().add(TeacherSimpleTest);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setBounds(450, 20, 500,700);
        setVisible(true);
    }

    public void addButtonFinishListener(ActionListener finish)
    {
        finishButton.addActionListener(finish);
    }

    public void showTeacherTestView()
    {
        this.setVisible(true);
    }

    public String getQue1secondNum() {
        return que1secondNum.getText();
    }

    public void setQue1secondNum(JTextField que1secondNum) {
        this.que1secondNum = que1secondNum;
    }

    public String getQue1firstNum() {
        return que1firstNum.getText();
    }

    public void setQue1firstNum(JTextField que1firstNum) {
        this.que1firstNum = que1firstNum;
    }

    public String getQue2firstNum() {
        return que2firstNum.getText();
    }

    public void setQue2firstNum(JTextField que2firstNum) {
        this.que2firstNum = que2firstNum;
    }

    public String getQue3secondNum() {
        return que3secondNum.getText();
    }

    public void setQue3secondNum(JTextField que3secondNum) {
        this.que3secondNum = que3secondNum;
    }

    public String getQue3firstNum() {
        return que3firstNum.getText();
    }

    public void setQue3firstNum(JTextField que3firstNum) {
        this.que3firstNum = que3firstNum;
    }

    public String getQue2secondNum() {
        return que2secondNum.getText();
    }

    public void setQue2secondNum(JTextField que2secondNum) {
        this.que2secondNum = que2secondNum;
    }

    public String getQue4secondNum() {
        return que4secondNum.getText();
    }

    public void setQue4secondNum(JTextField que4secondNum) {
        this.que4secondNum = que4secondNum;
    }

    public String getQue4firstNum() {
        return que4firstNum.getText();
    }

    public void setQue4firstNum(JTextField que4firstNum) {
        this.que4firstNum = que4firstNum;
    }

    public String getQue5secondNum() {
        return que5secondNum.getText();
    }

    public void setQue5secondNum(JTextField que5secondNum) {
        this.que5secondNum = que5secondNum;
    }

    public String getQue5firstNum() {
        return que5firstNum.getText();
    }

    public void setQue5firstNum(JTextField que5firstNum) {
        this.que5firstNum = que5firstNum;
    }

    public String getQue6secondNum() {
        return que6secondNum.getText();
    }

    public void setQue6secondNum(JTextField que6secondNum) {
        this.que6secondNum = que6secondNum;
    }

    public String getQue6firstNum() {
        return que6firstNum.getText();
    }

    public void setQue6firstNum(JTextField que6firstNum) {
        this.que6firstNum = que6firstNum;
    }

    public String getQue7secondNum() {
        return que7secondNum.getText();
    }

    public void setQue7secondNum(JTextField que7secondNum) {
        this.que7secondNum = que7secondNum;
    }

    public String getQue7firstNum() {
        return que7firstNum.getText();
    }

    public void setQue7firstNum(JTextField que7firstNum) {
        this.que7firstNum = que7firstNum;
    }

    public String getSign1() {
        return sign1.toString();
    }

    public void setSign1(String signTest) {
        this.sign1.setText(signTest);
    }

    public String getSign2() {
        return sign2.toString();
    }

    public void setSign2(String signTest) {
        this.sign2.setText(signTest);
    }

    public String getSign3() {
        return sign3.toString();
    }

    public void setSign3(String signTest) {
        this.sign3.setText(signTest);
    }

    public String getSign4() {
        return sign4.toString();
    }

    public void setSign4(String signTest) {
        this.sign4.setText(signTest);
    }

    public String getSign5() {
        return sign5.toString();
    }

    public void setSign5(String signTest) {
        this.sign5.setText(signTest);
    }

    public String getSign6() {
        return sign6.toString();
    }

    public void setSign6(String signTest) {
        this.sign6.setText(signTest);
    }

    public String getSign7() {
        return sign7.toString();
    }

    public void setSign7(String signTest) {
        this.sign7.setText(signTest);
    }

    public JButton getFinishButton() {
        return finishButton;
    }

    public void setFinishButton(JButton finishButton) {
        this.finishButton = finishButton;
    }

    public void setTeacherSimpleTest(JPanel teacherSimpleTest) {
        TeacherSimpleTest = teacherSimpleTest;
    }

    public void exitPage(){
        this.dispose();
    }
}
