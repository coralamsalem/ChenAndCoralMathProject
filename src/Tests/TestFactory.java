package Tests;

import Controller.RegisterPageController;
import Controller.SimpleMathPageController;
import Controller.TeacherSimpleTestController;

import Model.*;

import Model.TestRepository.ITestRepository;
import Model.TestRepository.TestRepository;
import Viewer.RegisterPage;
import Viewer.SimpleMathTest;
import Viewer.TeacherSimpleTest;
import org.junit.Assert;
import org.junit.BeforeClass;

import java.io.IOException;
import java.util.Set;

public class TestFactory {
    static IUserRepository userRepository;
    static ITestRepository testRepository;
    static SimpleMathPageController simpleMathPageController;
    static TeacherSimpleTestController teacherSimpleTestController;
    static RegisterPageController registerPageController;
    static RegisterModel registerModel;
    static RegisterPage registerView;
    static Test testModel;
    static Teacher TeacherModel;
    static SimpleMathTest StudentView;
    static TeacherSimpleTest TeacherView;
    static FileManager<User> fileManager;
    static FileManager<Test> fileManagerTest;
    static Set<Test> TheTests;

    public TestFactory() throws Exception {
        oneTimeSetUp();
    }

    @BeforeClass
    public static void oneTimeSetUp() throws Exception {
        //one-time initialization code:
        userRepository = UserRepository.getInstance();

        testRepository = new TestRepository();
        testModel = new Test();
        TeacherView = new TeacherSimpleTest();
        StudentView = new SimpleMathTest();
        teacherSimpleTestController = new TeacherSimpleTestController(testModel, TeacherView, "+");
        simpleMathPageController = new SimpleMathPageController(testModel, StudentView, "+");
        registerModel = new RegisterModel();
        registerView = new RegisterPage();
        registerPageController = new RegisterPageController(registerModel, registerView, "Teacher");

        fileManager = new FileManager<User>("Users");
        fileManagerTest = new FileManager<Test>("Test");
    }

    protected static void AddNewUser(User user) throws Exception {
        registerPageController.NewUserRegistration(user);
    }

    protected Boolean LoginValidation(User user) throws Exception {
        Boolean result = userRepository.checkLogin(user.getUsername(), user.getPassword(), user.getProfession());
        return result;
    }
    protected Boolean IsTrueValidation(String num1, String sign, String num2, String studentANs) throws Exception
    {
        Boolean result= testModel.AnswerOfTwoNumbers( num1, sign, num2, studentANs);
        return result;
    }
    protected static void AddedTestToDB(Test test) throws Exception {
        //Insert new tesr to DB:
        testRepository.add1(test);
    }

    protected void DeleteTestFromDB() throws IOException {
        testRepository.delete("+");
    }

}