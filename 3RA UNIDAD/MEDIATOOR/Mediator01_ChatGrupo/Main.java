package Mediator01_ChatGrupo;
public class Main {
    public static void main(String[] args) {
        ChatGrupal chatRoom = new ChatGrupal();

        Usuario usuario1 = new UsuarioConcreto(chatRoom);
        Usuario usuario2 = new UsuarioConcreto(chatRoom);

        chatRoom.agregarUsuario(usuario1);
        chatRoom.agregarUsuario(usuario2);

        usuario1.enviar("¡Hola a todos!");
    }
    
}
