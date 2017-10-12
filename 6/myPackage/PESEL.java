package myPackage;

import java.io.*;

public class PESEL {	
	public static String getString() {
		String pesel = null;
		try {
				InputStreamReader rd = new InputStreamReader(System.in);
				BufferedReader bfr = new BufferedReader(rd);
				
				pesel = bfr.readLine();
				
		}catch(IOException e) {e.printStackTrace();}
		return pesel;
	}
    public static boolean check(String pesel){
    	String regex = "\\d+";
    	if (pesel.length()!=11 || !pesel.matches(regex)) {    		
    		System.out.print("Wrong characters");
    		return false;}
    	String kod = "9731973197";
    	int suma = 0;
    	for (int i = 0; i < pesel.length()-1; i++) {
    		suma+= Character.getNumericValue(pesel.charAt(i))*Character.getNumericValue(kod.charAt(i));
    	}
        if (suma%10 == Character.getNumericValue(pesel.charAt(pesel.length()-1))){
        	return true;
        }else {
        	System.out.print("Wrong control number");
        	return false;
        }
    }
}
