package Model;

import Viewer.LoginPage;

import javax.swing.*;
import java.io.IOException;

public class Login {

    private JButton loginButton;
    private LoginPage loginViewer;
    UserRepository userRepository;//= UserRepository.getInstance();

    public Login() throws Exception {
    }
    //private static UserRepository SoleInstance;


    public boolean checkUser(String username, String password,String pro) throws Exception
    {
        userRepository= UserRepository.getInstance();
        if (userRepository.checkLogin(username, password,pro)) {
            return true;
        }
        return false;
    }

    public String getPro(String username)
    {
        return userRepository.getPro(username);
    }



}
