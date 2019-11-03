public class Education extends Applications{

    /**
     *@Application education
     */
    public String applicationType = "Education Application";

    private String educationLevel;
    private int academicDiscountRate;

    //getter and setter
    public int getAcademicDiscountRate() {
        return academicDiscountRate;
    }
    public void setAcademicDiscountRate(int academicDiscountRate) {
        this.academicDiscountRate = academicDiscountRate;
    }

    public String getEducationLevel() {
        return educationLevel;
    }
    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }
}
