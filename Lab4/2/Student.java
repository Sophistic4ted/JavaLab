package myPackage;

public class Student extends Pracownik {

	public Student(String pesel, double wynagrodzenieBrutto) throws WrongPeselException {
		super(pesel, wynagrodzenieBrutto);
		}

	
	double oblicz_wynagrodzenieNetto() {
		return wynagrodzenieBrutto*0.8;
	}

}
