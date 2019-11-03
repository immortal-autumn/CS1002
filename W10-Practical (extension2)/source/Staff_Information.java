
/**
 *@employer
 */
public class Staff_Information {
	public static final String seperator = "**************************************************************************************";

	public Software_Developer axio;
	public Customer_Service despi;
	public Customer_Service nnamdo;
	public Software_Developer hasan;
	public Manager philipse;
	public Manager edward;
    //setter
    public void Staff_Informations(){
    	axio = new Software_Developer();
    	despi = new Customer_Service();
    	hasan = new Software_Developer();
    	nnamdo = new Customer_Service();
    	philipse = new Manager();
    	edward = new Manager();
    	//newable the person
    	
    	axio.setIdNum("0082-S");
    	axio.setName("Axio");
    	axio.setRetirementDate("2018/01/05");
    	axio.setSalary(800);
    	axio.setSpecialSkills("Java,HTML");
    	
    	despi.setIdNum("0186-C");
    	despi.setName("Despi");
    	despi.setRetirementDate("2022/03/05");
    	despi.setSalary(650);
    	despi.setYearOfWorking(3);
    	
    	hasan.setIdNum("0083-S");
    	hasan.setName("Hasan");
    	hasan.setRetirementDate("2019/01/05");
    	hasan.setSalary(835);
    	hasan.setSpecialSkills("Java");
    	
    	nnamdo.setIdNum("0187-C");
    	nnamdo.setName("Nnamdo");
    	nnamdo.setRetirementDate("2018/03/05");
    	nnamdo.setSalary(325);
    	nnamdo.setYearOfWorking(3);

    	philipse.setIdNum("0001-M");
    	philipse.setName("Philipse");
    	philipse.setRetirementDate("2022/03/15");
    	philipse.setSalary(906.22);
    	philipse.setEmployer("Nnamdo,Despi");

		edward.setIdNum("0002-M");
		edward.setName("Edward");
		edward.setRetirementDate("2023/12/12");
		edward.setSalary(1088.63);
		edward.setEmployer("Despi,Nnamdo");
    }
    
}
