import animales.IAnimal;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArcaDeNoe arcaNoe = new ArcaDeNoe();
        List<IAnimal> animales = arcaNoe.getAnimales();
        animales.forEach(animal -> {
            System.out.printf("el animal %s se llama %s\n", animal.getTipo(), animal.getNombre());
            System.out.printf("el animal %s hace %s\n", animal.getTipo(), animal.getRuido());
            System.out.printf("el animal %s come %s\n", animal.getTipo(), animal.getComida());
        });
    }
}