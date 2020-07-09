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
        JPanel Test = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(200,600);

        Test.add(TestPage);

    }

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

    public JButton getLitBtn() {
        return LitBtn;
    }

    public void setLitBtn(JButton litBtn) {
        LitBtn = litBtn;
    }

    public JButton getPreBtn() {
        return PreBtn;
    }

    public void setPreBtn(JButton preBtn) {
        PreBtn = preBtn;
    }

    public JPanel getTestPage() {
        return TestPage;
    }

    public void setTestPage(JPanel testPage) {
        TestPage = testPage;
    }
}
