package Facade03_Computador;
public class Facade {
    private CPU cpu;
    private Memoria memoria;
    private DiscoDuro discoDuro;

    public Facade() {
        this.cpu = new CPU();
        this.memoria = new Memoria();
        this.discoDuro = new DiscoDuro();
    }

    public void encender() {
        System.out.println("Encendiendo PC ");
        cpu.encender();
        System.out.println("Testeando Memoria ");
        memoria.cargar();
        System.out.println("Testeando Disco duro ");
        discoDuro.leer();
    }
}
