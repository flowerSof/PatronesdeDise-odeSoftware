package Builder;

public interface ComboBuilder {
    ComboBuilder agregarPapas(String tipo);
    ComboBuilder agregarBebida(String sabor);
    ComboBuilder agregarPizza(String tipo);
    ComboBuilder agregarHamburguesa(String tipo);
    Combo build();
}
