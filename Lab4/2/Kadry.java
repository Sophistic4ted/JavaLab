package myPackage;

import java.util.LinkedList;

public class Kadry {
	 LinkedList<Pracownik> pracownicy = new LinkedList<>();	 
	 void dodaj(Pracownik nowy_pracownik) {
		 pracownicy.add(nowy_pracownik);
	 }
	 boolean exists(String pesel_szukanego){
		 for (Pracownik x : pracownicy) {
			 if (pesel_szukanego.equals(x.getPesel())) {				 		
				 return true;
			 }
		 }
		 return false;
	 }
	 void usun(String pesel_zwolnionego) {
		 if (exists(pesel_zwolnionego)) {
			 pracownicy.removeIf(obj ->  pesel_zwolnionego.equals(obj.getPesel()));
		 }else {
			 System.out.println("Nie ma takiego pracownika!");
		 }
	 }
	 void szukaj(String pesel_szukanego) {
		 
		 if (exists(pesel_szukanego)) {
			 for (Pracownik x : pracownicy) {
				 if (pesel_szukanego.equals(x.getPesel())) {				 		
					 x.getString();
				 }
			 }			 
		 }else {
			 System.out.println("Nie ma takiego pracownika!");
		 }
			 
	 }
	 void zmienBrutto(Pracownik pracownik,double wynagrodzenieBrutto) {
		 pracownik.setwynagrodzenieBrutto(wynagrodzenieBrutto);
	 }
	 double pobierzBrutto(Pracownik pracownik) {
		 return pracownik.wynagrodzenieBrutto;
	 }
	 double pobierzNetto(Pracownik pracownik) {
		 return pracownik.oblicz_wynagrodzenieNetto();
	 }
	 
	 void wypisz_pracownikow(){
		 for (Pracownik p : pracownicy) {
	 
			p.getString();
		 }
		 System.out.println("--------------------------------------------------");
	 }
	 void porownaj() {
		 pracownicy.sort(new MyComparator());
	 }
}
