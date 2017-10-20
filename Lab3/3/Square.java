package myPackage;

import java.util.Scanner;

public class Square extends Shape {

	public void draw() {	    
	    char znak='*';
	    int length;
	    Scanner scan = new Scanner(System.in);;
	    System.out.print("Wprowadz bok kwadratu. ");
	    length = scan.nextInt();
	    for (int i = 0; i < length; i++) {
	        System.out.print(znak);
	        for (int j = 1; j < length - 1; j++) {
	            System.out.print(" ");
	            if (i == 0 || i == (length - 1)) {
	                System.out.print(znak);
	            } else {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" ");
	        System.out.print(znak + "\n");                         
	    }
	    scan.close();
	}

}
