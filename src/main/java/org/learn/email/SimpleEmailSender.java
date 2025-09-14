package org.learn.email;

import jakarta.mail.Message;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;


public class SimpleEmailSender extends AbstractEmailSender {

	public SimpleEmailSender( 	String username, String password) {
		super(username, password);
	}

	@Override
	public void sendEmail(String to, String subject, String content, Boolean isUsingTemplate) {
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
			message.setSubject(subject);

            String format = (isUsingTemplate) ?
                    "text/html; charset=utf-8" :
                    "text/plain; charset=UTF-8";
			message.setContent(content, format);
			sendMessage(message);
		} catch (Exception e) {
			System.out.println("Error to send email: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
