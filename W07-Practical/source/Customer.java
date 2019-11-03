/*Each customer has 2 accounts: a current account and a savings account. Each customer also has an
id, a name and a date of birth. A current account has an account number, a balance and an
overdraft limit. A savings account has an account number, a balance and an interest rate.
The program should support the following operations:
• Calculate the current age of a customer
• Calculate the total money held by a customer in both his/her accounts (not including the
overdraft)
• Print out the id, name, age and total money held by any customer in a tidy format
• Pay a specified amount of money into a current account
• Calculate the amount of money available in a current account (including the overdraft)
• Withdraw a specified amount of money from a current account, provided the withdrawal
does not take the balance over the overdraft limit
• Print out the account number, balance and overdraft limit of any current account
• Deposit a specified amount of money into a savings account
• Withdraw a specified amount of money from a savings account, provided adequate funds
are available
• Transfer a specified amount of money from a customer’s savings account into his/her
current account, provided adequate funds are available
• Pay simple interest on the current balance of a savings account
• Print out the account number, balance and interest rate of any savings account
*/
/**
 * @author Elwin_Li
 */

//class
public class Customer {
	//Current Account
	private String name;
	private String dateOfBirth;
	private String idNum;
	private String accountNumber1;
	private double balance1;
	private double overDraftLimit;
	
	//Saving Account
	private String accountNumber2;
	private double balance2;
	private double interestRate;
	
	//saving account
	//name
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	//date of birth
	public void setDateOfBirth(String dateOfBirth){
		this.dateOfBirth = dateOfBirth;
		//return this.dateOfBirth;
	}

	public String getDateOfBirth(){
		return dateOfBirth;
	}
	//idNumber
	public void setIdNum(String idNum){
		this.idNum = idNum;
	}
	public String getIdNum(){
		return idNum;
	}
	//accountNumber
	public void setAccountNumber1(String accountNumber1){
		this.accountNumber1 = accountNumber1;
	}
	public String getAccountNumber1(){
		return accountNumber1;
	}
	//balance1
	public void setBalance1(double balance1){
		this.balance1 = balance1;
	}
	public double getBalance1(){
		return balance1;
	}
	//overdraft limit
	public void setOverdraftLimit(double overDraftLimit){
		this.overDraftLimit = overDraftLimit;
	}
	public double getOverDraftLimit(){
		return overDraftLimit;
	}
	//saving account
	//accountnumber2
	public void setAccountNumber2(String accountNumber2){
		this.accountNumber2 = accountNumber2;
	}

	public String getAccountNumber2() {
		return accountNumber2;
	}
	//balance
	public void setBalance2(double balance2){
		this.balance2 = balance2;
	}

	public double getBalance2() {
		return balance2;
	}
	//interestrate
	public void setInterestRate(double interestRate){
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}
}



