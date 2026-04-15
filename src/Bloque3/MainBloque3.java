package Bloque3;

import Bloque3.Implementacion.PadronElectoral;
import Bloque3.Implementacion.ConjuntoMora;
import Bloque3.Implementacion.Invitado;

public class MainBloque3 {
    public static void main(String[] args) {
        PadronElectoral padronElectoral = new PadronElectoral();

        String p1 = "Pedro Castillo";
        String p2 = "Martin Garcia";
        String p3 = "Clemente Rodriguez";
        String p4 = "Natalia Arias";

        padronElectoral.Agregar(p1);
        padronElectoral.Agregar(p2);
        padronElectoral.Agregar(p3);
        padronElectoral.Agregar(p4);
        padronElectoral.Agregar(p4); // Intenta votar dos veces

        System.out.println("Alumno agregado");
        System.out.println("Alumno agregado");
        System.out.println("Alumno agregado");
        System.out.println("Alumno agregado");

        System.out.println(padronElectoral.mostrarPadronElectoral());

        // act 2 (fiesta de fin de año)

        
        Invitado i = new Invitado(45984446);
        Integer dni = i.getDni();
        ConjuntoMora c = new ConjuntoMora();
        System.out.println("Ingresa dni " + i.getDni());

        c.InicializarConjunto();
        c.Agregar(dni);

        Invitado i2= new Invitado(77777777);
        Integer dni2 = i2.getDni();
        c.Agregar(dni2);
        System.out.println("Ingresa dni " + i2.getDni());

        Invitado i3 = new Invitado(55555555);
        Integer dni3 = i3.getDni();
        System.out.println("Ingresa dni " + i3.getDni());
        c.Agregar(dni3);

        // que pasa si quiero meter de nuevo a p
        System.out.println("Ingresa de nuevo el dni " + i.getDni());

        c.Agregar(dni);


    }
}
