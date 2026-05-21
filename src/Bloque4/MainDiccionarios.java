package Bloque4;

import Bloque4.Interface.DiccionarioMultipleTDA;
import Bloque4.Interface.DiccionarioSimpleTDA;
import Bloque4.Implementacion.Dns;
import Bloque4.Implementacion.TraductorDeIdiomas;

public class MainDiccionarios {
    public static void main(String[] args) {

        // DiccionarioMultiple
        DiccionarioMultipleTDA d = new TraductorDeIdiomas();
        d.InicializarDiccionario();

        d.Agregar(5, 2);
        d.Agregar(5, 8);
        d.Agregar(7, 9);
        d.Agregar(7, 1);
        d.Agregar(7, 9); // no se repite

        System.out.println("Claves del diccionario:");
        int[] claves1 = d.Claves();
        for (int i = 0; i < claves1.length; i++) {
            System.out.println(claves1[i]);
        }

        System.out.println("Valores de la clave 7:");
        int[] valores7 = d.Recuperar(7);
        for (int i = 0; i < valores7.length; i++) {
            System.out.println(valores7[i]);
        }

        d.EliminarValor(7, 1);

        System.out.println("Valores de la clave 7 luego de eliminar el valor 1:");
        int[] valores7b = d.Recuperar(7);
        for (int i = 0; i < valores7b.length; i++) {
            System.out.println(valores7b[i]);
        }

        d.Eliminar(7);

        System.out.println("Claves luego de eliminar la clave 7:");
        int[] claves2 = d.Claves();
        for (int i = 0; i < claves2.length; i++) {
            System.out.println(claves2[i]);
        }

        // Diccionario SIMPLE
        DiccionarioSimpleTDA d2 = new Dns();
        d2.InicializarDiccionario();

        d2.Agregar(1, 100);
        d2.Agregar(2, 200);
        d2.Agregar(3, 300);
        d2.Agregar(2, 250); // actualiza

        System.out.println("Claves del diccionario:");
        int[] claves3 = d2.Claves();
        for (int i = 0; i < claves3.length; i++) {
            System.out.println(claves3[i]);
        }

        d2.Eliminar(2);

        System.out.println("Claves luego de eliminar la clave 2:");
        int[] claves4 = d2.Claves();
        for (int i = 0; i < claves4.length; i++) {
            System.out.println(claves4[i]);
        }
    }
}