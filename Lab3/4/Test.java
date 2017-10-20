package myPackage;
import javax.mail.Transport;
public class Test {
    public static void main(String args[]) {
    	EmailMessage wiadomosc = null;
        try {
        	wiadomosc = EmailMessage.builder()
        			  .addFrom("bobek@agh.edu.pl")
        			  .addTo("sophistic4ted@gmail.com")
        			  .addSubject("Mail testowy")
        			  .addContent("Brak tresci")
        			  .build();
                    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(wiadomosc.toString());
        wiadomosc.send();

    }
}