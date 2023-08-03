public class Main {
    public static void main(String[] args) {
        
        MessageSender emailSender = new EmailSender();
        MessageSender smsSender = new SmsSender();

      
        MessageService emailService = new MessageService(emailSender);
        MessageService smsService = new MessageService(smsSender);

        emailService.sendMessage(" This is an email! ");
        smsService.sendMessage(" This is an SMS! ");
    }
}
