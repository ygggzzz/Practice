public class ProfessionalTest extends Test{
    private String scoreCriteria;
    private String programInstruction;
    private String programming;
    private String photoURL;

    public ProfessionalTest() {
    }

    public ProfessionalTest(String name, String code, String title, int difficultDegree, String scoreCriteria, String programInstruction, String programming, String photoURL) {
        super(name, code, title, difficultDegree);
        this.scoreCriteria = scoreCriteria;
        this.programInstruction = programInstruction;
        this.programming = programming;
        this.photoURL = photoURL;
    }

    public String getScoreCriteria() {
        return scoreCriteria;
    }

    public void setScoreCriteria(String scoreCriteria) {
        this.scoreCriteria = scoreCriteria;
    }

    public String getProgramInstruction() {
        return programInstruction;
    }

    public void setProgramInstruction(String programInstruction) {
        this.programInstruction = programInstruction;
    }

    public String getProgramming() {
        return programming;
    }

    public void setProgramming(String programming) {
        this.programming = programming;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }
}
