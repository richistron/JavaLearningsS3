package animales;

public class Gato extends AnimalBase {

    public Gato(String nombre) {
        super(nombre);
        tipo = "Gato";
        comida = "Ratones";
        ruido = "Miau";
    }
}
