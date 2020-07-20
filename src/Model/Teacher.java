package Model;

public class Teacher extends User
{
    private int num1;
    private int num2;
    private String sign;
    private String problem;
    private String answer;

    public String getAnswer()
    {
        return answer;
    }
    public int getNum1() {
        return num1;
    }
    public void setNum1(int num)
    {
        this.num1=num;
    }
    public int getNum2() {
        return num2;
    }
    public void setNum2(int num)
    {
        this.num2=num;
    }
    public void setAnswer(double num)
    {
        this.answer=Double.toString(num);
    }
    public String getProblem() {
        return problem;
    }
    public void setProblem(String problem1)
    {
        this.problem=problem1;
    }
    public String getSign() {
        return sign;
    }
    public void setSign(String sign1) { this.sign=sign1; }
    public void setGrade(double newgrade)
    {
        Student.setGrade(newgrade);
    }

    public Teacher(String id, String name, String lastName, String username, String password, String profession) {
        super(id, name, lastName, username, password, profession);
    }

    public Teacher(User newUser) {
        super(newUser);
    }
}
