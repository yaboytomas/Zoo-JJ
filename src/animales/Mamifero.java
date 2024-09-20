package animales;

public class Mamifero  extends Animal{

    // Atributos
    private String tipoPelo;

    //Constructor
    public Mamifero(String nombre, int edad, String tipoPelo) {
        super(nombre, edad);
        this.tipoPelo = tipoPelo;
    }

    //Getter
    public String getTipoPelo() {
        return tipoPelo;
    }

    //ToString


    @Override
    public String toString() {
        return "Mamifero :" + '\n' +
                "Se llama: " + getNombre() + '\n' +
                "Su edad es: "+ getEdad() + '\n' +
                "Tipo de pelo: " + tipoPelo + '\n';
    }
}
