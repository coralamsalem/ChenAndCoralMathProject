package Viewer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleMathTest extends JFrame  {
    private JPanel SimpleTest;
    private JTextArea que1firstNum;
    private JTextArea que1secondNum;
    private JTextArea que2firstNum;
    private JTextArea que2secondNum;
    private JTextArea que3secondNum;
    private JTextArea que3firstNum;
    private JTextArea que4secondNum;
    private JTextArea que4firstNum;
    private JTextArea que5secondNum;
    private JTextArea que5firstNum;
    private JTextArea que6secondNum;
    private JTextArea que6firstNum;
    private JComboBox Sign6;
    private JComboBox Sign5;
    private JComboBox Sign4;
    private JComboBox Sign3;
    private JComboBox Sign2;
    private JComboBox Sign1;
    private JComboBox Sign7;
    private JTextArea que7secondNum;
    private JTextArea que7firstNum;
    private JTextField ans1;
    private JTextField ans2;
    private JTextField ans3;
    private JTextField ans4;
    private JTextField ans5;
    private JTextField ans6;
    private JTextField ans7;
    private JButton finishTestButton;
    private JTextArea sign7;
    private JTextArea sign6;
    private JTextArea sign5;
    private JTextArea sign4;
    private JTextArea sign3;
    private JTextArea sign2;
    private JTextArea sign1;
    private JPanel finishTest;

    public SimpleMathTest()
    {
        super("Math test");
        setBounds(300, 300, 800,500);
        getContentPane().add(SimpleTest);
        setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public JPanel getFinishTest() {
        return finishTest;
    }

    public void setFinishTest(JPanel finishTest) {
        this.finishTest = finishTest;
    }

    public JButton getFinishTestButton() {
        return finishTestButton;
    }

    public void setFinishTestButton(JButton finishTestButton) {
        this.finishTestButton = finishTestButton;
    }

    public JTextArea getQue1firstNum() {
        return que1firstNum;
    }

    public void setQue1firstNum(JTextArea que1firstNum) {
        this.que1firstNum = que1firstNum;
    }

    public JTextArea getQue1secondNum() {
        return que1secondNum;
    }

    public void setQue1secondNum(JTextArea que1secondNum) {
        this.que1secondNum = que1secondNum;
    }

    public JTextArea getQue2firstNum() {
        return que2firstNum;
    }

    public void setQue2firstNum(JTextArea que2firstNum) {
        this.que2firstNum = que2firstNum;
    }

    public JTextArea getQue2secondNum() {
        return que2secondNum;
    }

    public void setQue2secondNum(JTextArea que2secondNum) {
        this.que2secondNum = que2secondNum;
    }

    public JTextArea getQue3secondNum() {
        return que3secondNum;
    }

    public void setQue3secondNum(JTextArea que3secondNum) {
        this.que3secondNum = que3secondNum;
    }

    public JTextArea getQue3firstNum() {
        return que3firstNum;
    }

    public void setQue3firstNum(JTextArea que3firstNum) {
        this.que3firstNum = que3firstNum;
    }

    public JTextArea getQue4secondNum() {
        return que4secondNum;
    }

    public void setQue4secondNum(JTextArea que4secondNum) {
        this.que4secondNum = que4secondNum;
    }

    public JTextArea getQue4firstNum() {
        return que4firstNum;
    }

    public void setQue4firstNum(JTextArea que4firstNum) {
        this.que4firstNum = que4firstNum;
    }

    public JTextArea getQue5secondNum() {
        return que5secondNum;
    }

    public void setQue5secondNum(JTextArea que5secondNum) {
        this.que5secondNum = que5secondNum;
    }

    public JTextArea getQue5firstNum() {
        return que5firstNum;
    }

    public void setQue5firstNum(JTextArea que5firstNum) {
        this.que5firstNum = que5firstNum;
    }

    public JTextArea getQue6secondNum() {
        return que6secondNum;
    }

    public void setQue6secondNum(JTextArea que6secondNum) {
        this.que6secondNum = que6secondNum;
    }

    public JTextArea getQue6firstNum() {
        return que6firstNum;
    }

    public void setQue6firstNum(JTextArea que6firstNum) {
        this.que6firstNum = que6firstNum;
    }

    public JComboBox getSign6() {
        return Sign6;
    }

    public void setSign6(JComboBox sign6) {
        Sign6 = sign6;
    }

    public JComboBox getSign5() {
        return Sign5;
    }

    public void setSign5(JComboBox sign5) {
        Sign5 = sign5;
    }

    public JComboBox getSign4() {
        return Sign4;
    }

    public void setSign4(JComboBox sign4) {
        Sign4 = sign4;
    }

    public JComboBox getSign3() {
        return Sign3;
    }

    public void setSign3(JComboBox sign3) {
        Sign3 = sign3;
    }

    public JComboBox getSign2() {
        return Sign2;
    }

    public void setSign2(JComboBox sign2) {
        Sign2 = sign2;
    }

    public JComboBox getSign1() {
        return Sign1;
    }

    public void setSign1(JComboBox sign1) {
        Sign1 = sign1;
    }

    public JComboBox getSign7() {
        return Sign7;
    }

    public void setSign7(JComboBox sign7) {
        Sign7 = sign7;
    }

    public JTextArea getQue7secondNum() {
        return que7secondNum;
    }

    public void setQue7secondNum(JTextArea que7secondNum) {
        this.que7secondNum = que7secondNum;
    }

    public JTextArea getQue7firstNum() {
        return que7firstNum;
    }

    public void setQue7firstNum(JTextArea que7firstNum) {
        this.que7firstNum = que7firstNum;
    }

    public JTextField getAns1() {
        return ans1;
    }

    public void setAns1(JTextField ans1) {
        this.ans1 = ans1;
    }

    public JTextField getAns2() {
        return ans2;
    }

    public void setAns2(JTextField ans2) {
        this.ans2 = ans2;
    }

    public JTextField getAns3() {
        return ans3;
    }

    public void setAns3(JTextField ans3) {
        this.ans3 = ans3;
    }

    public JTextField getAns4() {
        return ans4;
    }

    public void setAns4(JTextField ans4) {
        this.ans4 = ans4;
    }

    public JTextField getAns5() {
        return ans5;
    }

    public void setAns5(JTextField ans5) {
        this.ans5 = ans5;
    }

    public JTextField getAns6() {
        return ans6;
    }

    public void setAns6(JTextField ans6) {
        this.ans6 = ans6;
    }

    public JTextField getAns7() {
        return ans7;
    }

    public void setAns7(JTextField ans7) {
        this.ans7 = ans7;
    }


}
