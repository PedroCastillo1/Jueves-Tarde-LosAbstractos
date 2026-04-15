package Bloque2;
import Bloque2.Implementacion.DistribuidorDeTicketsIt;
import Bloque2.Implementacion.FilaDelCajero;
import Bloque2.Implementacion.GuardiaDeHospital;
import Bloque2.Interface.ColaPrioridadTDA;
import Bloque2.Implementacion.BuffetFacu;


public class MainBloque2 {
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
        /* Ejercicio de fila del cajero */
        System.out.println("*************Fila Del Cajero**************");
        FilaDelCajero fc = new FilaDelCajero();

        fc.AcolarPrioridad("Embarazada",9);
        fc.AcolarPrioridad("Viejo",7);
        fc.AcolarPrioridad("Joven",1);

        System.out.println(fc.Primero());
        System.out.println("Su prioridad es: " + fc.Prioridad());
        fc.AcolarPrioridad("Muy Viejo",10);
        //Acolamos alguien con prioridad distinta para ver si se pone primero
        System.out.println(fc.Primero());
        System.out.println("Su prioridad es: " + fc.Prioridad());
        System.out.println(fc.FilaActual());

        /* Ejercicio de Distribuidora De Tickets IT */

        System.out.println("*************Distribuidora de Tickets IT**************");
        DistribuidorDeTicketsIt dist = new DistribuidorDeTicketsIt();

        dist.AcolarPrioridad("Se me apaga la compu sola", 350);
        dist.AcolarPrioridad("No puedo iniciar sesion", 120);
        dist.AcolarPrioridad("El junior dropeo la Base de Datos", 1000);
        dist.AcolarPrioridad("Se cayo el servidor", 20000);
        // el ultimo no se acola ya que la prioridad esta fuera de rango
        System.out.println(dist.Primero());
        System.out.println(dist.PrioridadDeTicket());
        dist.Desacolar();
        System.out.println(dist.Primero());
        System.out.println(dist.PrioridadDeTicket());
        dist.Desacolar();
        System.out.println(dist.Primero());
        System.out.println(dist.PrioridadDeTicket());
    }
}
