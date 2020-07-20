package Controller;

import Model.RegisterModel;
import Model.User;
import Viewer.RegisterPage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPageController {

    private RegisterModel registerModel;
    private RegisterPage registerView;
    private String value;

    public RegisterPageController(RegisterModel registerModel, RegisterPage registerView, String value) {
        this.registerModel = registerModel;
        this.registerView = registerView;
        this.value = value;
        registerView.showRegisterView();
        registerView.getTheRegisterBtn().addActionListener(new registerBtnListener());
    }

    public void showRegisterView() {
        registerView.showRegisterView();
    }

    class registerBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            User newUser = new User(registerView.getIdText(), registerView.getName(), registerView.getTheLastNameText(), registerView.getTheUsernameText(), registerView.getThePasswordText(), value);
           NewUserRegistration(newUser);

            registerView.exitPage();
        }
    }
    public void NewUserRegistration(User newUser)
    {
        User account = new User(newUser);
        try
        {
            registerModel.AddUser(newUser);

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}


