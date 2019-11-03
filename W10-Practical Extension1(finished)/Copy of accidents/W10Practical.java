import java.text.DecimalFormat;

import org.dom4j.Element;

public class W10Practical {
	
	private static final String welcome = "Welcome to the xxx Company's management software. The current time is: ";
	DecimalFormat d = new DecimalFormat("0.00");
	private static final String seperator = "**************************************************************************************";
	public static void main(String[] args) throws Exception {
		Application_sold_information application_sold_information = 
				new Application_sold_information();
		Staff_Information staff_Information = 
				new Staff_Information();
		System_Date system_Date = new System_Date();
		//Inheritance
		//welcome UI
		System.out.println(welcome + system_Date.timeNow);
		System.out.println(seperator);
		//main UI
		application_sold_information.Sold_Information_Printer();
		System.out.println(seperator);
		staff_Information.Staff_Information_Printer();
		
	}

}
