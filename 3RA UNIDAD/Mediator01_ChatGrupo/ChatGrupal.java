package Mediator01_ChatGrupo;

import java.util.ArrayList;

public class ChatGrupal implements InterfaceMediator {
    private ArrayList<Usuario> usuarios;

    public ChatGrupal() {
        this.usuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    @Override
    public void enviar(String mensaje, Usuario emisor) {
        for (Usuario usuario : usuarios) {
            if (usuario != emisor) {
                usuario.recibir(mensaje);
            }
        }
    }
}
