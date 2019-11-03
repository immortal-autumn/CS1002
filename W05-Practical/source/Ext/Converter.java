public class Converter{	
	//declare Unit
	String fot = " foot ";
	String fet = " feet ";
	String ich = " inch ";
	String ichs = " inches ";
	String yrd = " yard";
	String yrds = " yards";
	String mtr = " metre";
	String mtrs = " metres";

	//converter
	public void convert(int meter){
		String unitM="";
		String unitI="";
		String unitF="";
		String unitY="";
		double totalInch;
		double foot;
		double inch;
		double yard;
		//declare how to convert
		totalInch = 39.37008 * meter;
		yard = totalInch / 36;
		yard = Math.floor(yard);
		double rest = totalInch - (yard * 36);
		rest = Math.floor(rest);
		foot = rest / 12;
		foot = Math.floor(foot);
		//inch = totalInch - rest - (yard * 36);
		inch = (totalInch - (yard * 36)) % 12;
		inch = Math.round(inch);
		if(inch == 12){
		inch = inch - 12;
		foot = foot + 1;
		}
		//words back
		if(meter == 1){
		unitM = mtr;
		}
		else{
			if(meter > 1){
			unitM = mtrs;
			}
			else{
			System.out.println("Invalid input!");
			
			}
		}
		if(inch == 1){
			unitI = ich;
			}
		else{
			unitI = ichs;
		}
		if(yard == 1){
			unitY = yrd;
		}
		else{
			unitY = yrds;
		}
		if(foot == 1){
			unitF = fot;
		}
		else{
			unitF = fet;
		}
		//outprint data in conditional
		if(meter <= 0){
			
		}
		else{
			if(foot == 0){
			System.out.println(Math.round(meter) + unitM + " in yards, feet and inches is:");
			System.out.println(Math.round(yard) + unitY + " and " + Math.round(inch) + unitI);
		}
		else {
			if(inch == 0){
			System.out.println(Math.round(meter) + unitM + " in yards, feet and inches is:");
			System.out.println(Math.round(yard) + unitY + " and " + Math.round(foot) + unitF);
			}
			else{
			System.out.println(Math.round(meter) + unitM + " in yards, feet and inches is:");
			System.out.println(Math.round(yard) + unitY + ", " + Math.round(foot) + unitF + "and " + Math.round(inch) + unitI);
			}
		}
		}
	
	
	
	}
		//calculate*/
		/*int yard = meter;
		int foot = feet;
		int inch = inches;
		int yard = yards;*/
		//return
		/*if(meter == 1){
			System.out.println(meter + " metre in yards, feet and inches is:");
			System.out.println(yard + " yards, " + foot + " feet and " + inch + " inches");
		}
		else{
			if(foot == 1){
			System.out.println(meter + " metres in yards, feet and inches is:");
			System.out.println(yard + " yards, " + foot + " foot and " + inch + " inches");
			}
			else{
				if(yard == 1){
					System.out.println(meter + " metres in yards, feet and inches is:");
					System.out.println(yard + " yard, " + foot + " feet and " + inch + " inches");
				}
					else{
						if(inch == 1){
							System.out.println(meter + " metres in yards, feet and inches is:");
							System.out.println(yard + " yards, " + foot + " feet and " + inch + " inch");
						}
						else{
						System.out.println(meter + " metres in yards, feet and inches is:");
						System.out.println(yard + " yards, " + foot + " feet and " + inch + " inches");
		
						}
					}
				}
			}
			
		}*/
	
}
