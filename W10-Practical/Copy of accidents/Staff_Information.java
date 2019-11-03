import javax.swing.JPopupMenu.Separator;

/**
 *@employer
 */
public class Staff_Information {
	private Software_Developer axio;
	private Customer_Service despi;
	private Customer_Service nnamdo;
	private Software_Developer hasan;
	//common
    private String idNum;
    private String name;
    private double salary;
    private String retirementDate;
    //salary
    private double totalSalaryCost = 0;

    private String[] specialSkills;//software developer
    private int yearOfWorking;//customer service
    private String employerType;
    //systemdate
    private System_Date system_Date;
    public void Staff_Information_Printer(){
    	Staff_Informations();
    	//read and list informations
    	System.out.println("--Staff Informations--");
    	for(int t=0;t<1;t++){
	    	for(int i=1;i<5;i++){
	    		switch (i) {
				case 1:{
					employerType = axio.employerType;
					idNum = axio.getIdNum();
					name = axio.getName();
					retirementDate = axio.getRetirementDate();
					salary = axio.getSalary();
					break;
				}
				case 2:{
					employerType = despi.employerType;
					idNum = despi.getIdNum();
					name = despi.getName();
					retirementDate = despi.getRetirementDate();
					salary = despi.getSalary();
					yearOfWorking = despi.getYearOfWorking();
					break;
				}
				case 3:{
					employerType = hasan.employerType;
					idNum = hasan.getIdNum();
					name = hasan.getName();
					retirementDate = hasan.getRetirementDate();
					salary = hasan.getSalary();
					break;
				}
				case 4: {
					employerType = nnamdo.employerType;
					idNum = nnamdo.getIdNum();
					name = nnamdo.getName();
					retirementDate = nnamdo.getRetirementDate();
					salary = nnamdo.getSalary();
					yearOfWorking = despi.getYearOfWorking();
					break;
				}
				default:{
					break;
				}
				}
	    		System.out.print(i);
	    		System.out.print(" id number " + idNum + "  Name: " + name + "  Salary: " + salary);
	    		System.out.println("  Retirement date: " + retirementDate);
	    		System.out.println("  Category: " + employerType);
	    		switch (employerType) {
				case "Software Developer":{
					//special skills is still unknown.
					
					break;
				}
				case "Customer Service": {
					String unit;
					if(yearOfWorking <= 1){
						unit = " year.";
					}
					else{
						unit = " years.";
					}
					System.out.println("  Year of working: " + yearOfWorking + unit);
					break;
				}
				default:{
					break;
				}
				}
	    		String retirement = retirementDate.substring(0,4);
	    		//System.out.println(retirement);
	    		int retirementYear = Integer.parseInt(retirement);
	    		//System.out.println(system_Date.systemYear);
	    		retirementYear = retirementYear - system_Date.systemYear;
	    		String unitString;
	    		totalSalaryCost = totalSalaryCost + salary;
	    		
	    		//set unit and calculate retirement year!
	    		if(retirementYear <= 1){
	    			unitString = " year. ";
	    		}
	    		else{
	    			unitString = " years. ";
	    		}
	    		
	    		System.out.print("  Retirement: In " + retirementYear + unitString);
	    		if(retirementYear <= 1){
	    			System.out.println("   ****Will Retire In 1 Year****");
	    		}
	    		else {
	    			System.out.println();
				}
	    	}
	    }
    	System.out.println("**********   Total Salary Cost   **********");
    	System.out.println("************      " + totalSalaryCost + "       ************");
    	System.out.println("*******************************************");
    	//shows the longest worker
    	
    }
    //setter
    public void Staff_Informations(){
    	system_Date = new System_Date();
    	axio = new Software_Developer();
    	despi = new Customer_Service();
    	hasan = new Software_Developer();
    	nnamdo = new Customer_Service();
    	//newable the person
    	
    	axio.setIdNum("0082-S");
    	axio.setName("Axio");
    	axio.setRetirementDate("2018/01/05");
    	axio.setSalary(800);
    	//axio.setSpecialSkills("Java");
    	
    	despi.setIdNum("0186-C");
    	despi.setName("Despi");
    	despi.setRetirementDate("2022/03/05");
    	despi.setSalary(650);
    	despi.setYearOfWorking(3);
    	
    	hasan.setIdNum("0082-S");
    	hasan.setName("Hasan");
    	hasan.setRetirementDate("2018/01/05");
    	hasan.setSalary(835);
    	//hasan.setSpecialSkills[1]("Java");
    	
    	nnamdo.setIdNum("0186-C");
    	nnamdo.setName("Nnamdo");
    	nnamdo.setRetirementDate("2018/03/05");
    	nnamdo.setSalary(325);
    	nnamdo.setYearOfWorking(3);
    }
    
}
