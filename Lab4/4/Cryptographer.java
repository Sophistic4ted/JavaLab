package myPackage;
import java.nio.file.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Objects;
import java.util.Scanner;

public class Cryptographer {
	static void cryptfile(String pre_crypt, String crypted, Algorithm algorithmType) {
		//wczytywanie z pliku
		Charset charset = Charset.forName("US-ASCII");		
		try (BufferedReader reader = Files.newBufferedReader(Paths.get(pre_crypt), charset)) {
		    String line = null;
		    while ((line = reader.readLine()) != null) {
		    	String[] words = line.split(" ");
		    	//czyszczenie pliku wyjsciowego
	    		PrintWriter pw = new PrintWriter(crypted);
				pw.close();
		    	for (String word : words) {
		    		String s = algorithmType.crypt(word);
		    		//wpisywanie do pliku
		    		try(FileWriter fw = new FileWriter(crypted, true);		    				
		    		BufferedWriter bw = new BufferedWriter(fw);
		    		PrintWriter out = new PrintWriter(bw)) {
		    		
					out.print(s);
		    		}catch (IOException e) {
		    		System.err.format("IOException: %s%n", e);
		    	}
		    
		    	}
		    }
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}		
	}

		
	
	static void decryptfile(String pre_crypt, String crypted, Algorithm algorithmType) {
		//wczytywanie z pliku
		Charset charset = Charset.forName("US-ASCII");		
		try (BufferedReader reader = Files.newBufferedReader(Paths.get(pre_crypt), charset)) {
		    String line = null;
		    while ((line = reader.readLine()) != null) {
		    	String[] words = line.split(" ");
		    	//czyszczenie pliku wyjsciowego
	    		PrintWriter pw = new PrintWriter(crypted);
				pw.close();
		    	for (String word : words) {
		    		String s = algorithmType.decrypt(word);
		    		//wpisywanie do pliku
		    		try(FileWriter fw = new FileWriter(crypted, true);		    				
		    		BufferedWriter bw = new BufferedWriter(fw);
		    		PrintWriter out = new PrintWriter(bw)) {
		    		
					out.print(s);
		    		}catch (IOException e) {
		    		System.err.format("IOException: %s%n", e);
		    	}
		    
		    	}
		    }
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}		
	}
	
	public static void main(String args[]) {
		String arg_in = "C:\\Users\\Kamil\\JavaWorkspace\\Lab4_5\\src\\myPackage\\tekst.txt";
		String arg_out = "C:\\Users\\Kamil\\JavaWorkspace\\Lab4_5\\src\\myPackage\\szyfr.txt";
		Algorithm algorithmType = null;
		Scanner scan = new Scanner(System.in);
        System.out.println("Uzyc algorytmu Polibiusza(1), czy ROT11(2)");
        String alg_type = scan.nextLine();
		if (Objects.equals("1", alg_type)) {
			algorithmType = new Polibiusz();
		}else if (Objects.equals("2", alg_type)){
			algorithmType = new ROT11();
		}
	    System.out.println("Chcesz szyfrowac(1), czy deszyfrowac(2) plik?");
	    String de_or_crypt = scan.nextLine();
        switch (de_or_crypt) {
	        case "1":
	        	cryptfile(arg_in,arg_out,algorithmType);
	            break;
	        case "2":
	        	decryptfile(arg_in,arg_out,algorithmType);
	        	break;
	    }
        scan.close();
	}
}