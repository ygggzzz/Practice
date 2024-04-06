import java.util.ArrayList;
public class TestDataBase {
    private ArrayList<Test> listTest=new ArrayList<Test>();

    public void add(Test test)
    {
        listTest.add(test);
    }

    public void list()
    {
        for(Test t:listTest)
        {
            t.outputTest();
        }
    }

}
