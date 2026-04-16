package copiarPilaEstaticaADinamica;

import Bloque1.PilaTDA;

public class MainPilasDinamicas {
    public static void main(String[] args) {

        PilaTDA<Integer> pilaEstatica = new Apilar1();
        PilaTDA<Integer> pilaAux = new Apilar1();
        PilaTDA<Integer> pilaDinamica = new PilaDinamica();

        //Inicializamos
        pilaEstatica.InicializarPila();
        pilaAux.InicializarPila();
        pilaDinamica.InicializarPila();

        // Cargar pila estática con 10 elementos
        for (int i = 1; i <= 10; i++) {
            pilaEstatica.Apilar(i);
        }

        System.out.println("Pila estática cargada");

        // Pasar a pila auxiliar (se invierte)
        while (!pilaEstatica.PilaVacia()) {
            Integer elem = pilaEstatica.Tope();
            pilaAux.Apilar(elem);
            pilaEstatica.Desapilar();
        }

        System.out.println("Pasada a pila auxiliar");

        // Pasar a pila dinámica (se vuelve a invertir)
        while (!pilaAux.PilaVacia()) {
            Integer elem = pilaAux.Tope();
            pilaDinamica.Apilar(elem);
            pilaAux.Desapilar();
        }

        System.out.println("Pila auxiliar desapilada en pila Dinamica!!!!!");

        // Mostrar resultado final
        System.out.println("Contenido de la pila dinámica:");

        while (!pilaDinamica.PilaVacia()) {
            System.out.print(pilaDinamica.Tope()+"-");
            pilaDinamica.Desapilar();
        }
    }
}