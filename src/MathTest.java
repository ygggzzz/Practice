public class MathTest extends Test{
    private String scoreCriteria;
    private String photoURL;
    private String calculationProcess;

    public MathTest() {
    }

    public MathTest(String name, String code, String title, int difficultDegree, String scoreCriteria, String photoURL, String calculationProcess) {
        super(name, code, title, difficultDegree);
        this.scoreCriteria = scoreCriteria;
        this.photoURL = photoURL;
        this.calculationProcess = calculationProcess;
    }

    public String getScoreCriteria() {
        return scoreCriteria;
    }

    public void setScoreCriteria(String scoreCriteria) {
        this.scoreCriteria = scoreCriteria;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    public String getCalculationProcess() {
        return calculationProcess;
    }

    public void setCalculationProcess(String calculationProcess) {
        this.calculationProcess = calculationProcess;
    }
}
