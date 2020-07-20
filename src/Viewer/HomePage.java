package Viewer;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class HomePage extends JFrame
{
    private JPanel HomePagePanel;
    private JLabel WelcomeLabel;
    private JComboBox TSComboBox;
    private JButton RegisterBtn;
    private JButton LogBtn;
    private Image backgroundImage;

    public HomePage()
    {
        super("Math Test");
        setBounds(300,100,800,500);
        getContentPane().add(HomePagePanel);
        setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void addRegisterListener(ActionListener finish) { RegisterBtn.addActionListener(finish); }

    public void addLoginListener(ActionListener finish) { LogBtn.addActionListener(finish); }

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

    public JComboBox getTSComboBox() {
        return TSComboBox;
    }

    public void setTSComboBox(JComboBox comboBox) {
        TSComboBox = comboBox;
    }

    public JButton getTheRegisterBtn() {
        return RegisterBtn;
    }

    public void setRegisterBtn(JButton registerBtn) {
        RegisterBtn = registerBtn;
    }

    public JButton getTheLogBtn() {
        return LogBtn;
    }

    public void setLogBtn(JButton logBtn) {
        LogBtn = logBtn;
    }

    public void exitPage() { this.dispose(); }

}
