package Bridge;
public abstract class ElaborarRopa {
    protected IElaborar implementador;
    String tipo;

    public IElaborar getImplementador() {
        return this.implementador;
    }

    public void setImplementador(IElaborar implementador) {
        this.implementador = implementador;
    }

    public abstract void fabricar();
}
