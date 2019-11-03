public class Staff_Information_Print extends Staff_Information{
    //common
    private String idNum;
    private String name;
    private double salary;
    private String retirementDate;
    //salary
    private double totalSalaryCost = 0;
    private double customer_service_salary = 0;
    private double software_developer_salary = 0;
    private double retirement_salary = 0;

    private String specialSkills;//software developer
    private int yearOfWorking;//customer service
    private String employerType;
    //customer service longest experience
    private String lon_wor_exp_idNum;
    private int lon_wor_exp = 0;
    private String lon_wor_exp_name;
    private double lon_wor_exp_salary;
    //times of printing the manager
    private int times = 1;

    //systemdate
    private System_Date system_Date;

    //how to set the longest working experience for staff?

    public void Staff_Information_Printer(){
        system_Date = new System_Date();
        Staff_Informations();
        //read and list informations
        System.out.println("--Staff Informations--");
        System.out.println(seperator);
        for(int t=1;t<3;t++){
            for(int i=1;i<5;i++){
                switch (i) {
                    case 1:{
                        employerType = axio.employerType;
                        idNum = axio.getIdNum();
                        name = axio.getName();
                        retirementDate = axio.getRetirementDate();
                        salary = axio.getSalary();
                        specialSkills = axio.getSpecialSkills();
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
                        specialSkills = hasan.getSpecialSkills();
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
                String retirement = retirementDate.substring(0,4);
                //System.out.println(retirement);
                int retirementYear = Integer.parseInt(retirement);
                //System.out.println(system_Date.systemYear);

                retirementYear = retirementYear - system_Date.systemYear;
                String unitString;
                //totalSalaryCost = totalSalaryCost + salary;

                //set unit and calculate retirement year!
                if(retirementYear <= 1){
                    unitString = " year. ";
                    if(t == 1){
                        retirement_salary = retirement_salary + salary;
                    }
                }
                else{
                    unitString = " years. ";
                }

                //tell two kind of staff
                switch(t) {
                    case 1: {
                        if(employerType.equals("Software Developer")){

                            System.out.println("  -Software Developer-  ");
                            if(times == 0){
                                System.out.println("  -manager- ");
                                System.out.println("  Id number: " + edward.getIdNum() + "  Name" + edward.getName());
                                System.out.println("  Salary: £" + edward.getSalary() + "  Retirement Date: " + edward.getRetirementDate());
                                System.out.println("  Office: " + employerType + "  Staff: " + edward.getEmployer());
                                System.out.println(seperator);
                                times = 1;
                            }
                            System.out.println("  id number: " + idNum + "  Name: " + name);
                            System.out.println("  Salary: £" + salary + "  Retirement date: " + retirementDate);
                            System.out.println("  Special skills: " + specialSkills);
                            System.out.println("  Retirement: In " + retirementYear + unitString);
                            software_developer_salary = software_developer_salary + salary;
                            System.out.println(seperator);
                        }
                        break;
                    }
                    case 2:{
                        if(employerType.equals("Customer Service")){
                            if(times == 0){
                                System.out.println(" -manager- ");
                                System.out.println(" Id number: " + philipse.getIdNum() + "  Name" + philipse.getName());
                                System.out.println(" Salary: £" + philipse.getSalary() + "  Retirement Date: " + philipse.getRetirementDate());
                                System.out.println(" Office: " + employerType + "  Staff: " + philipse.getEmployer());
                                System.out.println(seperator);
                                times = 1;
                            }
                            System.out.println("  -Customer Service-  ");
                            System.out.println("  id number: " + idNum + "  Name: " + name);
                            System.out.println("  Salary: £" + salary + "  Retirement date: " + retirementDate);
                            System.out.println("  Year of working: " + yearOfWorking);
                            System.out.println("  Retirement: In " + retirementYear + unitString);
                            customer_service_salary = customer_service_salary + salary;
                            System.out.println(seperator);
                            //I might should get the ongest working experience here.

                            if(yearOfWorking > lon_wor_exp){
                                lon_wor_exp = yearOfWorking;
                                lon_wor_exp_name = name;
                                lon_wor_exp_idNum = idNum;
                                lon_wor_exp_salary = salary;
                            }
                        }
                        break;
                    }
                    default:{
                        break;
                    }
                }
            }
            times = 0;
        }
        totalSalaryCost = customer_service_salary + software_developer_salary;
        System.out.println("**********   Total Salary Cost   **********" + " *************Customer Service: £" + customer_service_salary );
        System.out.println("************      £" + totalSalaryCost + "       *********** *****************************************");
        System.out.println("*******************************************" + " ********Software Developer: £" + software_developer_salary );
        System.out.println("************************Retirement Salary Cost: £" + retirement_salary + "*******************************");
        System.out.println(seperator);
        System.out.println("*************** The oldest staff (only available for costumer service) ***************");
        System.out.println("*************** id number: " + lon_wor_exp_idNum + " ||  Name: " + lon_wor_exp_name);
        System.out.println("*************** salary: " + lon_wor_exp_salary + "  ||   Working experience: " + lon_wor_exp);
        System.out.println(seperator);
    }
}
