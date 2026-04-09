package Interfaces;

public interface ColaPrioridadTDA<T> {
    void InicializarColaPrioridad();
    void AcolarPrioridad(T valor, int prioridad);
    void Desacolar();
    boolean ColaVacia();
    T Primero();
    T Prioridad();
}
