package Model.TestRepository;


import Model.FileManager;
import Model.Test;
import Model.UserRepository;

import java.io.IOException;
import java.util.Set;


public class TestRepository implements ITestRepository
{
    private Test newTest;
    private final String FILENAME = "Tests";
    private Set<Test> test;
    private FileManager<Test> fileManager;
    private static TestRepository SoleInstance;

    public static TestRepository getInstance() throws Exception
    {
        if (SoleInstance == null)
        {
            //if there is no instance available, create new one:
            SoleInstance = new TestRepository();

        }
        return SoleInstance;
    }

    public TestRepository() throws IOException, ClassNotFoundException
    {
        this.fileManager = new FileManager<Test>(FILENAME);
        this.test = this.fileManager.read();
    }

         public void add1(Test test) throws Exception {
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
        if(this.findByName(sign)!=null) {
            this.test.remove(this.findByName(sign));
            this.fileManager.write(this.test);
        }
    }

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
