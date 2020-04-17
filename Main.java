
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        inmobiliaria casa1 = new inmobiliaria("calle 8 # 45-21", "apartamento", 5000000, "arrendada");
        inmobiliaria casa2 = new inmobiliaria("carrera 35 # 28-56", "casa", 350000, "vendida");
        inmobiliaria casa3 = new inmobiliaria("calle 15 # 86-53", "apartamento", 2000000, "arrendada");

        arrendatario persona1 = new arrendatario("juan", 589222041, casa1);
        arrendatario persona2 = new arrendatario("pedro", 10081576, casa2);
        arrendatario persona3 = new arrendatario("marcos", 458497524, casa3);

        propietario p1 = new propietario("martin", "arrendada", "3 meses", "3 años", casa1);
        propietario p2 = new propietario("david", "vendida", "9 meses", "1 año", casa2);
        propietario p3 = new propietario("andres", "arrendada", "4 meses", " 6 años", casa3);

        ArrayList<arrendatario> compradores = new ArrayList<>();

        compradores.add(persona1);
        compradores.add(persona2);
                compradores.add(persona3);

        ArrayList<propietario> vendedor = new ArrayList<>();

        vendedor.add(p1);
        vendedor.add(p2);
        vendedor.add(p3);


        try {

            persona1.validar(persona1.getCasa().getValor());


        } catch (

                excepcion ex) {
            System.out.println("Invalid Operation Exception");
            System.out.println(ex.getMessage());
        } catch (NullPointerException ex) {
            System.out.println("Null Pointer Exception");
        }

        System.out.println(" ");




	System.out.println("incio de los compradores ");

    	System.out.println(" ");

		System.out.println(" ");

		for (arrendatario arrend : compradores) {

        System.out.println("nombre: " + arrend.getNombre() + " , " + "identificacion: " + arrend.getIdentificacion() + " , " +
                 " direccion,tipo,valor y estado de la casa: " + " , " + arrend.getCasa().getDireccion() + " , "
                + arrend.getCasa().getTipo() + " , " + arrend.getCasa().getValor() + ","+ arrend.getCasa().getSituacion());





    for ( propietario prop : vendedor) {

        System.out.println("nombre: " + prop.getNombre() + " , " + "situacion de la casa: " + prop.getSituacioncasa() + " , " + "tiempo de espera: "
                + prop.getEspera() + " , " + "Tiempo que lleva trabajando: " + prop.getTiempotrabajo()+ " , "
                + "direccion,tipo,valor y estado de la casa: " + " , " + arrend.getCasa().getDireccion() + " , "
                + arrend.getCasa().getTipo() + " , " + arrend.getCasa().getValor() + ","+ arrend.getCasa().getSituacion());

    }

}
    }
    }