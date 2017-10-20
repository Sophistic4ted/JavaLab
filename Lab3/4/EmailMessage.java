package myPackage;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
public class EmailMessage {

    private String from; //required (must be e-mail)
    private LinkedList<String> to; //required at least one (must be e-mail)
    private String subject; //optional
    private String content; //optional
    private String mimeType;  // optional
    private LinkedList<String> cc; //optional
    private LinkedList<String> bcc; // optional
    
    public EmailMessage(Builder builder){
    	           from = builder.from;
    	           to = builder.to;
    	           subject = builder.subject;
    	           content = builder.content;
    	           mimeType = builder.mimeType;
    	           cc = builder.cc;
    	           bcc= builder.cc;
    	      }
    	    

    public static Builder builder() {
        return new EmailMessage.Builder();
    	}
    
    	public static class Builder {
    	    private String from; //required (must be e-mail)
    	    private LinkedList<String> to; //required at least one (must be e-mail)
    	    private String subject; //optional
    	    private String content; //optional
    	    private String mimeType;  // optional
    	    private LinkedList<String> cc; //optional
    	    private LinkedList<String> bcc; // optional

		EmailMessage build() {	       
	            return new EmailMessage(this);
	       }
    	
    	Builder addFrom(String from_) throws Exception {
            if (!from_.matches("[a-zA-Z0-9\\.]+@[a-zA-Z0-9\\.]+\\.[a-z]+")) {
                throw new Exception("Wrong email adress.");
            }
            this.from = from_;
            return this;
        }

        Builder addTo(String... to_) throws Exception{
            for(String x : to_){
                if (!x.matches("[a-zA-Z0-9\\.]+@[a-zA-Z0-9\\.]+\\.[a-z]+")) {
                    throw new Exception("Wrong email adress.");
                }
            }
            this.to = new LinkedList<>(Arrays.asList(to_));
            return this;
        }

        Builder addSubject(String subject_) {
            this.subject = subject_;
            return this;
        }

        Builder addContent(String content_) {
            this.content =  content_;
            return this;
        }

        public Builder mimeType(String mimetype_) {
            this.mimeType = mimetype_;
            return this;
        }

        public Builder cc(String... cc_) {
            this.cc = new LinkedList<>(Arrays.asList(cc_));
            return this;
        }

        public Builder bcc(String... bcc_) {
            this.bcc = new LinkedList<>(Arrays.asList(bcc_));
            return this;
        }

    }

//ze strony tutorialspoint
    public void send() {
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", "localhost");
        Session session = Session.getDefaultInstance(properties);

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to.get(0)));
            message.setSubject(subject);
            message.setText(content);
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (Exception mex) {
            mex.printStackTrace();
        }

    }
}