public class PilaEstatica<T> implements PilaTDA<T> {

    private Object[] datos;
    private int tope;
    private static final int CAPACIDAD = 100;

    @Override
    public void InicializarPila() {
        datos = new Object[CAPACIDAD];
        tope = 0;
    }

    @Override
    public void Apilar(T valorAApilar) {
        datos[tope] = valorAApilar;
        tope++;
    }

    @Override
    public void Desapilar() {
        tope--;
    }

    @Override
    public T Tope() {
        return (T) datos[tope - 1];
    }

    @Override
    public boolean PilaVacia() {
        return tope == 0;
    }
}
