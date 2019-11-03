
public class Application_sold_information extends Staff_Information{
    /**
     * @UI
     */
	private static final String seperator = "**************************************************************************************";
	
    public Finance wilson;
    public Education erquen;
    public Entertainment iox;
    public Entertainment poi;

    public Education generalEducation;
    public general_copies generalEn;
	public general_copies generalF;
	public general_copies generalEt;


	public void getInformations(){
		Staff_Informations();

    	generalEducation = new Education();
    	generalEducation.setProductCode("g-0001");
    	generalEducation.setPrice(108);
    	generalEducation.setLatestVersionNum("2.1.1.0");
    	generalEducation.setPrinciple(hasan.getName(),hasan.getRetirementDate());

		generalEt = new general_copies(200,"et-0001","1.1.1.1");
		generalEt.setPrinciple(hasan.getName(),hasan.getRetirementDate());

		generalEn = new general_copies(150,"en-0001","1.1.1.2");
		generalEn.setPrinciple(hasan.getName(),hasan.getRetirementDate());
		generalEn.setGenre(1);

		generalF = new general_copies(350,"F-0001","2.2.2.2.");
		generalF.setPrinciple(hasan.getName(),hasan.getRetirementDate());

    	wilson = new Finance();
    	wilson.setName("Wilson");
    	wilson.setPrice(666);
    	//System.out.println(wilson.getPrice());
    	wilson.setFlag(false);
    	wilson.setProductCode("0001");
    	wilson.setLatestVersionNum("0.0.0.1");
		wilson.setPrinciple(hasan.getName(),hasan.getRetirementDate());

    	erquen = new Education();
    	erquen.setName("Erquen");
    	erquen.setPrice(777);
    	erquen.setProductCode("0002");
    	erquen.setLatestVersionNum("0.0.0.2");
    	erquen.setEducationLevel("Master Degree");
    	erquen.setAcademicDiscountRate(25);
		erquen.setPrinciple(hasan.getName(),hasan.getRetirementDate());
    	
    	iox = new Entertainment();
    	iox.setGenre(1);
    	iox.setName("Iox");
    	iox.setPrice(888);
    	iox.setProductCode("0003");
    	iox.setRating(10);
    	iox.setLatestVersionNum("0.0.0.1");
		iox.setPrinciple(hasan.getName(),hasan.getRetirementDate());
    	//above are three customers' informations of buying

    	poi =  new Entertainment();
    	poi.setGenre(1);
    	poi.setName("Poi");
    	poi.setPrice(999);
    	poi.setProductCode("0004");
    	poi.setRating(10);
    	poi.setLatestVersionNum("0.0.0.1");
		poi.setPrinciple(hasan.getName(),hasan.getRetirementDate());
    }
}
