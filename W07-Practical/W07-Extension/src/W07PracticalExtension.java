
/**
 * @author Elwin_Li
 */
public class W07PracticalExtension {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SystemDate systemDate = new SystemDate();
		Customer customer = new Customer();
		EasyIn2 reader = new EasyIn2();
		Login login =new Login();
		//Current Account
		String name = null;
		String dateOfBirth = null;
		String idNum = null;
		String accountNumber1 = null;
		double balance1;
		double overDraftLimit;
		double totalOverdraftLimit = 0.00;

		//Saving Account
		String accountNumber2 = null;
		double balance2;
		double interestRate;

		//login system
		while (true) {
			System.out.println("Hello, welcome to Elwin's personal virtual online banking:");
			System.out.println(" ");

			//username checker
			String usernameIn;
			usernameIn = login.inputIdNum();

			if (usernameIn.equals("888888")) {
				login.LiHua();
			} else {
				if (usernameIn.equals("77777")) {
					login.XiaoMing();
				} else {
					if (usernameIn.equals("666666")) {
						login.Hasan();
					} else {
						System.out.println("Unavailable account!");
						System.exit(1);
					}
				}
			}
			String password = login.inputPass();
			login.Pchecker();
			if (login.checker == true) {

			} else {
				System.exit(1);
			}
			//set information

			customer.setDateOfBirth(login.dateOfBirth);
			customer.setAccountNumber1(login.accountNumber1);
			customer.setAccountNumber2(login.accountNumber2);
			customer.setBalance1(login.balance1);
			customer.setBalance2(login.balance2);
			customer.setIdNum(login.idNum);
			customer.setInterestRate(login.interestRate);
			customer.setName(login.name);
			customer.setOverdraftLimit(login.overDraftLimit);
			//get informations
			dateOfBirth = customer.getDateOfBirth();
			accountNumber1 = customer.getAccountNumber1();
			accountNumber2 = customer.getAccountNumber2();
			balance1 = customer.getBalance1();
			balance2 = customer.getBalance2();
			idNum = customer.getIdNum();
			interestRate = customer.getInterestRate();
			name = customer.getName();
			overDraftLimit = customer.getOverDraftLimit();
			//others
			totalOverdraftLimit = overDraftLimit;
			//age calculate
			String yearOfBirth = customer.getDateOfBirth().substring(0, 4);
			int yearOfBirthInt = Integer.parseInt(yearOfBirth);
			int age = systemDate.systemYear - yearOfBirthInt;

			//another information
			double totalBalance = balance1 + balance2;
			double withdrawable = balance1 + overDraftLimit;


			//main UI
			while (true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("The time is: " + systemDate.timeNow);
				System.out.println(" ");
				System.out.println("Login Information:");
				System.out.println("Name: " + name);
				System.out.println("ID number: " + idNum);
				System.out.println("Age:" + age);
				System.out.println("OverView:");
				System.out.println("Your total money is: £" + totalBalance);
				System.out.println("-current account:");
				System.out.println("Balance: £" + String.format("%.2f", balance1));
				System.out.println("Overdraft Limit: £" + overDraftLimit);
				System.out.println(" ");
				System.out.println("-saving account:");
				System.out.println("Balance: £ " + String.format("%.2f", balance2));
				System.out.println("Interest Rate: " + interestRate);
				System.out.println("You will get £" + interestRate * balance2 + " next month!");
				System.out.println(" ");
				System.out.println("Please select your next step:");
				System.out.println("1. Save money");
				System.out.println("2. Withdraw");
				System.out.println("3. Other services");
				System.out.println("0. Exit");
				int menu_choice = reader.getInt();
				switch (menu_choice) {
					case 1: {
						//saving money
						System.out.println("Please input the amount of money that would be was saved:");
						double saveMoney = reader.getDouble();
						balance1 = balance1 + saveMoney;
						System.out.println("Would you like to transfer it into saving account?");
						System.out.println("1.yes 2.no");
						int menu_choice2 = reader.getInt();
						switch (menu_choice2) {
							//saving process
							case 1: {
								balance2 = balance2 + saveMoney;
								balance1 = balance1 - saveMoney;
								System.out.println("Thank you for saving >_<");
							}
							default: {

							}
						}
						System.out.println("Your have saved £" + saveMoney + " into your account");
						break;
					}
					case 2: {
						//withdraw money
						System.out.println("Please input the amount of money you would like to withdraw:");
						double withdraw = reader.getDouble();
						if (withdraw <= balance1) {
							//overdraft
							balance1 = balance1 - withdraw;
							System.out.println("Processing.....");
							try {
								Thread.sleep(600);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							System.out.println("Succeed!");
						} else {
							if (withdraw <= withdrawable) {
								balance1 = 0;
								withdraw = withdraw - balance1;
								overDraftLimit = overDraftLimit - withdraw;
								System.out.println("Processing.....");
								try {
									Thread.sleep(600);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								System.out.println("Succeed!");
							} else {
								System.out.println("Money issue, Please check!");
							}
						}
						break;
					}
					case 3: {
						//other extension services
						System.out.println("Please select your service:");
						System.out.println("1. Saving account");
						System.out.println("2. Balance transfer");
						System.out.println("3. Credit card service");
						System.out.println("4. Money return");
						System.out.println("0. Exit");

						int menu_choice3 = reader.getInt();

						switch (menu_choice3) {

							case 1: {
								double transfer = 0.00;
								System.out.println("Please select the service you want to take:");
								System.out.println("1. Transfer money from saving account to balance");
								System.out.println("2. Save money into saving account");
								System.out.println("0. Exit");
								int menu_choice4 = reader.getInt();
								switch (menu_choice4) {
									case 1: {
										System.out.println("How much would you like to transfer:");
										transfer = reader.getDouble();
										if (transfer <= balance2) {
											balance2 = balance2 - transfer;
											balance1 = balance1 + transfer;
											System.out.println("Succeed!");
										} else {
											System.out.println("Failed!");
										}
										break;
									}
									case 2: {
										System.out.println("How much will you save?");
										transfer = reader.getDouble();
										if (transfer <= balance1) {
											balance1 = balance1 - transfer;
											balance2 = balance2 + transfer;
											System.out.println("Succeed!");
										} else {
											System.out.println("Failed!");
										}
										break;
									}
									default: {
										System.out.println("Invalid Input!");
									}
									case 0: {
										break;
									}
								}
								break;
							}
							case 2: {
								System.out.println("Please input the id number of the receiver:");
								login.moneyT();
								break;
							}
							case 3: {
								System.out.println("Hi Miss./Mr. " + name);
								System.out.println("Which feature would you like to choose?");
								System.out.println("1. Over draft");
								System.out.println("0. Exit");
								int menu_choice5 = reader.getInt();
								switch (menu_choice5) {
									case 1: {
										System.out.println("Please input the number of money you are going to overdraft:");
										double overdraft = reader.getDouble();
										balance1 = balance1 + overdraft;
										overDraftLimit = overDraftLimit - overdraft;
										System.out.println("Thank you for service");
										break;
									}
									case 0: {
										break;
									}
									default: {
										System.out.println("Invalid input");
										break;
									}
								}
								break;
							}
							case 4 : {
								double overdraft = totalOverdraftLimit - overDraftLimit;
								System.out.println("You now have £" + overdraft + " overdraft and your total overdraft limit is" + totalOverdraftLimit);
								System.out.println("Please input how much would you like to return:");
								double moneyBack = reader.getDouble();
								if(moneyBack < overdraft){
									overdraft = overdraft - moneyBack;
									overDraftLimit = overDraftLimit + moneyBack;
									System.out.println("Thanks for serving......");
								}
								else{
									System.out.println("The money you input should less than £" + overdraft);
								}
								break;
							}
							default: {
								System.out.println("Invalid Input!");
								break;
							}
							case 0: {
								break;
							}
						}


						break;
					}
					default: {
						System.out.println("Invalid Input!");
						break;
					}
					case 0: {
						break;
					}

				}
				if (menu_choice == 0) {
					break;
				}
			}
		}
	}//main method
}//class
