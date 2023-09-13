package animales;

public class Perro extends AnimalBase {
    public Perro(String nombre) {
        super(nombre);
        tipo = "Perro";
        comida = "Croquetas";
        ruido = "Guau guau";
    }
}
