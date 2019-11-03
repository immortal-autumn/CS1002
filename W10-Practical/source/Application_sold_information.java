
public class Application_sold_information extends Staff_Information{
    /**
     * @UI
     */
	private static final String seperator = "**************************************************************************************";
	
    public Finance wilson;
    public Education erquen;
    public Entertainment iox;
    public Entertainment poi;

    public void getInformations(){
    	Staff_Informations();
    	wilson = new Finance();
    	wilson.setName("Wilson");
    	wilson.setPrice(209);
    	//System.out.println(wilson.getPrice());
    	wilson.setFlag(false);
    	wilson.setProductCode("0001");
    	wilson.setLatestVersionNum("0.0.0.1");
		wilson.setPrinciple(hasan.getName(),hasan.getRetirementDate());

    	erquen = new Education();
    	erquen.setName("Erquen");
    	erquen.setPrice(200);
    	erquen.setProductCode("0002");
    	erquen.setLatestVersionNum("0.0.0.2");
    	erquen.setEducationLevel("Master Degree");
    	erquen.setAcademicDiscountRate(25);
		erquen.setPrinciple(hasan.getName(),hasan.getRetirementDate());
    	
    	iox = new Entertainment();
    	iox.setGenre(1);
    	iox.setName("Iox");
    	iox.setPrice(309);
    	iox.setProductCode("0003");
    	iox.setRating(10);
    	iox.setLatestVersionNum("0.0.0.1");
		iox.setPrinciple(hasan.getName(),hasan.getRetirementDate());
    	//above are three customers' informations of buying

    	poi =  new Entertainment();
    	poi.setGenre(1);
    	poi.setName("Poi");
    	poi.setPrice(309);
    	poi.setProductCode("0004");
    	poi.setRating(10);
    	poi.setLatestVersionNum("0.0.0.1");
		poi.setPrinciple(hasan.getName(),hasan.getRetirementDate());
    }
}
