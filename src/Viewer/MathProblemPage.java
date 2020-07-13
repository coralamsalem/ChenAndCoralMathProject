package Viewer;

import javax.swing.*;
import java.awt.event.ActionListener;

public class MathProblemPage {
    private JPanel panel1;
    private JTextArea queNum3;
    private JTextArea queNum1;
    private JTextArea queNum2;
    private JTextField ansNum1;
    private JTextField ansNum2;
    private JTextField ansNum3;
    private JButton finishButton;

    public void addStudentButtonListener(ActionListener finish)
    {

        finishButton.addActionListener(finish);
    }
    public JTextArea getQueNum3() {
        return queNum3;
    }

    public void setQueNum3(String queNum3) {
        this.queNum3.setText(queNum3);
    }

    public JTextArea getQueNum1() {
        return queNum1;
    }

    public void setQueNum1(String queNum1)
    {

        this.queNum1.setText(queNum1);
    }

    public JTextArea getQueNum2() {
        return queNum2;
    }

    public void setQueNum2(String queNum2) {
        this.queNum2.setText(queNum2);
    }

    public String getAnsNum1() {
        return ansNum1.toString();
    }

    public void setAnsNum1(JTextField ansNum1) {
        this.ansNum1 = ansNum1;
    }

    public String getAnsNum2() {
        return ansNum2.toString();
    }

    public void setAnsNum2(JTextField ansNum2) {
        this.ansNum2 = ansNum2;
    }

    public String getAnsNum3() {
        return ansNum3.toString();
    }

    public void setAnsNum3(JTextField ansNum3) {
        this.ansNum3 = ansNum3;
    }

    public JButton getFinishButton() {
        return finishButton;
    }

    public void setFinishButton(JButton finishButton) {
        this.finishButton = finishButton;
    }
}
