/**1. Create a program that accepts a series of inputs from a user and allows them to create a new Car.
 *  Please use EasyIn2 to accept user input. The inputs the program should expect should be the: colour, make,
 *   model and year the car was created. 
 *Once you get all these inputs, using OOP practices, create a Car based on these variables.
 *For now, please use setter methods - for example: setModel(), setMake(), setColour(), setYearCreated() 
 *to achieve this. Do not use the constructor at present.
 *2. In your Car class, create another variable called "newOrNot". 
 *Write a method called setNewStatus(). If the year the car was created is after 2000,
 *the newOrNot variable should be set to true. If not, it should be set to false.
 *3. Create four other methods - getMake(), getColour(), getModel(), getYearCreated(), getNewStatus()
 *that gets all these respective values (make, colour, model, year, status). 
 */

/**
 * @author Elwin_Li
 *
 */
public class W06Tutorial1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String model = " ";
		String make = " ";
		String color = " ";
		int yearCreated = 0;
		boolean newOrNot = true;
		
		setvalue setValue = new setvalue();
	
		setValue.setModel(model);
		setValue.setColor(color);
		setValue.setMake(make);
		setValue.yearCreated(yearCreated);
		setValue.newOrNot(newOrNot);
		}
		
		
}
