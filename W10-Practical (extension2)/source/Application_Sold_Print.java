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
    private String visiableName;
    //set the calue
    EasyIn2 reader = new EasyIn2();

    //set the total revenue
    private double revenue = 0;

    public void Sold_Information_Printer(){
        getInformations();
        boolean visiable;
        System.out.println("--Application Sold Informations--");
        System.out.println(seperator);
        for(int i=1;i<20;i++){
            visiableName = name;
            switch (i) {
                case 1: {
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
                    break;
                }
                case 6: {
                    break;
                }
                case 7: {
                    break;
                }
                case 8: {

                    break;
                }
                case 9: {
                    break;
                }
                case 10: {
                    break;
                }
                default:{
                    break;
                }
            }

            if(name.equals(visiableName)){
                visiable = false;
            }
            else{
                visiable = true;
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
                if(visiable == true){
                    revenue = revenue + price;
                }
                System.out.println("  Principle is: " + principle + "  Retirement date is " + retirementdate);
            }

        }
        //general copies::
        System.out.println(seperator);
        System.out.println("  General copies sale informations: ");
        System.out.println(seperator);
        for(int i=1;i<4;i++){
            int sale = 0;
            switch (i){
                case 1:{
                    applicationType = "general Education";
                    price = generalEt.getPrice();
                    productCode = generalEt.getProductCode();
                    latestVersionNum = generalEt.getLatestVersionNum();
                    sale = 10000;
                    break;
                }
                case 2:{
                    applicationType = "general Entertainment";
                    price = generalEn.getPrice();
                    genre = generalEn.getGenre();
                    productCode = generalEn.getProductCode();
                    latestVersionNum = generalEn.getLatestVersionNum();
                    sale = 10000;
                    break;
                }
                case 3:{
                    applicationType = "general Finanace";
                    price = generalF.getPrice();
                    productCode = generalF.getProductCode();
                    latestVersionNum = generalF.getLatestVersionNum();
                    sale = 10000;
                    break;
                }
                default:{
                    break;
                }
            }

            System.out.println("  General " + applicationType + ":");
            System.out.println("  price: " + price + "  piece: " + sale + "  Product Code: " + productCode + " Latest version: " + latestVersionNum);
            revenue = revenue + price * sale;
            System.out.println(seperator);

        }

        System.out.println("  The total revenue is: £" + revenue);
    }
}
