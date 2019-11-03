import java.util.concurrent.ForkJoinPool;

public class Application_sold_information {
    /**
     * @UI
     */

    private Finance wilson;
    private Education erquen;
    private Entertainment iox;
    private Entertainment poi;
    //customer name
    
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
    //type
    private String applicationType;
    //set the calue
    public void Sold_Information_Printer(){
    	getInformations();
    	System.out.println("--Application Sold Informations--");
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
    		}
    	
    	}
    }
    public void getInformations(){
    	wilson = new Finance();
    	wilson.setName("Wilson");
    	wilson.setPrice(209);
    	//System.out.println(wilson.getPrice());
    	wilson.setFlag(false);
    	wilson.setProductCode("0001");
    	wilson.setLatestVersionNum("0.0.0.1");
    	
    	erquen = new Education();
    	erquen.setName("Erquen");
    	erquen.setPrice(200);
    	erquen.setProductCode("0002");
    	erquen.setLatestVersionNum("0.0.0.2");
    	erquen.setEducationLevel("Master Degree");
    	erquen.setAcademicDiscountRate(25);
    	
    	iox = new Entertainment();
    	iox.setGenre(1);
    	iox.setName("Iox");
    	iox.setPrice(309);
    	iox.setProductCode("0003");
    	iox.setRating(10);
    	iox.setLatestVersionNum("0.0.0.1");
    	//above are three customers' informations of buying

    	poi =  new Entertainment();
    	poi.setGenre(1);
    	poi.setName("Poi");
    	poi.setPrice(309);
    	poi.setProductCode("0003");
    	poi.setRating(10);
    	poi.setLatestVersionNum("0.0.0.1");
    }
}
