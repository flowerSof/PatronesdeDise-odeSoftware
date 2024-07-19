package Observer01_CorreoElectronico;
import java.util.ArrayList;
import java.util.List;
public class Email {
    private List<Observer> subscribers = new ArrayList<>();
    private String latestEmail;

    public void subscribe(Observer subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Observer subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifyNewEmail(String email) {
        this.latestEmail = email;
        notifySubscribers();
    }

    private void notifySubscribers() {
        for (Observer subscriber : subscribers) {
            subscriber.update(latestEmail);
        }
    }
}
