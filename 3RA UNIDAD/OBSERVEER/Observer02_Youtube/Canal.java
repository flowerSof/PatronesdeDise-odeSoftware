package Observer02_Youtube;
import java.util.ArrayList;
import java.util.List;
public class Canal {
    private List<Observer> subscribers = new ArrayList<>();
    private String latestVideo;

    public void subscribe(Observer subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Observer subscriber) {
        subscribers.remove(subscriber);
    }

    public void uploadVideo(String video) {
        this.latestVideo = video;
        notifySubscribers();
    }

    private void notifySubscribers() {
        for (Observer subscriber : subscribers) {
            subscriber.update(latestVideo);
        }
    }
}
