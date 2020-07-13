package Model;

public class Teacher extends User
{
    private int num1;
    private int num2;
    private String sign;
    private String problem;
    private String answer;

    public boolean AnswerOfTwoNumbers(int firstNum, String sign1, int secondNum, String StudentAns)
    {
        if (sign1.equals("+"))
        {
            answer=Integer.toString(firstNum+secondNum);
        }
        if (sign1.equals("-"))
        {
            answer=Integer.toString(firstNum-secondNum);
        }
        if (sign1.equals("%"))
       {
            answer=Double.toString(firstNum%secondNum);
        }
            if (sign1.equals("*"))
        {
            answer= Integer.toString(firstNum*secondNum);
        }
            if(IsTrue(answer,StudentAns))
            {
                return true;
            }
            return false;
    }

    public boolean IsTrue(String TeacherAns, String StudentAns)
    {
        if (TeacherAns.equals(StudentAns))
        {
            return true;
        }

        return false;
    }
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
    public void setSign(String sign1)
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
