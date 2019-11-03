public class Manager extends Employer{
    private String Software_id;
    private String employer;

    public String getSoftware_id() {
        return Software_id;
    }

    public void setSoftware_id(String software_id) {
        Software_id = software_id;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getEmployer() {
        return employer;
    }
}
