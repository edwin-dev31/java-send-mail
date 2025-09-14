package org.learn.email;

public interface EmailSender {
	void sendEmail(String to, String subject, String content, Boolean isUsingTemplate);
}
