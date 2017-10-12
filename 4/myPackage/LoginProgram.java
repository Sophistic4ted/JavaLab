package myPackage;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author Szymon
 */
public class LoginProgram {
    public static void main(String[] argv){
      Login log = new Login ("ala", "makota");
	  try{
		InputStreamReader rd = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(rd);

   		System.out.print("Type your login: ");
			String login = bfr.readLine();
		System.out.print("Type your password: ");
        	String haslo = bfr.readLine();

        if(log.check(login, haslo)){
        	System.out.print("OK");
        }else {
        	System.out.print("Wrong login or password.");
        }

	  }catch(IOException e){e.printStackTrace();}

    }
}
