package in.ashwanthkumar.notify.email.config;

public class GMailConfig extends EmailConfig {
    public GMailConfig(String fromAddress, String toAddress, String subject, String username, String password) {
        super("smtp.gmail.com", 587, fromAddress, toAddress, subject, username, password);
    }
}
