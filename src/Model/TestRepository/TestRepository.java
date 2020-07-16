package Model.TestRepository;


import Model.FileManager;
import Model.Test;

import java.io.IOException;
import java.util.Set;



public class TestRepository implements ITestRepository
{
    private Test newTest;
    private final String FILENAME = "Tests";
    private Set<Test> test;
    private FileManager<Test> fileManager;

    public TestRepository() throws IOException, ClassNotFoundException
    {
        this.fileManager = new FileManager<Test>(FILENAME);

        this.test = this.fileManager.read();
    }

         public void add(Test test) throws Exception {
        if (test == null) {
            throw new Exception("You must have all the values");
        }

        if (this.test.contains(test)) {
            throw new Exception("Already exists!");
        }

        this.test.add(test);
        this.fileManager.write(this.test);
    }



    public void delete(String sign) throws IOException
    {
        if(newTest.getSign().equals(sign)) {


            this.test.remove(new Test(newTest));
            this.fileManager.write(this.test);
        }
    }

    /*  public Test find(int id) {
        if (this.test.contains(new Test(id))) {
            for (User user : users) {
                if (user.getId() == id) {
                    return user;
                }
            }
        }

        return null;
    }*/


    public Set<Test> findAll() {
        return this.test;
    }


    public Test findByName(String sign1) {
        for (Test newTest : test)
        {
            String testName = newTest.getSign();
            if (testName.equals(sign1)) {
                return newTest;
            }
        }

        return null;
    }

}
