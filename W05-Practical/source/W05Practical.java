public class W05Practical{
	public static void main(String[] args){
		//main method and show convert result
		EasyIn2 distanceMeter = new EasyIn2();
		Converter converter = new Converter();
		System.out.println("Enter distance in metres");
		int meter = distanceMeter.getInt();	
		//int distanceMeter = converter.getMeter();
		converter.convert(meter);
		//System.out.println(converter.test);
	}
}
