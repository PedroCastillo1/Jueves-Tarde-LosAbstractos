package Implementacion;
import Interfaces.PilaTDA;

public class ReversionDeParentesis<T> implements PilaTDA<T>{
    private static final int MAX = 100;
    private T[] datos;
    private int cantidad;

    @Override
    public void InicializarPila() {
        datos = (T[]) new Object[MAX];
        cantidad = 0;
    }

    @Override
    public void Apilar(T valorAApilar) {
        if (cantidad < MAX) {
            datos[cantidad] = valorAApilar;
            cantidad++;
        }
    }

    @Override
    public void Desapilar() {
        if (!PilaVacia()) {
            cantidad--;
        }
    }

    @Override
    public T Tope() {
        return datos[cantidad - 1];
    }

    @Override
    public boolean PilaVacia() {
        return cantidad == 0;
    }
}
