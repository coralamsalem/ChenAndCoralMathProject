package Viewer;

import javax.swing.*;
import java.awt.event.ActionListener;

public class TeacherSimpleTest extends JFrame
{

    private JPanel TeacherTest;
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


    public TeacherSimpleTest()
    {
        super("Math test");
        setBounds(300, 300, 800,500);
        getContentPane().add(TeacherTest);
        setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void addButtonFinishListener(ActionListener finish)
    {

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

    public String getSign1() {
        return sign1.toString();
    }

    public void setSign1(String sign1) {
        this.sign1.setText(sign1);
    }

    public String getSign2() {
        return sign2.toString();
    }

    public void setSign2(String sign2) {
        this.sign2.setText(sign2);
    }

    public String getSign3() {
        return sign3.toString();
    }

    public void setSign3(String sign3) {
        this.sign3.setText(sign3);
    }

    public String getSign4() {
        return sign4.toString();
    }

    public void setSign4(String sign4) {
        this.sign4.setText(sign4);
    }

    public String getSign5() {
        return sign5.toString();
    }

    public void setSign5(String sign5) {
        this.sign5.setText(sign5);
    }

    public String getSign6() {
        return sign6.toString();
    }

    public void setSign6(String sign6) {
        this.sign6.setText(sign6);
    }

    public String getSign7() {
        return sign7.toString();
    }

    public void setSign7(String sign7) {
        this.sign7.setText(sign7);
    }

    public JButton getFinishButton() {
        return finishButton;
    }

    public void setFinishButton(JButton finishButton) {
        this.finishButton = finishButton;
    }
}
