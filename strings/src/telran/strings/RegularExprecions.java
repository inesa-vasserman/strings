package telran.strings;

public class RegularExprecions {
	
	public static String javaVariable() {
		
		String regex = "[A-Za-z$][\\w$]*|_[\\w$]+";
		//Return regex for checking a java variable string
		
		return regex;
		
	}
	public static String zero_300() {
		
		String regex = "[1-9]\\d?|[1-2]\\d\\d|300|0";
		return null;
		
	}
	
	public static String ipOptet() {
		return null;
		
		//TODO
		//1 - 3 symbols presenting number from 0 - 255 + 000
	}
	
	public static String mobileIsraelPhone() {
		//+972-5>-<7
		return null;
	}
	
	

}
