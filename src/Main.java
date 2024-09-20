import animales.Animal;
import animales.Mamifero;

public class Main {
    public static void main(String[] args) {


    //Instancias
    Animal mamifero = new Mamifero("Perro", 5, "Corto");
    Animal ave = new animales.Ave("Aguila", 3, "Grande");
    Animal reptil = new animales.Reptil("Iguana", 2, "Escamosa");

    //Mostrar
    System.out.println("");
    System.out.println("                  Bienvenido al Zoo                 ");
    System.out.println("----------------------------------------------------");
    System.out.println("Los tipos de animales del Zoo y su informacion son: ");
    System.out.println("----------------------------------------------------");
    System.out.println(mamifero);
    System.out.println(ave);
    System.out.println(reptil);
    System.out.println("----------------------------------------------------");














    }
}