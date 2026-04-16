package Bloque4.Implementacion;

import Bloque4.DiccionarioTDA;

public class DiccionarioMora implements DiccionarioTDA<String, Integer> {

    private String[] claves;
    private int[] valores;
    private int cantidad;
    private static final int MAX = 100;

    @Override
    public void InicializarDiccionario() {
        claves = new String[MAX];
        valores = new int[MAX];
        cantidad = 0;
    }

    @Override
    public void Agregar(String clave, Integer valor) {
        int pos = BuscarPos(clave);

        if (pos == -1) {
            claves[cantidad] = clave;
            valores[cantidad] = valor;
            cantidad++;
        } else {
            // 🔥 actualiza si ya existe
            valores[pos] = valor;
        }
    }

    @Override
    public void Eliminar(String clave) {
        int pos = BuscarPos(clave);

        if (pos != -1) {
            claves[pos] = claves[cantidad - 1];
            valores[pos] = valores[cantidad - 1];
            cantidad--;
        }
    }

    @Override
    public boolean Pertenece(String clave) {
        return BuscarPos(clave) != -1;
    }

    @Override
    public Integer Obtener(String clave) {
        int pos = BuscarPos(clave);
        if (pos != -1) {
            return valores[pos];
        }
        return null;
    }

    @Override
    public boolean DiccionarioVacio() {
        return cantidad == 0;
    }

    private int BuscarPos(String clave) {
        for (int i = 0; i < cantidad; i++) {
            if (claves[i].equals(clave)) {
                return i;
            }
        }
        return -1;
    }
}
