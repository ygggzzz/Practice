public abstract class Test {
    private String name;
    private String code;
    private String title;
    private int difficultDegree;

    public Test() {
    }

    public Test(String name, String code, String title, int difficultDegree) {
        this.name = name;
        this.code = code;
        this.title = title;
        this.difficultDegree = difficultDegree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDifficultDegree() {
        return difficultDegree;
    }

    public void setDifficultDegree(int difficultDegree) {
        this.difficultDegree = difficultDegree;
    }

    public void outputTest()
    {
        System.out.println("Test"+code+" "+title+" "+difficultDegree+" ");
    }



}
