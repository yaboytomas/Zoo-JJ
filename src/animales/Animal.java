package animales;

public abstract class Animal {

    // Atributos
    private String nombre;
    private int edad;

    //Constructor
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getter
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

}
