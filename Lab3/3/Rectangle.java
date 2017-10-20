package myPackage;

import java.util.Scanner;

public class Rectangle extends Shape {

	public void draw() {	    
	    char znak='*';
	    int height,width;
	    Scanner scan = new Scanner(System.in);;
	    System.out.print("Wprowadz wysokosc prostokata. ");
	    height = scan.nextInt();
	    System.out.print("Wprowadz szerokosc prostokata. ");
	    width = scan.nextInt();
	    for (int i = 0; i < height; i++) {
	        System.out.print(znak);
	        for (int j = 1; j < width - 1; j++) {
	            System.out.print(" ");
	            if (i == 0 || i == (height - 1)) {
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
