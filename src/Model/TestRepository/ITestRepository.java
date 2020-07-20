package Model.TestRepository;
import Model.Test;

import java.io.IOException;
import java.util.Set;

public interface ITestRepository
{

    void add1(Test test) throws Exception;

    void delete(String sign) throws IOException;

    Set<Test> findAll();

    Test findByName(String sign);
}

