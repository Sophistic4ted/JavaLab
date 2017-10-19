package myPackage;


public class PESELProgram {
	public static void main(String [] argv) {
		// pobranie limitu
		System.out.print("Type the PESEL:");
			String pesel = PESEL.getString();			
		//utworzenie listy z odpowiednia iloscia elementow
	        if(PESEL.check(pesel)){
	        	System.out.print("OK");
	        }else {
	        	System.out.print("Not a PESEL");
	        }
}
}