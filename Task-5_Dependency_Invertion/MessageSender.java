interface MessageSender {
    void sendMessage(String message);
}

class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        // Code to send an email
        System.out.println("Sending email: " + message);
    }
}

class SmsSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        // Code to send an SMS
        System.out.println("Sending SMS: " + message);
    }
}

class MessageService {
    private final MessageSender sender;

    public MessageService(MessageSender sender) {
        this.sender = sender;
    }

    public void sendMessage(String message) {
        sender.sendMessage(message);
    }
}
