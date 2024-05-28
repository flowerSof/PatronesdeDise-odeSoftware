package Composite;
public class Ejecutor {
    public static void main(String[] args) {
        Padre ancestro = new Padre("Ancestro");
        
        ancestro.agregarHijo( new Hijo("Hijo 1"));
        ancestro.agregarHijo( new Hijo("Hijo 2"));
        ancestro.agregarHijo( new Hijo("Hijo 3"));
        
        Padre Hijocasado1 = new Padre("hijo casado 1");
        Hijocasado1.agregarHijo(new Hijo("Hijo 4"));
        Hijocasado1.agregarHijo(new Hijo("Hijo 5"));
        Hijocasado1.agregarHijo(new Hijo("Hijo 6"));
        
        ancestro.agregarHijo(Hijocasado1);
        
        ancestro.mostrar();
    }
    
}
