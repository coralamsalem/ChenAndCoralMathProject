package Model;
import Model.Teacher;

public class Student extends User
{
    private double grade;

    public static void setGrade(double newgrade)
    {
        System.out.println("your grade is:");
        System.out.println(newgrade);
    }

    public double getGrade() { return grade; }

    public Student(String id, String name, String lastName, String username, String password, String profession, double grade) {
        super(id, name, lastName, username, password, profession);
    }
}
