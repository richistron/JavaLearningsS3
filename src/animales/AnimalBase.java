package animales;

public class AnimalBase implements IAnimal {
    private String especie;
    protected String comida;
    private String nombre;
    protected String tipo;
    protected String ruido;

    public AnimalBase(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRuido() {
        return ruido;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }
}
