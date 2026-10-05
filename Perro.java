class Perro extends Animal {
    private final String raza;
 
    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }
 
    @Override
    public void mostrarInfo() {
        System.out.println(infoBase() + " | Raza: " + raza);
    }
 
    @Override
    public String sonido() {
        return "¡Guau!";
    }
}