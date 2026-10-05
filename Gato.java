class Gato extends Animal {
    private final boolean interior;
 
    public Gato(String nombre, int edad, boolean interior) {
        super(nombre, edad);
        this.interior = interior;
    }
 
    @Override
    public void mostrarInfo() {
        String texto = "no";
        if (interior) {
            texto = "sí";
        }
        System.out.println(infoBase() + " | Interior: " + texto);
    }
 
    @Override
    public String sonido() {
        return "¡Miau!";
    }
}