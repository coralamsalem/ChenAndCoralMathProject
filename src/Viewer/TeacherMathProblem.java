package Viewer;

import javax.swing.*;
import java.awt.event.ActionListener;

public class TeacherMathProblem {
    private JTextField que1;
    private JTextField que2;
    private JTextField que3;
    private JButton FinishButton;
    private JTextField ans1;
    private JTextField ans2;
    private JTextField ans3;


    public void addButtonFinishListener(ActionListener finish)
    {

        FinishButton.addActionListener(finish);
    }

    public String getQue1()
    {
        return que1.toString();

    }

    public void setQue1(JTextField que1) {
        this.que1 = que1;
    }

    public String getQue2() {
        return que2.toString();
    }

    public void setQue2(JTextField que2) {
        this.que2 = que2;
    }

    public String getQue3() {
        return que3.toString();
    }

    public void setQue3(JTextField que3) {
        this.que3 = que3;
    }

    public JButton getFinishButton() {
        return FinishButton;
    }

    public void setFinishButton(JButton finishButton) {
        FinishButton = finishButton;
    }

    public String getAns1() {
        return ans1.toString();
    }

    public void setAns1(JTextField ans1) {
        this.ans1 = ans1;
    }

    public String getAns2() {
        return ans2.toString();
    }

    public void setAns2(JTextField ans2) {
        this.ans2 = ans2;
    }

    public String getAns3() {
        return ans3.toString();
    }

    public void setAns3(JTextField ans3) {
        this.ans3 = ans3;
    }


}
