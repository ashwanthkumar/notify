package in.ashwanthkumar.notify.email.config;

public class EmailConfig {
    private String smtpHost;
    private Integer smtpPort;
    private String fromAddress;
    private String toAddress;
    private String subject;

    private String username;
    private String password;

    public EmailConfig(String smtpHost, Integer smtpPort, String fromAddress, String toAddress, String subject, String username, String password) {
        this.smtpHost = smtpHost;
        this.smtpPort = smtpPort;
        this.fromAddress = fromAddress;
        this.toAddress = toAddress;
        this.subject = subject;
        this.username = username;
        this.password = password;
    }

    public String getSmtpHost() {
        return smtpHost;
    }

    public Integer getSmtpPort() {
        return smtpPort;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public String getToAddress() {
        return toAddress;
    }

    public String getSubject() {
        return subject;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
