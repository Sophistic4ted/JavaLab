package myPackage;

import java.util.Scanner;

public class Test {
	public static void main(String [] argv) {
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Wybierz kształt do narysowania:\r\n" + 
        		"1.Okrąg\r\n" + 
        		"2.Kwadrat\r\n" + 
        		"3.Prostokąt\r\n" + 
        		"4.Trójkąt\r\n"+
        		"?");
 
        String choice = scan.nextLine();
        

        switch (choice) {
            case "1":
            	Shape circle = new Circle();
            	circle.draw();
                break;
            case "2":
            	Shape square = new Square();
            	square.draw();
            	break;
            case "3":
            	Shape rectangle = new Rectangle();
            	rectangle.draw();
                break;
            case "4":
            	Shape triangle = new Triangle();
            	triangle.draw();
                break;
        }

        scan.close();
	}
}

