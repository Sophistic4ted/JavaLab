package myPackage;

public class PracownikEtatowy extends Pracownik {
	double wynagrodzenieBrutto;
	
	
	public PracownikEtatowy(String pesel, double wynagrodzenieBrutto) throws WrongPeselException {
		super(pesel, wynagrodzenieBrutto);
		// TODO Auto-generated constructor stub
	}

	double oblicz_wynagrodzenieNetto() {
		return wynagrodzenieBrutto*0.6;
	}
	void getString() {		 
		System.out.println("Pesel: " + pesel.getpestring() +
				"\nTyp pracownika: " + "Pracownik Etatowy"+
				"\nWynagrodzenie Brutto: " + this.wynagrodzenieBrutto +
				"\nWynagrodzenie Netto: " + oblicz_wynagrodzenieNetto()
				);
	}


}
