package Observer02_Youtube;
public class Main {

    public static void main(String[] args) {
        Canal channel = new Canal();

        Observer subscriber1 = new CanalSuscrito("JohnDoe");
        Observer subscriber2 = new CanalSuscrito("JaneSmith");

        channel.subscribe(subscriber1);
        channel.subscribe(subscriber2);

        channel.uploadVideo("Introduccion al diseño de patrones");

        channel.unsubscribe(subscriber1);

        channel.uploadVideo("tutorial de instalar mods en minecraft");
    }
    
}
