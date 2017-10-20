package myPackage;
public class Test {
    public static void main(String args[]) {
    	EmailMessage wiadomosc = null;
        try {
        	wiadomosc = EmailMessage.builder()
        			  .addFrom("pewienpanppp@gmail.com")
        			  .addTo("sophistic4ted@gmail.com")
        			  .addSubject("Hello Mail")
        			  .addContent("Czesc Pszemek")
        			  .build();
                    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(wiadomosc.toString());
        wiadomosc.send();

    }
}