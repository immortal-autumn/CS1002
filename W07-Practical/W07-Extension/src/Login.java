
public class Login {
	//Place for choose account of the customer and their information
	EasyIn2 usernameI = new EasyIn2();
	EasyIn2 passwordI = new EasyIn2();
	EasyIn2 numReader = new EasyIn2();
	EasyIn2 moneyTrans = new EasyIn2();
	String usernameIn = null;
	String passwordIn = null;
	public String inputIdNum(){
		System.out.println("Please input your id number:");
		usernameIn = usernameI.getString();
		return usernameIn;
	}
	public String inputPass(){
		System.out.println("Please fill your password, please make sure that there is nobody around you :");
		passwordIn = passwordI.getString();
		return passwordIn;
	}
	//customers
			boolean checker = true;
		//Current Account
			String name = null;
			String dateOfBirth = null;
			String idNum = null;
			String password = " ";
			String accountNumber1 = null;
			double balance1 = 0;
			double overDraftLimit = 0;

			//Saving Account
			String accountNumber2 = null;
			double balance2 = 0;
			double interestRate = 0;


	public void LiHua(){
		name = "Li Hua";
		dateOfBirth = "1998/07/28";
		idNum = "888888";
		password = "888888";
		balance1 = 10992.00;
		balance2 = 20332.00;
		overDraftLimit = 20.00;
		interestRate = 0.8;
		accountNumber1 = "2000 0000 0000 00";
		accountNumber2 = "0002 0002 0002 00";
	}
	public void XiaoMing(){
		name = "Xiao Ming";
		dateOfBirth = "1996/07/28";
		idNum = "77777";
		password = "77777";
		balance1 = 832.00;
		balance2 = 0.00;
		overDraftLimit = 10.00;
		interestRate = 0.3;
		accountNumber1 = "1000 0060 0660 00";
		accountNumber2 = "0802 0802 0102 10";
	}
	public void Hasan(){
		name = "Hasan";
		dateOfBirth = "1999/02/14";
		idNum = "666666";
		password = "666666";
		balance1 = 66.00;
		balance2 = 66.00;
		overDraftLimit = 6.00;
		interestRate = 0.98;
		accountNumber1 = "2000 5277 0000 00";
		accountNumber2 = "0002 7252 0002 00";
	}
	//information check
	
	public boolean Pchecker(){
			if(passwordIn.equals(password)){
				System.out.println("Login succeed! ");
			}
			else{
				System.out.println("Wrong password. Login failed!");
				checker = false;
			}
		return checker;
	}

	public void moneyT(){
	    System.out.println("Please input the id number you'd like to transfer:");
        String accSel = numReader.getString();
        System.out.println("Please input the amount of money you want to transfer:");
        double moneyTr = moneyTrans.getDouble();
        balance1 = balance1 - moneyTr;
        if(accSel.equals("888888")){
            LiHua();
            balance1 = balance1 + moneyTr;
        }
        else {
            if (accSel.equals("77777")){
                XiaoMing();
                balance1 = balance1 + moneyTr;
            }
            else {
                if (accSel.equals("666666")){
                    Hasan();
                    balance1 = balance1 + moneyTr;
                }
                else {
                    System.out.println("Invalid Input");
                }
            }
        }
    }
}
