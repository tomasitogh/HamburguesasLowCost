public class Ingrediente {
    private  String nombre;
    private  int precio;

    public Ingrediente(String nombre, int precio) {
        this.nombre = nombre;
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
