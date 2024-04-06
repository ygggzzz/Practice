public class FileFushiTestDatabaseLoader implements FushiTestDatabaseLoader{
    @Override
    public TestDataBase loadTestDatabase(String filename) {
        return new TestDataBase();
    }

    public EnglishTest readEnglishTest(String line)
    {
        return new EnglishTest();
    }

    public MathTest readMathTest(String line)
    {
        return new MathTest();
    }

    public ProfessionalTest readProfessionalTest(String line)
    {
        return new ProfessionalTest();
    }
}
