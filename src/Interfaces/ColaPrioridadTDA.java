package Interfaces;

public interface ColaPrioridadTDA<T> {
    void InicializarColaPrioridad();
    void AcolarPrioridad(int numero, int prioridad);
    void Desacolar();
    boolean ColaVacia();
    T Primero();
    T Prioridad();
}
