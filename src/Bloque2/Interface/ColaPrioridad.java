package Bloque2.Interface;

public interface ColaPrioridad {
    void InicializarColaPrioridad();
    void AcolarPrioridad(int numero, int prioridad);
    void Desacolar();
    boolean ColaVacia();
    int Primero();
    int Prioridad();
}
