package myPackage;

import java.util.Scanner;

public class Triangle extends Shape {

	public void draw() {	    
	    char znak='*';
	    int length;
	    Scanner scan = new Scanner(System.in);;
	    System.out.print("Wprowadz ramie trójkąta. ");
	    length = scan.nextInt();
	    for (int i = 0; i < length; i++) {//biezacy rzad	        
	        for (int j = 0; j < length*2 ; j++) {	            
	            if(i==length-1 && j <length) {
	                System.out.print(" " + znak);
	            }else if((j == length+1/2-i || j == length+1/2+i)&& i <length-1){
	            	System.out.print(znak);
	            }else  {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" ");
	        System.out.print("\n");                         
	    }
	    scan.close();
	}

}
