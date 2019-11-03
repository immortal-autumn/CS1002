public class Employer {
    /**
     * @Employer
     */
    private String idNum;
    private String name;
    private double salary;
    private String retirementDate;

    //get and set all variables above
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getRetirementDate() {
        return retirementDate;
    }

    public void setRetirementDate(String retirementDate) {
        this.retirementDate = retirementDate;
    }

/*    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }*/
}
