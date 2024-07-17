package Mediator01_ChatGrupo;
public abstract class Usuario {
    protected InterfaceMediator mediator;
    
    public Usuario(InterfaceMediator mediator) {
        this.mediator = mediator;
    }

    public void enviar(String mensaje) {
        mediator.enviar(mensaje, this);
    }

    public abstract void recibir(String mensaje);
}
