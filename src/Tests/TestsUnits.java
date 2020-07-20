package Tests;

import Model.IUserRepository;
import Model.User;
import Model.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class TestsUnits {
    public TestsUnits() throws Exception { }
    IUserRepository userRepository = UserRepository.getInstance();
    private TestFactory testFactory;
    @org.junit.Test
    @DisplayName("Validate user registration functionality")
    public void RegisterTest() throws Exception
    {
        String id = "id_Test";
        String name = "name_Test";
        String lastName = "lastName_Test";
        String username = "username_Test";
        String password = "password_Test";
        String pro = "pro_Test";
        User newUser = new User(id, name, lastName, username, password, pro);
        testFactory.AddNewUser(newUser);

        Boolean result = userRepository.FindUser(newUser.getUsername());
        Assert.assertTrue(result);
    }

    @Test
    @DisplayName("Validate user login functionality")
    public void LoginTest() throws Exception
    {
        String id = "id_Test";
        String name = "name_Test";
        String lastName = "lastName_Test";
        String username = "username_Test";
        String password = "password_Test";
        String pro = "pro_Test";
        User newUser = new User(id, name, lastName, username, password, pro);
        testFactory.AddNewUser(newUser);

        boolean result = testFactory.LoginValidation(newUser);
        Assert.assertTrue(result);
    }
    public void IsTrueTest() throws Exception{
        String num1= "3";
        String num2="5";
        String sign="*";
        String StudentAns="16";
        boolean result = testFactory.IsTrueValidation(num1, sign,num2,StudentAns);

        Assert.assertTrue(result);
    }

}
