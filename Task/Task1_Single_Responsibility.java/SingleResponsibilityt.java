public class SingleResponsibilityt {
    public static void main(String[] args) {
       User user1 = new User();
      EmailService email1 = new EmailService();
    
        user1.login("Alom", "Password");
        email1.sendEmail("Kishan "," SADP ", " Null");
     }   
}
