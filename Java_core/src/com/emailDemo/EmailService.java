package com.emailDemo;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Message.RecipientType;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


public class EmailService {	

	
	public void sendEmail(String fileName){
		String filepath = fileName;
		String message1 = "Demo Mail From Rahul";
		
		String ltter_subject = "File test";
		String emailTo= "vinay.satam@globalpayex.in";
		String emailCC = "rahul.bhor@globalpayex.in";
		String retailer_email = "";
		List<String> myList = new ArrayList<String>(Arrays.asList(emailCC.split(",")));
		String emailSubject = "Report File";
		sendEmailWithAttachment(filepath, message1, emailTo, myList,retailer_email,emailSubject);
	}

	public void sendEmailWithAttachment(String filepath, String message, String emailTo, List<String> email_cc,String retailer_email,String emailSubject) {

		String host = "smtp.rediffmailpro.com";
		final String from = "rahul.bhor@globalpayex.in";
		final String pass = "8655494812";

		Properties props = System.getProperties();
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.user", from);
		props.put("mail.smtp.password", pass);
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.starttls.enable", "true");

		//create Authenticator object to pass in Session.getInstance argument
		Authenticator auth = new Authenticator() {
			//override the getPasswordAuthentication method
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from, pass);
			}
		};

		Session session = Session.getInstance(props);
		MimeMessage message1 = new MimeMessage(session);
		try {
			message1.setSubject(emailSubject);
			message1.setFrom(new InternetAddress(from));
			List<InternetAddress> toAddress = new ArrayList<>();

			// To get the array of addresses
			if(email_cc.size() > 0){
				for (int i = 0; i < email_cc.size(); i++) {
					toAddress.add(new InternetAddress(email_cc.get(i)));
				}

				for (int i = 0; i < toAddress.size(); i++) {
					message1.addRecipients(RecipientType.CC, toAddress.get(i)
							.toString());
				}
			}
			else
			{
				System.out.println("No extra Email iD present for CC during email sending .");
			}
			System.out.println("Sending email to " + emailTo);
			System.out.println("Email cc are :" + email_cc);
			message1.addRecipients(RecipientType.TO, emailTo);
			// Create the message part
			BodyPart messageBodyPart = new MimeBodyPart();
			messageBodyPart.setContent(message, "text/html; charset=utf-8");
			/*if(message2!=null && !message2.isEmpty() && message2.length() > 0){
				messageBodyPart.setContent(message.concat(message2), "text/html; charset=utf-8");
			}
			else{
				messageBodyPart.setContent(message, "text/html; charset=utf-8");
			}*/
			
			// Create a multipar message
			Multipart multipart = new MimeMultipart();

			// Set text message part
			multipart.addBodyPart(messageBodyPart);

			File f = new File(filepath);
			// Part two is attachment
			messageBodyPart = new MimeBodyPart();
			DataSource source = new FileDataSource(filepath);
			messageBodyPart.setDataHandler(new DataHandler(source));
			messageBodyPart.setFileName(f.getName());
			multipart.addBodyPart(messageBodyPart);
			message1.setContent(multipart);

			Transport transport = session.getTransport("smtp");
			transport.connect(host, from, pass);
			transport.sendMessage(message1, message1.getAllRecipients());
			transport.close();
			System.out.println("Email Sent Successfully");
		} catch (AddressException ae) {
			ae.printStackTrace();
		} catch (MessagingException me) {
			me.printStackTrace();
		}
	}

}
