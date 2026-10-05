public class Vaca extends Animal {
    public Vaca(String nombre, int edad) {
        super(nombre, edad);
    }
 
    @Override
    public void mostrarInfo() {
        System.out.println(infoBase());
    }
 
    @Override
    public String sonido() {
        return "¡Muuu!";
    }
}