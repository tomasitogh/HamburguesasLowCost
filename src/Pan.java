public class Pan {

    private String nombre;
    private int precio;

    public Pan(String nombre, int precio) {
        this.nombre = "panDeCampo";
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
