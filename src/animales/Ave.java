package animales;

public class Ave extends Animal {

    // Atributos
    private String envergaduraAlas;

    // Constructor
    public Ave(String nombre, int edad, String envergaduraAlas) {
        super(nombre, edad);
        this.envergaduraAlas = envergaduraAlas;
    }

    // Getter
    public String getEnvergaduraAlas() {
        return envergaduraAlas;
    }

    // ToString
    @Override
    public String toString() {
        return "Ave :" + '\n' +
                "Se llama: " + getNombre() + '\n' +
                "Su edad es: " + getEdad() + '\n' +
                "Envergadura de alas: " + envergaduraAlas + '\n';
    }



}
