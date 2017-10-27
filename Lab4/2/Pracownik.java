package myPackage;

public abstract class Pracownik {
	PESEL pesel;
	double wynagrodzenieBrutto;
	abstract double oblicz_wynagrodzenieNetto();
	public Pracownik(String pesel_, double wynagrodzenieBrutto) throws WrongPeselException {
		    this.pesel = new PESEL(pesel_);
		    this.setwynagrodzenieBrutto(wynagrodzenieBrutto);
	}
	void getString() {		 
		System.out.println("Pesel: " + pesel.getpestring() +
				"\nWynagrodzenie Brutto: " + this.wynagrodzenieBrutto 
				);
	}
	public String getPesel() {
		return pesel.getpestring();
	}

	
	public void setwynagrodzenieBrutto(double wynagrodzenieBrutto) {
		this.wynagrodzenieBrutto = wynagrodzenieBrutto;
	}
    
}
