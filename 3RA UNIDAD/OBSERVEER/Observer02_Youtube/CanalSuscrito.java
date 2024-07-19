package Observer02_Youtube;
public class CanalSuscrito implements Observer {
    private String username;

    public CanalSuscrito(String username) {
        this.username = username;
    }

    @Override
    public void update(String video) {
        System.out.println(username + " notificacion de video: " + video);
    }
}
