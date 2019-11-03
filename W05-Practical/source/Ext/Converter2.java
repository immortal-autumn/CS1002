public class Converter2{
//establish units
	String fot = " foot ";
	String fet = " feet ";
	String ich = " inch ";
	String ichs = " inches ";
	String yrd = " yard";
	String yrds = " yards";
	String mtr = " metre";
	String mtrs = " metres";
	String unitM="";
	String unitI="";
	String unitF="";
	String unitY="";

	
	//declare a method
	public void yard(int yard){
		
		double metre;
		double inch;
		
		//convert
		inch = yard * 36;
		metre = inch / 39.37008;
		
		//words back
		if(yard == 1){
		unitY = yrd;
		}
		else{
			if(yard > 1){
			unitY = yrds;
			}
			else{
				System.out.println("Invalid input");
			}
		}
		if(metre == 1){
			unitM = mtr;
		}
		else{
			unitM = mtrs;
		}
		
		//output data
		if(metre < 1){
		}
		else{
			System.out.println(yard + unitY + " in metres is:");
			System.out.println(Math.round(metre) + unitM);
		}	
	
	}
	
	//new foot converter
		public void foot(int foot){
		
		double metre;
		double inch;
		
		//convert
		inch = foot * 12;
		metre = inch / 39.37008;
		
		//words back
		if(foot == 1){
		unitF = fot;
		}
		else{
			if(foot > 1){
			unitF = fet;
			}
			else{
				System.out.println("Invalid input");
			}
		}
		if(metre == 1){
			unitM = mtr;
		}
		else{
			unitM = mtrs;
		}
		
		//output data
		if(metre < 1){
			
		}
		else{
			System.out.println(foot + unitF + " in metres is:");
			System.out.println(Math.round(metre) + unitM);
		}	
	
	}
	
  		//new inch converter
		public void inch(int inch){
		
		double metre;
		
		//convert
		metre = inch / 39.37008;
		
		//words back
		if(inch == 1){
		unitI = ich;
		}
		else{
			if(inch > 1){
			unitI = ichs;
			}
			else{
				System.out.println("Invalid input");
			}
		}
		if(metre == 1){
			unitM = mtr;
		}
		else{
			unitM = mtrs;
		}
		
		//output data
		if(metre < 1){
			
		}
		else{
			System.out.println(inch + unitI + " in metres is:");
			System.out.println(Math.round(metre) + unitM);
		}	
	
	}














}
