public class Main {
    public static void main(String[] args) {
        //Creamos el pan, el medallon y los ingredientes
        Ingrediente cheddar = new Ingrediente("cheddar", 450);
        Ingrediente lechuga = new Ingrediente("lechuga", 300);
        Ingrediente tomate = new Ingrediente("tomate", 250);
        Pan panDeCampo = new Pan("Pan de campo", 2500);
        Medallon medallonDeCarne = new Medallon("Medallon de carne", 800);

        //Creamos la hamburguesa con un medallon, no se pueden crear hamburguesas sin medallon
        Hamburguesa tripleCheddar = new Hamburguesa(panDeCampo, medallonDeCarne);

        //le agregamos 2x cheddar y una lechuga, como tiene mas ingredientes que medallones, no deberia permitir facturar
        tripleCheddar.agregarIngrediente(cheddar);
        tripleCheddar.agregarIngrediente(cheddar);
        tripleCheddar.agregarIngrediente(lechuga);

        if (tripleCheddar.puedeFacturar()){
            System.out.println("Puede facturar");
        }else System.out.println("No puede facturar");
        System.out.println(tripleCheddar.mostrarHamburguesa());

        tripleCheddar.agregarMedallon(medallonDeCarne);
        tripleCheddar.agregarMedallon(medallonDeCarne);

        if (tripleCheddar.puedeFacturar()){
            System.out.println("Puede facturar");
            System.out.println(tripleCheddar.precioTotal());
        }else System.out.println("No puede facturar");
        System.out.println(tripleCheddar.mostrarHamburguesa());


        tripleCheddar.sacarMedallon(medallonDeCarne);
        tripleCheddar.sacarMedallon(medallonDeCarne);
        tripleCheddar.sacarMedallon(medallonDeCarne);
        tripleCheddar.sacarIngrediente(tomate);
    }
}