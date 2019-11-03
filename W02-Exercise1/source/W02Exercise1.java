

class W02Exercise1{
	public static void main(String[] args) {

		//name Elwin
		//age 19
		//mes This is a message from Elwin

		EasyIn2 reader1 = new EasyIn2();
		System.out.println("How old are your first child:");
		int age1 = reader1.getInt();
		
		EasyIn2 reader2 = new EasyIn2();
		System.out.println("How old are your second child:");
		int age2 = reader2.getInt();
		
		EasyIn2 reader3 = new EasyIn2();
		System.out.println("How old are your third child:");
		int age3 = reader3.getInt();
		
		int totalAge = age1 + age2 + age3;
		int averageAge = totalAge / 3;
		String name = "your child's average age is:";
		String message = "This is a message from Elwin";

		System.out.println("Your first child's age is: " + age1);
		System.out.println("Your first child's age is: " + age2);
		System.out.println("Your first child's age is: " + age3);

		System.out.println(name);
		System.out.println(averageAge);
		System.out.println(message);
	}
}