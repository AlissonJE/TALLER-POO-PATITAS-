import java.util.ArrayList;

// Nombre: Alisson Paola Jaramillo Echeverry / Ficha: 3292136
 
public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<Animal>();
        animales.add(new Perro("Firulais", 3, "Criollo"));
        animales.add(new Gato("Michi", 2, true));
      
 
        for (Animal a : animales) {
            a.mostrarInfo();
            System.out.println(a.getNombre() + " dice: " + a.sonido());
        }
    }
}

// ¿Donde se aplica cada pliar?
// 1. Encapsulamiento: en Animal, nombre y edad son private. El nombre es final y no tiene setNombre, así que no se puede cambiar. setEdad solo acepta edades mayores o iguales a 0.
// 2. Herencia: Perro y Gato usan extends Animal y super(...), así que no repiten nombre ni edad. Solo agregan raza e interior.
// 3. Polimorfismo: guardo Perro y Gato en una sola lista de Animal y la recorro con un solo for. Cada objeto responde con su propio mostrarInfo() y sonido().
// 4. Abstracción: Animal es abstract, por eso new Animal(...) no compila. Sus métodos abstractos obligan a cada hija a definir su sonido.