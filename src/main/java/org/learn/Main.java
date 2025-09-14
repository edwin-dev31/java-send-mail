package org.learn;

import org.learn.email.EmailSender;
import org.learn.email.EmailContentService;
import org.learn.email.SimpleEmailSender;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Sender configuration
        String fromMail = "your.mail@gmail.com";   // Sender email (account with you create the App Password)
        String psd = "abcdefghijklmnop";           // App Password (not your regular password)
        String fromName = "Pepito Perez";          // Sender display name
        String subject = "This is a test with mail from Java";

        // Single recipient
        String toName = "Juan Armando";
        String toEmail = "juancho@compani.com";

        // Send one email
        EmailSender emailSender = new SimpleEmailSender(fromMail, psd);

        // Using template HTML
        Boolean isUsingTemplate = true;
        emailSender.sendEmail(
                toEmail,
                subject,
                EmailContentService.buildEmailWithTemplate(toName, fromName, fromMail),
                isUsingTemplate
        );

        // Plain text
        isUsingTemplate = false;
        emailSender.sendEmail(
                toEmail,
                subject,
                EmailContentService.buildEmailWithoutTemplate(toName, fromName, fromMail),
                isUsingTemplate
        );

        /*
        //Example: send to multiple recipients

        Map<String, String> companies = new HashMap<>();
        companies.put("Jose", "jose@gmail.com");
        companies.put("Dayana", "dayana@hotmail.com");

        for (Map.Entry<String, String> entry : companies.entrySet()) {
            String toName = entry.getKey();
            String toEmail = entry.getValue();
            System.out.println(toName + " -> " + toEmail);

            emailSender.sendEmail(
                toEmail,
                subject,
                EmailContentService.buildEmailWithTemplate(toName, fromName, fromMail),
                true
            );
        }
        */
    }

}