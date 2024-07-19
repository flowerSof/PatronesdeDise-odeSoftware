package Mediator01_ChatGrupo;
public class UsuarioConcreto extends Usuario {
    public UsuarioConcreto(InterfaceMediator mediator) {
        super(mediator);
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println("UsuarioConcreto1 recibió: " + mensaje);
    }
}
