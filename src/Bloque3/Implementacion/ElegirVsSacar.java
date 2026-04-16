package Bloque3.Implementacion;

import Bloque3.Interface.ConjuntoTDA;

public class ElegirVsSacar implements ConjuntoTDA<String> {
    private String[] elementos;
    private int cantidad;
    private final int MAX = 100;

    public ElegirVsSacar() {
        InicializarConjunto();
    }

    @Override
    public void InicializarConjunto() {
        elementos = new String[MAX];
        cantidad = 0;
    }

    @Override
    public void Agregar(String valor) {
        if (!Pertenece(valor) && cantidad < MAX) {
            elementos[cantidad] = valor;
            cantidad++;
        }
    }

    @Override
    public void Sacar(String valor) {
        for (int i = 0; i < cantidad; i++) {
            if (elementos[i].equals(valor)) {
                elementos[i] = elementos[cantidad - 1];
                cantidad--;
                break;
            }
        }
    }

    @Override
    public String Elegir() {
        return elementos[0];
    }

    @Override
    public boolean ConjuntoVacio() {
        return cantidad == 0;
    }

    @Override
    public boolean Pertenece(String valor) {
        for (int i = 0; i < cantidad; i++) {
            if (elementos[i].equals(valor)) return true;
        }
        return false;
    }
}