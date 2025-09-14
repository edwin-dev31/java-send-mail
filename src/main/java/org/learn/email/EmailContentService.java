package org.learn.email;

public class EmailContentService {

    /**
     * Simple HTML template version of the email you can custom as much as you want.
     */
    public static String buildEmailWithTemplate(String recipientName, String senderName, String senderEmail) {
        String template = """
            <!doctype html>
            <html lang="en">
            <head><meta charset="utf-8"></head>
            <body style="font-family:Arial, sans-serif; color:#333; padding:20px;">
              <h2 style="color:#0b74ff;">Hello %s,</h2>
              <p>I hope you are doing well. This is a test email sent from Java using an HTML template.</p>
              <p><strong>Trial offer:</strong> 15 days free to evaluate my work.</p>
              <p><strong>Rate after trial:</strong> $10 USD per hour.</p>
              <p style="margin-top:20px;">Best regards,<br>%s (<a href="mailto:%s">%s</a>)</p>
            </body>
            </html>
            """;
        return template.formatted(recipientName, senderName, senderEmail, senderEmail);
    }

    /**
     * Plain text version (no HTML).
     */
    public static String buildEmailWithoutTemplate(String recipientName, String senderName, String senderEmail) {
        return String.format(
                "Hello %s,\n\n"
                        + "I hope you are doing well. This is a test email sent from Java without a template.\n\n"
                        + "Trial offer: 15 days free to evaluate my work.\n"
                        + "Rate after trial: $10 USD per hour.\n\n"
                        + "Best regards,\n%s (%s)",
                recipientName, senderName, senderEmail
        );
    }
}
