import java.text.DecimalFormat;

public class W10Practical {
	
	private static final String welcome = "Welcome to the xxx Company's management software. The current time is: ";
	DecimalFormat d = new DecimalFormat("0.00");
	private static final String seperator = "*******************************************************************************************";
	
	public static void main(String[] args) throws Exception {
		Application_Sold_Print application_sold_print =
				new Application_Sold_Print();
		Staff_Information_Print staff_information_print =
				new Staff_Information_Print();
		System_Date system_Date = new System_Date();
		//Inheritance
		//welcome UI
		System.out.println(welcome + system_Date.timeNow);
		System.out.println(seperator);
		System.out.println(seperator);
		//main UI
		application_sold_print.Sold_Information_Printer();
		System.out.println(seperator);
		System.out.println(seperator);
		staff_information_print.Staff_Information_Printer();
	}

}
