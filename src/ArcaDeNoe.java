import animales.Gato;
import animales.IAnimal;
import animales.Perro;
import animales.Vaca;

import java.util.ArrayList;
import java.util.List;

public class ArcaDeNoe {
    private final List<IAnimal> animales = new ArrayList<>();

    public ArcaDeNoe() {
        animales.add(new Vaca("Carova"));
        animales.add(new Gato("Felix"));
        Gato gatoVegano = new Gato("Michi");
        gatoVegano.setComida("Ensalada cesar");
        animales.add(gatoVegano);
        animales.add(new Perro("Milaneso"));
    }

    public List<IAnimal> getAnimales() {
        return animales;
    }
}
