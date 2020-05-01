package scanner;

import com.google.zxing.WriterException;
import java.io.IOException;
import java.util.Properties;
import java.util.UUID;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class EMAIL {
    public EMAIL(){
        
    }
    public void ENVIAR(String Destino,String Asunto, String Mensaje) {

        final String username = "dentaltoolkit@gmail.com";
        final String password = "octagono88";

        Properties props = new Properties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
          new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
          });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("Dental-Toolkit"));
            message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse(Destino));
            message.setSubject(Asunto);
            message.setText(Mensaje);
            Transport.send(message);
            System.out.println("Done");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
    public void ENVIARQR(String Destino,String Asunto, String Mensaje) throws IOException, WriterException {

        final String username = "dentaltoolkit@gmail.com";
        final String password = "octagono88";

        Properties props = new Properties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
          new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
          });

        try {
            ClienteQR QR = new ClienteQR();
            QR.crearQR(Destino);
            String cid = generateContentId("mango");
            MimeMultipart content = new MimeMultipart("related");
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("Dental-Toolkit"));
            message.setRecipients(Message.RecipientType.TO,
            InternetAddress.parse(Destino));
            message.setSubject(Asunto);
            message.setText(Mensaje);
            MimeBodyPart htmlPart = new MimeBodyPart();
            htmlPart.setText(""
              + "<html>"
              + " <body>"
              + "  <p>"+Mensaje+"</p>"
              + "  <img src=\"cid:" + cid + "\" />"
              + " </body>"
              + "</html>" 
              ,"UNICODE", "html");
            content.addBodyPart(htmlPart);
            MimeBodyPart imagePart = new MimeBodyPart();
            imagePart.attachFile("QR.png");
            imagePart.setContentID("<" + cid + ">");
            imagePart.setDisposition(MimeBodyPart.INLINE);
            content.addBodyPart(imagePart);
            message.setContent(content);
            Transport.send(message);
            System.out.println("Done");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
    public String generateContentId(String prefix) {
        return String.format("%s-%s", prefix, UUID.randomUUID());
    }
    
}