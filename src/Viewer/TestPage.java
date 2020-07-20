package Viewer;

import javax.swing.*;

public class TestPage extends JFrame {

    private JButton AddBtn;
    private JButton SubBtn;
    private JButton MulBtn;
    private JButton DivBtn;
    private JButton LitBtn;
    private JButton PreBtn;
    private JPanel TestPage;

    public TestPage()
    {
        getContentPane().add(TestPage);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setBounds(500,150,400,400);
        setVisible(true);
    }

    public void showTestPageView() {this.setVisible(true);}

    public JButton getAddBtn() {
        return AddBtn;
    }

    public void setAddBtn(JButton addBtn) {
        AddBtn = addBtn;
    }

    public JButton getSubBtn() {
        return SubBtn;
    }

    public void setSubBtn(JButton subBtn) {
        SubBtn = subBtn;
    }

    public JButton getMulBtn() {
        return MulBtn;
    }

    public void setMulBtn(JButton mulBtn) {
        MulBtn = mulBtn;
    }

    public JButton getDivBtn() {
        return DivBtn;
    }

    public void setDivBtn(JButton divBtn) {
        DivBtn = divBtn;
    }

    public JPanel getTestPage() {
        return TestPage;
    }

    public void setTestPage(JPanel testPage) {
        TestPage = testPage;
    }

    public void exitPage() { this.dispose(); }

}
