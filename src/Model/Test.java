package Model;



import java.io.Serializable;

public class Test implements Serializable
{

   private String Que1firstNum;
   private String Que1secondNum;
   private String Que2firstNum;
   private String Que2secondNum;
   private String Que3firstNum;
   private String Que3secondNum;
   private String Que4firstNum;
   private String Que4secondNum;
   private String Que5firstNum;
   private String Que5secondNum;
   private String Que6firstNum;
   private String Que6secondNum;
   private String Que7firstNum;
   private String Que7secondNum;
   private String sign;
   private int num1;
   private int num2;
   private String answer;

    public Test()
   {
       super();
   }
    public Test(String sign)
    {
    super();
    this.sign=sign;
    }
   public Test(String Que1firstNum,String Que1secondNum,String Que2firstNum,String Que2secondNum,String Que3firstNum,String Que3secondNum,String Que4firstNum,String Que4secondNum,String Que5firstNum,String Que5secondNum,String Que6firstNum,String Que6secondNum,String Que7firstNum,String Que7secondNum, String sign)
   {
       super();
       this.Que1firstNum = Que1firstNum;
       this.Que1secondNum= Que1secondNum;
       this.Que2firstNum = Que2firstNum;
       this.Que2secondNum= Que2secondNum;
       this.Que3firstNum = Que3firstNum;
       this.Que3secondNum= Que3secondNum;
       this.Que4firstNum = Que4firstNum;
       this.Que4secondNum= Que4secondNum;
       this.Que5firstNum = Que5firstNum;
       this.Que5secondNum= Que5secondNum;
       this.Que6firstNum = Que6firstNum;
       this.Que6secondNum= Que6secondNum;
       this.Que7firstNum = Que7firstNum;
       this.Que7secondNum= Que7secondNum;
       this.sign=sign;

   }

   public Test(Test newTest)
   {
       this.Que1firstNum =newTest.getQue1firstNum();
       this.Que1secondNum= newTest.getQue1secondNum();
       this.Que2firstNum = newTest.getQue2firstNum();
       this.Que2secondNum= newTest.getQue2secondNum();
       this.Que3firstNum = newTest.getQue3firstNum();
       this.Que3secondNum= newTest.getQue3secondNum();
       this.Que4firstNum = newTest.getQue4firstNum();
       this.Que4secondNum= newTest.getQue4secondNum();
       this.Que5firstNum = newTest.getQue5firstNum();
       this.Que5secondNum= newTest.getQue5secondNum();
       this.Que6firstNum = newTest.getQue6firstNum();
       this.Que6secondNum= newTest.getQue6secondNum();
       this.Que7firstNum = newTest.getQue7firstNum();
       this.Que7secondNum= newTest.getQue7secondNum();
       this.sign=newTest.getSign();
   }
   public boolean AnswerOfTwoNumbers(String firstNum, String sign1, String secondNum, String StudentAns)
    {
        num1=Integer.parseInt(firstNum);
        num2=Integer.parseInt(secondNum);
        if (sign1.equals("+"))
        {
            answer=String.valueOf(num1+num2);
        }
        if (sign1.equals("-"))
        {
            answer=String.valueOf(num1-num2);
        }
        if (sign1.equals("*"))
        {
            answer=String.valueOf(num1*num2);
        }
        if (sign1.equals("%"))
        {
            answer= String.valueOf(num1/num2);
        }


        if(IsTrue(answer,StudentAns))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean IsTrue(String TeacherAns, String StudentAns)
    {
        if (TeacherAns.equals(StudentAns))
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public String getQue1firstNum() {
        return Que1firstNum;
    }

    public void setQue1firstNum(String que1firstNum) {
        Que1firstNum = que1firstNum;
    }

    public String getQue1secondNum() {
        return Que1secondNum;
    }

    public void setQue1secondNum(String que1secondNum) {
        Que1secondNum = que1secondNum;
    }

    public String getQue2firstNum() {
        return Que2firstNum;
    }

    public void setQue2firstNum(String que2firstNum) {
        Que2firstNum = que2firstNum;
    }

    public String getQue2secondNum() {
        return Que2secondNum;
    }

    public void setQue2secondNum(String que2secondNum) {
        Que2secondNum = que2secondNum;
    }

    public String getQue3firstNum() {
        return Que3firstNum;
    }

    public void setQue3firstNum(String que3firstNum) {
        Que3firstNum = que3firstNum;
    }

    public String getQue3secondNum() {
        return Que3secondNum;
    }

    public void setQue3secondNum(String que3secondNum) {
        Que3secondNum = que3secondNum;
    }

    public String getQue4firstNum() {
        return Que4firstNum;
    }

    public void setQue4firstNum(String que4firstNum) {
        Que4firstNum = que4firstNum;
    }

    public String getQue4secondNum() {
        return Que4secondNum;
    }

    public void setQue4secondNum(String que4secondNum) {
        Que4secondNum = que4secondNum;
    }

    public String getQue5firstNum() {
        return Que5firstNum;
    }

    public void setQue5firstNum(String que5firstNum) {
        Que5firstNum = que5firstNum;
    }

    public String getQue5secondNum() {
        return Que5secondNum;
    }

    public void setQue5secondNum(String que5secondNum) {
        Que5secondNum = que5secondNum;
    }

    public String getQue6firstNum() {
        return Que6firstNum;
    }

    public void setQue6firstNum(String que6firstNum) {
        Que6firstNum = que6firstNum;
    }

    public String getQue6secondNum() {
        return Que6secondNum;
    }

    public void setQue6secondNum(String que6secondNum) {
        Que6secondNum = que6secondNum;
    }

    public String getQue7firstNum() {
        return Que7firstNum;
    }

    public void setQue7firstNum(String que7firstNum) {
        Que7firstNum = que7firstNum;
    }

    public String getQue7secondNum() {
        return Que7secondNum;
    }

    public void setQue7secondNum(String que7secondNum) {
        Que7secondNum = que7secondNum;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}

