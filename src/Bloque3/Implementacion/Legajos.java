package Bloque3.Implementacion;
import Bloque3.Interface.ConjuntoTDA;

public class Legajos implements ConjuntoTDA <Integer>{

    private static final int MAX = 100;
    private int[] datos;
    private int cantidad;

    @Override
    public void InicializarConjunto() {
        datos = new int[MAX];
        cantidad = 0;
    }

    @Override
    public void Agregar(Integer x) {
        if (cantidad < MAX && !Pertenece(x)) {
            datos[cantidad] = x;
            cantidad++;
        }
    }

    @Override
    public void Sacar(Integer x) {
        int i = 0;
        while (i < cantidad && datos[i] != x) {
            i++;
        }

        if (i < cantidad) {
            datos[i] = datos[cantidad - 1];
            cantidad--;
        }
    }

    @Override
    public boolean ConjuntoVacio() {
        return cantidad == 0;
    }

    @Override
    public boolean Pertenece(Integer x) {
        int i = 0;
        while (i < cantidad) {
            if (datos[i] == x) {
                return true;
            }
            i++;
        }
        return false;
    }

    @Override
    public Integer Elegir() {
        return datos[0];
    }

    public void mostrar() {
        for (int i = 0; i < cantidad; i++) {
            System.out.print(datos[i] + ", ");
        }
        System.out.println();
    }
}

