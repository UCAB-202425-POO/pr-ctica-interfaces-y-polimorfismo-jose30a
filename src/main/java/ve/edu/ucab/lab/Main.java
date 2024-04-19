package ve.edu.ucab.lab;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Crear array donde se añadiran los productos alimenticios (EsAlimento)
        ArrayAlimenticios alimenticios = new ArrayAlimenticios();

        //Crear 2 cereal, 1 vino y 1 detergente
        Cereal zucaritas = new Cereal("Kellogs",35,"trigo");
        Cereal sugarPops = new Cereal("Kellogs",20,"maiz");
        Vino tinto = new Vino("Gato Negro",50,"merlot", 11);
        Detergente nose = new Detergente("Ariel",25);
        //Las demas caracteristicas provenientes de las interfaces se tienen que añadir con sus respectivos setters


        //Agregar productos con interfaz "EsAlimento" al array de productos alimenticios
        alimenticios.agregarAlimento(zucaritas);
        alimenticios.agregarAlimento(tinto);
        alimenticios.agregarAlimento(sugarPops);

        //Mostrar total de calorias entre todos los productos alimenticios
        System.out.println("El total de calorias es: "+alimenticios.calcularCalorias());

        //Se ajusta el descuento, volumen, tipo de envase y caducidad a un producto de tipo vino y se imprime su informacion
        tinto.setDescuento(12.5);
        tinto.setVolumen(700);
        tinto.setTipoEnvase("tipo 1");
        LocalDate localDate = LocalDate.now();
        tinto.setCaducidad(localDate.plusDays(90));
        System.out.println(tinto);

        //Se imprimen los otros productos
        System.out.println(zucaritas);
        System.out.println(nose);
    }
}
