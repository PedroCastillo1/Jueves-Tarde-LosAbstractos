package Bloque4;

import Bloque4.Implementacion.DiccionarioMora;

public class MainBloque4 {
    public static void main(String[] args){
    System.out.println("******** TORNEO E-SPORTS ********");

    DiccionarioMora d = new DiccionarioMora();
        d.InicializarDiccionario();

    // agrego jugadores con su puntaje máximo
        d.Agregar("Mora", 1200);
        d.Agregar("Luz", 950);
        d.Agregar("Juan", 800);

    // muestro puntajes
        System.out.println("Puntaje de Mora: " + d.Obtener("Mora"));
        System.out.println("Puntaje de Luz: " + d.Obtener("Luz"));

    // 🔥 actualizar puntaje (clave repetida)
        d.Agregar("Mora", 1500);

        System.out.println("Nuevo puntaje de Mora: " + d.Obtener("Mora"));

    // verificar existencia
        if (d.Pertenece("Juan")) {
        System.out.println("Juan está en el torneo");
    }
}

}
