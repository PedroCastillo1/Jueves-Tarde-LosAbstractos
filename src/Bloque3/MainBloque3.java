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
    }
}
