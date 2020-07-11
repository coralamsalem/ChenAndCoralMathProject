package Model;

public class Teacher extends User
{
    private int num1;
    private int num2;
    private char sign;
    private String problem;
    private double answer;

    public void AnswerOfTwoNumbers(int firstNum, char sign1, int secondNum)
    {
        if (sign1== '+')
        {
            answer= firstNum+secondNum;
        }
        if (sign1== '-')
        {
            answer= firstNum-secondNum;
        }
        if (sign1== '%')
       {
            answer= firstNum%secondNum;
        }
            if (sign1== '*')
        {
        answer= firstNum*secondNum;
        }
    }
    public double getAnswer()
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
        this.answer=num;
    }
    public String getProblem() {
        return problem;
    }
    public void setProblem(String problem1)
    {
        this.problem=problem1;
    }
    public char getSign() {
        return sign;
    }
    public void setSign(char sign1)
    {
        this.sign=sign1;
    }

    public Teacher(String id, String name, String password, String profession) {
        super(id, name, password, profession);
    }
    public void setGrade(double newgrade)
    {
        Student.setGrade(newgrade);
    }

}
