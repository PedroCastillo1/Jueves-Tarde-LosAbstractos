package Bloque3;
import Bloque3.Implementacion.GuardiaDeHospital;
import Bloque3.Interface.ColaPrioridadTDA;


public class MainBloque3 {
    public static void main(String[] args) {
        ColaPrioridadTDA<Integer> cola = new GuardiaDeHospital(); //si no agrego integer no me va a dejar poder implementar infopaciente.nombrePaciente(cola.Primero())
        GuardiaDeHospital infopaciente = new GuardiaDeHospital();

        cola.InicializarColaPrioridad();

        cola.AcolarPrioridad(20,10);
        cola.AcolarPrioridad(60,30);
        cola.AcolarPrioridad(40,20);


        System.out.println("Primer turno "+ infopaciente.nombrePaciente(cola.Primero()) + " numero de turno:" + cola.Primero() );

        cola.Desacolar();

        System.out.println("Segundo turno "+ infopaciente.nombrePaciente(cola.Primero()) + " numero de turno:" + cola.Primero() );

        cola.Desacolar();

        System.out.println("Tercer turno "+ infopaciente.nombrePaciente(cola.Primero()) + " numero de turno:" + cola.Primero() );
    }
}
