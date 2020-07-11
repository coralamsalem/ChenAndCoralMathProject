package Model;

public class User
{
    private String ID;
    private String name;
    private String password;
    private String profession;

    public User(String id, String name, String password, String profession)
    {
        this.ID=id;
        this.name=name;
        this.password=password;
        this.profession= profession;
    }
    public String getName()
    {
      return name;
    }
    public void setName(String newName)
    {
        this.name= newName;

    }
    public String getID()
    {
        return ID;
    }
    public void setID(String newID)
    {
        this.ID= newID;

    }
    public String getProfession()
    {
        return profession;
    }
    public void setProfession(String newProfession)
    {
        this.profession= newProfession;

    }

    public String getPassword()
    {
        return password;
    }
    public void setPassword(String newPassword)
    {
        this.password= newPassword;

    }


}
