package myPackage;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Kadry k1 = new Kadry();	
		Scanner scan = new Scanner(System.in);
	    boolean koniec = true;	
		while (koniec){				
	            System.out.println("1. Wczytaj Pracownika\r\n" + 
	            		"2. Wyświetl wszystkich pracownikow\r\n" + 
	            		"3. Szukaj pracownika po numerze pesel\r\n" + 
	            		"4. Posortuj wedlug wynagrodzenia Brutto\r\n" + 
	            		"5. Usun Pracownika\r\n" + 
	            		"6. Zakończ\r\n" + 
	            		"?");
	     
	            String input = scan.nextLine();


	            switch (input) {
	                case "1":
	                		                    
	                    System.out.println("Podaj typ pracownika: "
	                    		+ "\nStudent(1) "
	                    		+ "\nPracownik Etatowy(2): ");
	                    int typ = Integer.valueOf(scan.nextLine());
	                	System.out.println("Podaj PESEL (Przykladowe pesele)\n"+
	                			"90090515836\n" +
	                			"92071314764\n" +
	                			"67040500538\n" +
	                			"81100216357\n"
	                			);	                	
	                    String pesel = scan.nextLine();	                    
	                    System.out.println("Podaj wynagrodzenie brutto: ");
	                    double brutto = Double.valueOf(scan.nextLine());
					try {
						if (typ == 1) {
							k1.dodaj(new Student(pesel,brutto));
						}else if (typ == 2) {
							k1.dodaj(new PracownikEtatowy(pesel,brutto));
						}
					} catch (WrongPeselException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
						System.out.println("Dodano Pracownika! ");
		                break;
	                case "2":
	                	k1.wypisz_pracownikow();
	                    break;
	                case "3":
	                	System.out.println("Podaj pesel Pracownika do wyswietlenia: ");
	                	String peselz = scan.nextLine();
	                	k1.szukaj(peselz);
	                	break;
	                case "4":
	                	k1.porownaj();
	                    break;
	                case "5":
	                	System.out.println("Podaj pesel Pracownika do usuniecia: ");
	                	String peselu = scan.nextLine();
	                	k1.usun(peselu);
	                	break;
	                case "6":
	                    koniec = false;
	            scan.close();
	            }
	            try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
	}
}
