public interface ColaTDA<T> {
    void InicializarCola();
    void Acolar(int x);
    void Desacolar();
    T Primero();
    boolean ColaVacia();
}
