import java.security.Principal;

public class Application_Sold_Print extends Application_sold_information {
    //customer name
    private static final String seperator = "**************************************************************************************";

    private String productCode;
    private String name;
    private double price;
    private String latestVersionNum;
    //entertainment
    private int genre;
    private int rating;
    //finance
    private boolean flag;
    //education
    private String educationLevel;
    private int academicDiscountRate;
    //principle
    private String principle;
    private String retirementdate;
    Staff_Information staff_information = new Staff_Information();
    //type
    private String applicationType;
    //set the calue

    public void Sold_Information_Printer(){
        getInformations();

        System.out.println("--Application Sold Informations--");
        System.out.println(seperator);
        for(int i=1;i<20;i++){
            boolean visiable = false;
            switch (i) {
                case 1: {
                    visiable = true;
                    applicationType = erquen.applicationType;
                    name = erquen.getName();
                    price = erquen.getPrice();
                    //System.out.print(price);
                    productCode = erquen.getProductCode();
                    latestVersionNum = erquen.getLatestVersionNum();
                    educationLevel = erquen.getEducationLevel();
                    academicDiscountRate = erquen.getAcademicDiscountRate();
                    principle = erquen.getPname();
                    retirementdate = erquen.getPretirementDate();
                    break;
                }
                case 2: {
                    visiable = true;
                    applicationType = iox.ApplicationType;
                    name = iox.getName();
                    price = iox.getPrice();
                    productCode = iox.getProductCode();
                    latestVersionNum = iox.getLatestVersionNum();
                    genre = iox.getGenre();
                    rating = iox.getRating();
                    principle = iox.getPname();
                    retirementdate = iox.getPretirementDate();
                    break;
                }
                case 3: {
                    visiable = true;
                    applicationType = wilson.ApplicationType;
                    name = wilson.getName();
                    price = wilson.getPrice();
                    productCode = wilson.getProductCode();
                    latestVersionNum = wilson.getLatestVersionNum();
                    flag = wilson.isFlag();
                    principle = wilson.getPname();
                    retirementdate = wilson.getPretirementDate();
                    break;
                }
                case 4: {
                    visiable = true;
                    applicationType = poi.ApplicationType;
                    name = poi.getName();
                    price = poi.getPrice();
                    productCode = poi.getProductCode();
                    latestVersionNum = poi.getLatestVersionNum();
                    genre = poi.getGenre();
                    rating = poi.getRating();
                    principle = poi.getPname();
                    retirementdate = poi.getPretirementDate();
                    break;
                }
                case 5: {
                    visiable = false;
                }
                case 6: {
                    visiable = false;
                    break;
                }
                case 7: {
                    visiable = false;
                    break;
                }
                case 8: {
                    visiable = false;

                    break;
                }
                case 9: {
                    visiable = false;
                    break;
                }
                case 10: {
                    visiable = false;
                    break;
                }
                default:{
                    visiable = false;
                    break;
                }
            }
            if(visiable == true){
                System.out.print(i);		//set number
                System.out.println(" Name: " + name + "  Price: " + price + "  Product Code: " + productCode
                        + "  Latest Version: " + latestVersionNum);//tidy print
                System.out.println("  Application type: " + applicationType);
                switch (applicationType) {		//seprate and print
                    case  "Education Application": {	//if is education
                        System.out.println("  Education Level: " + educationLevel + "  Education Discount Rate: " + academicDiscountRate);;
                        double rate = academicDiscountRate;
                        rate = 1 - (rate / 100);
                        price = price * rate;
                        System.out.println("  Final Cost: " + price);
                        break;
                    }
                    case "Entertainment Application": { 	//if is entertainment
                        System.out.println("  Genre: " + genre + "  rating: " + rating);
                        break;
                    }
                    case "Finance Application": {	//if is finance
                        System.out.println("  Flag: " + flag);
                        break;
                    }
                    default:
                        break;
                }
                System.out.println("  Principle is: " + principle + "  Retirement date is " + retirementdate);
            }

        }
    }
}
