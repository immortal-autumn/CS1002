import java.text.DecimalFormat;
import java.util.Scanner;

public class W10Practical {

	private static final String welcome = "Welcome to the xxx Company's management software. The current time is: ";
	DecimalFormat d = new DecimalFormat("0.00");
	private static final String seperator = "*******************************************************************************************";


	public static void main(String[] args){
		EasyIn2 reader = new EasyIn2();
		Application_Sold_Print application_sold_print =
				new Application_Sold_Print();
		Staff_Information_Print staff_information_print =
				new Staff_Information_Print();
		System_Date system_Date = new System_Date();
		//Inheritance
		while(true) {
			//welcome UI

			System.out.println(welcome + system_Date.timeNow);
			System.out.println(seperator);
			System.out.println(seperator);
			//main UI
			application_sold_print.Sold_Information_Printer();
			System.out.println(seperator);
			System.out.println(seperator);
			staff_information_print.Staff_Information_Printer();

			System.out.println("Seperate looking");
			System.out.println("1. Search for staff information");
			System.out.println("2. Serach for application information");
			System.out.println("3. Exit the System");
			int choose = reader.getInt();

			switch (choose){
				case 1:{
					staff_information_print.Staff_Information_Printer();

					break;
				}
				case 2:{
					application_sold_print.Sold_Information_Printer();
					break;
				}
				case 3:{
					System.out.println("Thanks for using our System!");
					System.exit(1);
				}
				default:{
					System.out.println("Please input the correct integer!!");
					break;
				}
			}
			System.out.println("Press any key to continue");
			Scanner input = new Scanner(System.in);
			String str = input.next();
		}
	}

}
