
public class Applications{
    /**
     * @application
     */
    //setApplication
    private String productCode;
    private String name;
    private double price;
    private String latestVersionNum;

    /*Education edu = new Education();
    Finance finance = new Finance();
    Entertainment ent = new Entertainment();*/


//constructors
    public Applications(){

    }
    //set principle
    private String pname;
    private String pretirementDate;
    //getter and setter
    //get and set all variables.
    public void setProductCode(String productCode){
        this.productCode = productCode;
    }
    public String getProductCode(){
        return productCode;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLatestVersionNum() {
        return latestVersionNum;
    }
    public void setLatestVersionNum(String latestVersionNum) {
        this.latestVersionNum = latestVersionNum;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void setPrinciple(String name, String retirementDate){
        this.pname = name;
        this.pretirementDate = retirementDate;
    }
    public String getPname(){
        return pname;
    }
    public String getPretirementDate(){
        return pretirementDate;
    }
    /*public String getApplicationType() {
        return applicationType;
    }
    public String setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }
    public void application(){
        if(applicationType.equals(edu.applicationType)){

        }*/
}
    //the above is for application type and will be decide

