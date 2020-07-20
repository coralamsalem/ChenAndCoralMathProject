package Viewer;

import javax.swing.*;
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
        setBounds(450, 20, 500,700);
        getContentPane().add(SimpleTest);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    }
    public void showStudentTestView()
    {
        this.setVisible(true);
    }

    public void addStudentButtonListener(ActionListener finish) { finishTestButton.addActionListener(finish); }

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

    public void setQue1firstNum(String que1firstNum) {
        this.que1firstNum.setText(que1firstNum);
    }

    public JTextArea getQue1secondNum() {
        return que1secondNum;
    }

    public void setQue1secondNum(String que1secondNum) {
        this.que1secondNum.setText(que1secondNum);
    }

    public JTextArea getQue2firstNum() {
        return que2firstNum;
    }

    public void setQue2firstNum(String que2firstNum) {
        this.que2firstNum.setText(que2firstNum);
    }

    public JTextArea getQue2secondNum() {
        return que2secondNum;
    }

    public void setQue2secondNum(String que2secondNum) {
        this.que2secondNum.setText(que2secondNum);
    }

    public JTextArea getQue3secondNum() {
        return que3secondNum;
    }

    public void setQue3secondNum(String que3secondNum) {
        this.que3secondNum.setText(que3secondNum);
    }

    public JTextArea getQue3firstNum() {
        return que3firstNum;
    }

    public void setQue3firstNum(String que3firstNum) {
        this.que3firstNum.setText(que3firstNum);
    }

    public JTextArea getQue4secondNum() {
        return que4secondNum;
    }

    public void setQue4secondNum(String que4secondNum) {
        this.que4secondNum.setText(que4secondNum);
    }

    public JTextArea getQue4firstNum() {
        return que4firstNum;
    }

    public void setQue4firstNum(String que4firstNum) {
        this.que4firstNum.setText(que4firstNum);
    }

    public JTextArea getQue5secondNum() {
        return que5secondNum;
    }

    public void setQue5secondNum(String que5secondNum) {
        this.que5secondNum.setText(que5secondNum);
    }

    public JTextArea getQue5firstNum() {
        return que5firstNum;
    }

    public void setQue5firstNum(String que5firstNum) {
        this.que5firstNum.setText(que5firstNum);
    }

    public JTextArea getQue6secondNum() {
        return que6secondNum;
    }

    public void setQue6secondNum(String que6secondNum) {
        this.que6secondNum.setText(que6secondNum);
    }

    public JTextArea getQue6firstNum() {
        return que6firstNum;
    }

    public void setQue6firstNum(String que6firstNum) {
        this.que6firstNum.setText(que6firstNum);
    }

    public JTextArea getQue7secondNum() {
        return que7secondNum;
    }

    public void setQue7secondNum(String que7secondNum) {
        this.que7secondNum.setText(que7secondNum);
    }

    public JTextArea getQue7firstNum() {
        return que7firstNum;
    }

    public void setQue7firstNum(String que7firstNum) {
        this.que7firstNum.setText(que7firstNum);
    }

    public String getAns1() {
        return ans1.getText().toString();
    }

    public void setAns1(JTextField ans1) {
        this.ans1 = ans1;
    }

    public String getAns2() {
        return ans2.getText();
    }

    public void setAns2(JTextField ans2) {
        this.ans2 = ans2;
    }

    public String getAns3() {
        return ans3.getText();
    }

    public void setAns3(JTextField ans3) {
        this.ans3 = ans3;
    }

    public String getAns4() {
        return ans4.getText();
    }

    public void setAns4(JTextField ans4) {
        this.ans4 = ans4;
    }

    public String getAns5() {
        return ans5.getText();
    }

    public void setAns5(JTextField ans5) {
        this.ans5 = ans5;
    }

    public String getAns6() {
        return ans6.getText();
    }

    public void setAns6(JTextField ans6) {
        this.ans6 = ans6;
    }

    public String getAns7() {
        return ans7.getText();
    }

    public void setAns7(JTextField ans7) {
        this.ans7 = ans7;
    }

    public JTextArea getSign7() {
        return sign7;
    }

    public void setSign7(String sign7) {
        this.sign7.append(sign7);
    }

    public JTextArea getSign6() {
        return sign6;
    }

    public void setSign6(String sign6) {
        this.sign6.append(sign6);
    }

    public JTextArea getSign5() {
        return sign5;
    }

    public void setSign5(String sign5) {
        this.sign5.append(sign5);
    }

    public JTextArea getSign4() {
        return sign4;
    }

    public void setSign4(String sign4) {
        this.sign4.append(sign4);
    }

    public JTextArea getSign3() {
        return sign3;
    }

    public void setSign3(String sign3) {
        this.sign3.append(sign3);
    }

    public JTextArea getSign2() {
        return sign2;
    }

    public void setSign2(String sign2) {
        this.sign2.append(sign2);
    }

    public JTextArea getSign1() {
        return sign1;
    }

    public void setSign1(String sign1) {
        this.sign1.append(sign1);
    }

    public void exitPage(){
        this.dispose();
    }
}
