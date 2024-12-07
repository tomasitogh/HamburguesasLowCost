import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Hamburguesa {

    private final Pan pan;
    private List<Medallon> medallones = new ArrayList<>();
    private List<Ingrediente> ingredientes = new ArrayList<>();


    public Hamburguesa(Pan pan, Medallon medallon) {
        this.pan = pan;
        this.medallones.add(medallon);
    }


    public void agregarIngrediente(Ingrediente ingrediente){
        this.ingredientes.add(ingrediente);
    }

    public void sacarIngrediente(Ingrediente ingrediente){
        if (this.ingredientes.contains(ingrediente)) {
            this.ingredientes.remove(ingrediente);
        }else System.out.println("La hamburguesa no contiene "+ingrediente);
    }

    public void agregarMedallon(Medallon medallon){
        this.medallones.add(medallon);
    }
    public void sacarMedallon(Medallon medallon){
        if (this.medallones.contains(medallon)){
            if(this.medallones.size() > 1){
                this.medallones.remove(medallon);
            }else System.out.println("No se pueden tener 0 medallones");
        }else System.out.println("La hamburguesa no contiene "+medallon);
    }

    public boolean puedeFacturar(){
        return (this.ingredientes.size() <= this.medallones.size());
    }

    public int precioTotal(){
        int preciototal = 0;
        for (Ingrediente i : ingredientes){
            preciototal += i.getPrecio();
        }
        for (Medallon m : medallones){
            preciototal += m.getPrecio();
        }
        preciototal += pan.getPrecio();

        return preciototal;
    }

    public String mostrarHamburguesa(){
        return "Hamburguesa{" +
                "pan=" + pan +
                ", medallones=" + medallones +
                ", ingredientes=" + ingredientes +
                '}';
    }

}
