package myPackage;

public class Student extends Pracownik {

	public Student(String pesel, double wynagrodzenieBrutto) throws WrongPeselException {
		super(pesel, wynagrodzenieBrutto);
		}

	
	double oblicz_wynagrodzenieNetto() {
		return wynagrodzenieBrutto*0.8;
	}
	void getString() {		 
		System.out.println("Pesel: " + pesel.getpestring() +
				"\nTyp pracownika: " + "Student"+
				"\nWynagrodzenie Brutto: " + this.wynagrodzenieBrutto +
				"\nWynagrodzenie Netto: " + oblicz_wynagrodzenieNetto()
				);
	}
}
