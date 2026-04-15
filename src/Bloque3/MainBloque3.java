package Bloque3;

import Bloque3.Implementacion.PadronElectoral;

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

        
        Persona p = new Persona(45984446);
        Integer dni = p.getDni();
        ConjuntoMora c = new ConjuntoMora();
        System.out.println("Ingresa dni " + p.getDni());

        c.InicializarConjunto();
        c.Agregar(dni);

        Persona p2= new Persona(77777777);
        Integer dni2 = p2.getDni();
        c.Agregar(dni2);
        System.out.println("Ingresa dni " + p2.getDni());

        Persona p3 = new Persona(55555555);
        Integer dni3 = p3.getDni();
        System.out.println("Ingresa dni " + p3.getDni());
        c.Agregar(dni3);

        // que pasa si quiero meter de nuevo a p
        System.out.println("Ingresa de nuevo el dni " + p.getDni());

        c.Agregar(dni);


    }
}
