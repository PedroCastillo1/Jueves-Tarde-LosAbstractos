import Implementacion.ColaPrioridad;
import Implementacion.Persona;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//
void main() {

    // Primero suben pasajeros con movilidad reducida (prioridad 3), luego Business (Prioridad 2 ) y al final los mortales
    //(Prioridad 1)
    // que pasa si llegan dos personas con la misma prioridad
    //
    //
    IO.println("*******************************Ejercicio Embarque de aerolineas**********************");

    ColaPrioridad c = new ColaPrioridad();
    System.out.println (" el primero es : " + c.Primero() + " el de mayor prioridad es " + c.Prioridad() );
    c.InicializarColaPrioridad();

    IO.println("ingresa un mortal");
    Persona p = new Persona(1, 45984446);
    c.AcolarPrioridad(45984446, 1);

    System.out.println (" el primero es : " + c.Primero() + " el de mayor prioridad es " + c.Prioridad() );


    IO.println("ingresa lalguien con prioridad 3");
    Persona p1 = new Persona(3, 55555555);
    c.AcolarPrioridad(55555555, 3);


    System.out.println(" ingresa una persona con la mayor prioridad, por ende pasa a estar adelante de todo. ");
    int[] lista50 = c.MostrarLista();
    System.out.println(" la fila es " + Arrays.toString(lista50));
    System.out.println (" el primero es : " + c.Primero() + " el de mayor prioridad es " + c.Prioridad() );

    IO.println("ingresa alguien con prioridad 2");
    Persona p2 = new Persona(2, 34343434);
    c.AcolarPrioridad(34343434, 2);
    System.out.println (" el primero es : " + c.Primero() + " el de mayor prioridad es " + c.Prioridad() );

    IO.println("ingresa otro mortal");
    Persona p3 = new Persona(1, 56565656);
    c.AcolarPrioridad(56565656, 1);

    System.out.println("La cola ahora esta ordenada por prioridad pero tambien por orden de llegada.");
    int[] lista80 = c.MostrarLista();
    System.out.println(" la fila es " + Arrays.toString(lista80));

    System.out.println (" el primero es : " + c.Primero() + " el de mayor prioridad es " + c.Prioridad() );

    IO.println("ingresa otro con prioridad 3. La mayor prioridad ahora se filtra por llegada. El sistema tiene ");
    IO.println("prioridades[i] < prioridad. Por ende, si tienen igual prioridad el ciclo se detiene.");
    System.out.println(" Queda detras de quien llego primero con igual prioridad.");
    Persona p4 = new Persona(3, 78787878);
    c.AcolarPrioridad(78787878, 3);
    System.out.println (" el primero es : " + c.Primero() + " el de mayor prioridad es " + c.Prioridad() );
    int[] lista90 = c.MostrarLista();
    System.out.println(" la fila es " + Arrays.toString(lista90));

    IO.println("ingresa otra persona con la misma prioridad que la anterior");
    IO.println("llega una persona con misma prioridad que la anterior: ");
    Persona p5 = new Persona(3, 98989898);
    c.AcolarPrioridad(98989898, 3);
    System.out.println (" el primero es : " + c.Primero() + " el de mayor prioridad es " + c.Prioridad() );

    int[] lista = c.MostrarLista();
    System.out.println(" la fila es " + Arrays.toString(lista));

    IO.println("ingresa lalguien con prioridad 3");
    Persona p80 = new Persona(3, 11111111);
    c.AcolarPrioridad(11111111, 3);
    System.out.println (" prioridad 3 -> el primero es : " + c.Primero() + " el de mayor prioridad es " + c.Prioridad() );

    IO.println("ingresa alguien con prioridad 2");
    Persona p81 = new Persona(2, 22222222);
    c.AcolarPrioridad(22222222, 2);
    System.out.println (" prioridad 2 -> el primero es : " + c.Primero() + " el de mayor prioridad es " + c.Prioridad() );

    IO.println("ingresa otro mortal");
    Persona p6 = new Persona(1, 33333333);
    c.AcolarPrioridad(33333333, 1);
    System.out.println (" ingresa otro mortal -> el primero es : " + c.Primero() + " el de mayor prioridad es " + c.Prioridad() );

    IO.println("ingresa lalguien con prioridad 3");
    Persona p7 = new Persona(3, 44444444);
    c.AcolarPrioridad(44444444, 3);
    System.out.println (" prioridad 3 -> el primero es : " + c.Primero() + " el de mayor prioridad es " + c.Prioridad() );

    IO.println("ingresa alguien con prioridad 2");
    Persona p8 = new Persona(2, 55555556);
    c.AcolarPrioridad(55555556, 2);
    System.out.println (" prioridad 2 -> el primero es : " + c.Primero() + " el de mayor prioridad es " + c.Prioridad() );

    IO.println("ingresa otro mortal");
    Persona p9 = new Persona(1, 66666666);
    c.AcolarPrioridad(66666666, 1);
    System.out.println (" ingresa otro mortal -> el primero es : " + c.Primero() + " el de mayor prioridad es " + c.Prioridad() );

    IO.println("ingresa alguien con prioridad 2");
    Persona p20 = new Persona(2, 89898989);
    c.AcolarPrioridad(89898989, 2);
    System.out.println (" prioridad 2 -> el primero es : " + c.Primero() + " el de mayor prioridad es " + c.Prioridad() );

    IO.println("ingresa otro mortal");
    Persona p21 = new Persona(1, 90909090);
    c.AcolarPrioridad(90909090, 1);
    System.out.println (" ingresa otro mortal -> el primero es : " + c.Primero() + " el de mayor prioridad es " + c.Prioridad() );

    IO.println("ingresa lalguien con prioridad 3");
    Persona p22 = new Persona(3, 10101010);
    c.AcolarPrioridad(10101010, 3);
    System.out.println (" prioridad 3 -> el primero es : " + c.Primero() + " el de mayor prioridad es " + c.Prioridad() );

    IO.println("ingresa alguien con prioridad 2");
    Persona p23 = new Persona(2, 20202020);
    c.AcolarPrioridad(20202020, 2);
    System.out.println (" prioridad 2 -> el primero es : " + c.Primero() + " el de mayor prioridad es " + c.Prioridad() );


    int[] lista3 = c.MostrarLista();
    System.out.println(" la fila es " + Arrays.toString(lista3));
}