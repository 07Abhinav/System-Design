package SolidPrinciple;

interface NotificationService {
    void sendNotification(String message);
}

interface LoggingService {
    void log(String message);
}

interface EmailService {
    void sendEmail(String email, String message);
}

class EmailServiceImpl implements EmailService {
    @Override
    public void sendEmail(String email, String message) {
        System.out.println("Sending email to " + email + " with message: " + message);
    }
}

class SmsNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS notification with message: " + message);
    }
}

class LoggingServiceImpl implements LoggingService {
    @Override
    public void log(String message) {
        System.out.println("Logging message: " + message);
    }
}

public class Dependency {
    public static void main(String[] args) {
        EmailService emailService = new EmailServiceImpl();
        emailService.sendEmail("test@example.com", "Hello, this is a test email.");

        NotificationService smsService = new SmsNotificationService();
        smsService.sendNotification("This is a test SMS notification.");

        LoggingService loggingService = new LoggingServiceImpl();
        loggingService.log("This is a test log message.");
    }
}
