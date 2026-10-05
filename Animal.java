abstract class Animal{
    private final String nombre;
    private int edad;

    public Animal(String nombre, int edad){
        this.nombre = nombre;
        setEdad(edad);
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }


    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
    }

    public String infoBase() {
        return "Nombre: " + nombre + " | Edad: " + edad;
    }

    public abstract void mostrarInfo();
 
    public abstract String sonido();
}