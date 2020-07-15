package Model;

public interface ITeacher {

    public boolean AnswerOfTwoNumbers(int firstNum, String sign1, int secondNum, String StudentAns);

    public boolean IsTrue(String TeacherAns, String StudentAns);

    public String getAnswer();

    public int getNum1();

    public void setNum1(int num);

    public int getNum2();

    public void setNum2(int num);

    public void setAnswer(double num);

    public String getProblem();

    public void setProblem(String problem1);

    public String getSign();

    public void setSign(String sign1);


}
