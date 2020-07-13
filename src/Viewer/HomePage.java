package Viewer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends JFrame
{
    private JPanel HomePagePanel;
    private JLabel WelcomeLabel;
    private JComboBox TSComboBox;
    private JButton RegisterBtn;
    private JButton LogBtn;

    public HomePage()
    {
        super("Math Test");
        setBounds(300,300,800,500);
        getContentPane().add(HomePagePanel);
        setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JPanel getHomePagePanel() {
        return HomePagePanel;
    }

    public void setHomePagePanel(JPanel homePagePanel) {
        HomePagePanel = homePagePanel;
    }

    public JLabel getWelcomeLabel() {
        return WelcomeLabel;
    }

    public void setWelcomeLabel(JLabel welcomeLabel) {
        WelcomeLabel = welcomeLabel;
    }

    public String getTSComboBox() {
        return TSComboBox.getSelectedItem().toString();
    }

    public void setTSComboBox(JComboBox TSComboBox) {
        this.TSComboBox = TSComboBox;
    }

    public JButton getRegisterBtn() {
        return RegisterBtn;
    }

    public void setRegisterBtn(JButton registerBtn) {
        RegisterBtn = registerBtn;
    }

    public JButton getLogBtn() {
        return LogBtn;
    }

    public void setLogBtn(JButton logBtn) {
        LogBtn = logBtn;
    }
}
