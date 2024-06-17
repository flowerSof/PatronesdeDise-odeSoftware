package Facade05;
import java.util.*;
public class Registro {
    private List<Alumno> alumnos;

    public Registro() {
        this.alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Juan Pérez", 1));
        alumnos.add(new Alumno("María Gómez", 2));
        alumnos.add(new Alumno("Carlos Sánchez", 3));
    }

    public Alumno buscarAlumnoPorId(int id) {
        for (Alumno alumno : alumnos) {
            if (alumno.getId() == id) {
                return alumno;
            }
        }
        return null;
    }

    public void registrarNota(Alumno alumno, double nota) {
        alumno.setNota(nota);
        System.out.println("Nota registrada para el alumno: " + alumno.getNombre());
    }
    
    public List<Alumno> listarAlumnos() {
        return alumnos;
    }
}
