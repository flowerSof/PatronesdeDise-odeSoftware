package Observer01_CorreoElectronico;
public class EmailSuscrito implements Observer {
    private String emailAddress;

    public EmailSuscrito(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void update(String email) {
        System.out.println("Nuevo correo para " + emailAddress + ": " + email);
    }
}
