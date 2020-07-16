package Model;

public interface IStudent {

    public static void setGrade(double newgrade)
    {
        System.out.println("your grade is:");
        System.out.println(newgrade);
    }

    public double getGrade();

}
