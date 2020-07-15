package Model;

import java.io.Serializable;

public class User implements Serializable
{
    private String ID;
    private String name;
    private String lastName;
    private String username;
    private String password;
    private String profession;

    public User(String id, String name, String lastName, String username, String password, String profession)
    {
        this.ID=id;
        this.name=name;
        this.lastName = lastName;
        this.username = username;
        this.password=password;
        this.profession= profession;
    }
    public User(User newUser)
    {
        this.ID = newUser.getID();
        this.name = newUser.getName();
        this.lastName = newUser.getLastName();
        this.username = newUser.getUsername();
        this.password = newUser.getPassword();
        this.profession = newUser.getProfession();
    }

    public String getID()
    {
        return ID;
    }

    public void setID(String newID) { this.ID= newID; }

    public String getName()
    {
        return name;
    }

    public void setName(String newName) { this.name= newName; }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String newLastName)
    {
        this.lastName = newLastName;
    }

    public String getProfession()
    {
        return profession;
    }

    public void setProfession(String newProfession) { this.profession= newProfession; }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String newUsername)
    {
        this.username = newUsername;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String newPassword) { this.password= newPassword; }

}