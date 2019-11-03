/*
 * To set all sorts of name and value in this class
 */
public class setvalue {
	EasyIn2 reader1 = new EasyIn2();
	EasyIn2 reader2 = new EasyIn2();
	EasyIn2 yearCreate = new EasyIn2();
	EasyIn2 select = new EasyIn2();
	EasyIn2 inputColor = new EasyIn2();
	String model = " ";
	String make = " ";
	String color = " ";
	int yearCreated;
	boolean newOrNot = true;
	public String setModel(String model){
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Please input the model");
		this.model = reader1.getString();
		System.out.println(" ");
		System.out.println(" ");
		return model;
	}
	public String setMake(String make){
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Please input the make:");
		System.out.println(" ");
		System.out.println(" ");

		this.make = reader2.getString();
		return make;
	}
	public String setColor(String color){
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Please select what color would you like to take?");
		System.out.println("1.red");
		System.out.println("2.blue");
		System.out.println("3.green");
		System.out.println("0.None of above");
		System.out.println(" ");
		System.out.println(" ");
		int menu_choice = select.getInt();
		switch (menu_choice) {
		case 1 : {
			System.out.println("You chose red")	;
			this.color = "red";
			break;
		}
		case 2 : {
			System.out.println("You chose blue");
			this.color = "blue";
			break;
		}
		case 3 : {
			System.out.println("You chose green");
			this.color = "green";
			break;
		}
		case 0 : {
			System.out.println("Please choose your color:");
			this.color = inputColor.getString();
			break;
		}
		default : {
			System.out.println("Invalid Input");
			break;
		}
		}
		return color;
	}
	public int yearCreated(int yearCreated){
		System.out.println("Please input the year that the car built:");
		this.yearCreated = yearCreate.getInt();
		return yearCreated;
	}
	public boolean newOrNot(boolean newOrNot){
		if(yearCreated < 2000){
			System.out.println("Year should over 2000!");
			this.newOrNot = false;
		}
		else{
			System.out.println("This is messages of your car:");
			System.out.println("Color is: " + this.color);
			System.out.println("Model is: " + this.model);
			System.out.println("Make is: " + this.make);
			System.out.println("Year created is: " + this.yearCreated);
		}
		return newOrNot;
	}
}