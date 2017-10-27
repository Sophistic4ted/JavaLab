package myPackage;


public class PESEL {

	String pesel;
   //Dziwne to, ale juz mi sie nie chce
	public PESEL(String pesel_) throws WrongPeselException {
		
			    check(pesel_);
				this.pesel = pesel_;	
		
			
	}

	public String getpestring() {		
		return this.pesel;
	}
	
    public static boolean check(String pesel) throws WrongPeselException{
    	String regex = "\\d+";
    	if (pesel.length()!=11 || !pesel.matches(regex)) {    		
    		throw new WrongPeselException("Wrong characters");}
    	String kod = "9731973197";
    	int suma = 0;
    	for (int i = 0; i < pesel.length()-1; i++) {
    		suma+= Character.getNumericValue(pesel.charAt(i))*Character.getNumericValue(kod.charAt(i));
    	}
        if (suma%10 == Character.getNumericValue(pesel.charAt(pesel.length()-1))){
        	return true;
        }else {
        	throw new WrongPeselException("Wrong control number");
        }
    }
}