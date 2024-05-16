package Builder;
public class Cocinero {
    
    public ComboBuilder getBuilder(String tipoCombo) {
        Combo combo = new Combo();
        if (tipoCombo.equalsIgnoreCase("Infantil")) {
            combo.setPedido(new ComboInfantil());
        }
        return combo;
    } 
}
