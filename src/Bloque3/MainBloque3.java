package Bloque3;
import Bloque3.Implementacion.GuardiaDeHospital;
import Bloque3.Interface.ColaPrioridadTDA;
import Bloque3.Interface.Cola;
import Bloque3.Interface.ColaPrioridad;
import Bloque3.Implementacion.BuffetFacu;


public class MainBloque3 {
    public static void main(String[] args) {
        ColaPrioridadTDA<Integer> cola = new GuardiaDeHospital(); //si no agrego integer no me va a dejar poder implementar infopaciente.nombrePaciente(cola.Primero())
        GuardiaDeHospital infopaciente = new GuardiaDeHospital();

        cola.InicializarColaPrioridad();

        cola.AcolarPrioridad(20,10);
        cola.AcolarPrioridad(60,30);
        cola.AcolarPrioridad(40,20);

        System.out.println("*************Guardia de Hospital**************");

        System.out.println("Primer turno "+ infopaciente.nombrePaciente(cola.Primero()) + " numero de turno:" + cola.Primero() );

        cola.Desacolar();

        System.out.println("Segundo turno "+ infopaciente.nombrePaciente(cola.Primero()) + " numero de turno:" + cola.Primero() );

        cola.Desacolar();

        System.out.println("Tercer turno "+ infopaciente.nombrePaciente(cola.Primero()) + " numero de turno:" + cola.Primero() );

        BuffetFacu bufet = new BuffetFacu();
        bufet.InicializarCola();

        System.out.println("*************Buffet de la Facultad**************");
        System.out.println("Llega una persona a la fila!!");
        bufet.Acolar(1);
        System.out.println("Persona 1 se pone en la fila");
        System.out.println("Llega una persona a la fila!!");
        bufet.Acolar(2);
        System.out.println("Persona 2 se pone en la fila");
        System.out.println("Llega una persona a la fila!!");
        bufet.Acolar(3);
        System.out.println("Persona 3 se pone en la fila");
        //se atiende al primero que llego
        System.out.println("Se atiende a la persona: " + bufet.Primero());
        bufet.Desacolar();
        System.out.println("Se atiende a la persona: " + bufet.Primero());
        bufet.Desacolar();
        System.out.println("Se atiende a la persona: " + bufet.Primero());
        bufet.Desacolar();
        if (bufet.ColaVacia()){
            System.out.println("no hay mas gente en la fila");
        }

    }
}
