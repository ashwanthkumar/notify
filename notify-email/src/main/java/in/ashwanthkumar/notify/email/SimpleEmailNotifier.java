package in.ashwanthkumar.notify.email;

import in.ashwanthkumar.notify.Notifier;
import in.ashwanthkumar.notify.email.config.EmailConfig;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SimpleEmailNotifier implements Notifier {
    private EmailConfig config;

    public SimpleEmailNotifier(EmailConfig config) {
        this.config = config;
    }

    @Override
    public void notify(String message) {
        try {
            Email email = new SimpleEmail();
            email.setHostName(config.getSmtpHost());
            email.setSmtpPort(config.getSmtpPort());
            email.setAuthenticator(new DefaultAuthenticator(config.getUsername(), config.getPassword()));
            email.setSSLOnConnect(true);
            email.setFrom(config.getFromAddress());
            email.setSubject(config.getSubject());
            email.setMsg(message);
            email.addTo(config.getToAddress());
            email.send();
        } catch (EmailException e) {
            throw new RuntimeException(e);
        }
    }
}
