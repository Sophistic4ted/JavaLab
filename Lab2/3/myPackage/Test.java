package myPackage;

import java.util.LinkedList;
import java.util.Scanner;

class Test {
    static LinkedList<Punkt3D> punkty = new LinkedList<Punkt3D>();;


    public static void main(String [] argv) {
        Scanner scan = new Scanner(System.in);
        boolean koniec = true;
        while (koniec) {
            System.out.println("1. Wczytaj punkt 3D\r\n" + 
            		"2. Wyświetl wszystkie punkty\r\n" + 
            		"3. Oblicz odległość\r\n" + 
            		"4. Zakończ\r\n" + 
            		"?");
     
            String input = scan.nextLine();


            switch (input) {
                case "1":
                    System.out.println("Podaj x.");
                    double x = Double.valueOf(scan.nextLine());

                    System.out.println("Podaj y.");
                    double y = Double.valueOf(scan.nextLine());

                    System.out.println("Podaj z.");
                    double z = Double.valueOf(scan.nextLine());
                    
                    punkty.add(new Punkt3D(x,y,z));

                    System.out.println(String.format("Wczytano punkt (%.2f,%.2f,%.2f).", x, y, z));
                    break;
                case "2":
                    if (punkty.isEmpty()) {
                        System.out.println("Nie ma jeszcze żadnych punktów!");
                        break;
                    }
                    for (Punkt3D point : punkty) {
                        System.out.println(String.format("(%.2f,%.2f,%.2f).", point.getX(), point.getY(), point.getZ()));
                    }
                    break;
                case "3":
                    if (punkty.isEmpty()) {
                        System.out.println("Nie ma jeszcze żadynych punktów!");
                        break;
                    }

                    System.out.println("Podaj x.");
                    double x1 = Double.valueOf(scan.nextLine());

                    System.out.println("Podaj y.");
                    double y1 = Double.valueOf(scan.nextLine());

                    System.out.println("Podaj z.");
                    double z1 = Double.valueOf(scan.nextLine());

                    for (Punkt3D point : punkty) {
                        System.out.println(String.format("Odległość od (%.2f,%.2f,%.2f) to: %.2f",point.getX(), point.getY(), point.getZ(), point.distance(new Punkt3D(x1, y1, z1))));
                    }

                    break;

                case "4":
                    koniec = false;
            scan.close();
            }
        }
    }
}