public class Medallon {
    private String nombre;
    private int precio;

    public Medallon( String nombre,int precio) {
        this.precio = precio;
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
