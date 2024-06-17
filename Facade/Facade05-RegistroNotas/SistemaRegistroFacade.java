package Facade05;
import java.util.*;

public class SistemaRegistroFacade {
    private Registro registro;
    private Autenticacion autenticacion;
    private Notificador notificador;

    public SistemaRegistroFacade() {
        this.registro = new Registro();
        this.autenticacion = new Autenticacion();
        this.notificador = new Notificador();
    }

    public boolean autenticarProfesor(String usuario, String contraseña) {
        return autenticacion.autenticar(usuario, contraseña);
    }

    public void registrarNota(int idAlumno, double nota) {
        Alumno alumno = registro.buscarAlumnoPorId(idAlumno);
        if (alumno != null) {
            registro.registrarNota(alumno, nota);
            notificador.notificar(alumno);
        } else {
            System.out.println("Alumno no encontrado.");
        }
    }
    
    public List<Alumno> obtenerListaAlumnos() {
        return registro.listarAlumnos();
    }
}
