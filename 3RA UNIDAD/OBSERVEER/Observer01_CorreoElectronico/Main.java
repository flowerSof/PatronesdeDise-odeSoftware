package Observer01_CorreoElectronico;

public class Main {

    public static void main(String[] args) {
        Email emailServer = new Email();

        Observer subscriber1 = new EmailSuscrito("user1@example.com");
        Observer subscriber2 = new EmailSuscrito("user2@example.com");

        emailServer.subscribe(subscriber1);
        emailServer.subscribe(subscriber2);

        emailServer.notifyNewEmail("holAAAAAAAAAAAAAAAAA");

        emailServer.unsubscribe(subscriber1);

        emailServer.notifyNewEmail("Noti: como estas?");
    }
    
}
