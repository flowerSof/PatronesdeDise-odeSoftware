package Facade05;

public class Notificador {
    public void notificar(Alumno alumno) {
        System.out.println("Notificando al alumno " + alumno.getNombre() + " sobre su nueva nota: " + alumno.getNota());
    }
}
