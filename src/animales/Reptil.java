package animales;

public class Reptil extends Animal{

    // Atributos
    private String tipoPiel;

    //Constructor
    public Reptil(String nombre, int edad, String tipoPiel) {
        super(nombre, edad);
        this.tipoPiel = tipoPiel;
    }

    // Getter
    public String getTipoPiel() {
        return tipoPiel;
    }

    //ToString
    @Override
    public String toString() {
        return "Reptil :" + '\n' +
                "Se llama: " + getNombre() + '\n' +
                "Su edad es: "+ getEdad() + '\n' +
                "Tipo de piel: " + tipoPiel;
    }

}
