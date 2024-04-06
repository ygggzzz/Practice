public class EnglishTest extends Test{
    private String scoreCriteria;
    private String type;

    public EnglishTest() {

    }

    public EnglishTest(String name, String code, String title, int difficultDegree, String scoreCriteria, String type) {
        super(name, code, title, difficultDegree);
        this.scoreCriteria = scoreCriteria;
        this.type = type;
    }

    @Override
    public String getCode() {
        return super.getCode();
    }

    @Override
    public void setCode(String code) {
        super.setCode(code);
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    public int getDifficultDegree() {
        return super.getDifficultDegree();
    }

    @Override
    public void setDifficultDegree(int difficultDegree) {
        super.setDifficultDegree(difficultDegree);
    }

    public String getScoreCriteria() {
        return scoreCriteria;
    }

    public void setScoreCriteria(String scoreCriteria) {
        this.scoreCriteria = scoreCriteria;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void outputTest() {
        System.out.println("EnglishTest"+getCode()+" "+type);
    }
}
