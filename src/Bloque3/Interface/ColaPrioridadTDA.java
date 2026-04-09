package Bloque3.Interface;

public interface ColaPrioridadTDA<T> {

    void InicializarColaPrioridad();

    void AcolarPrioridad(T numero, int prioridad);

    void Desacolar();

    boolean ColaVacia();

    T Primero();

    int Prioridad();
}
