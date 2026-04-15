package Bloque3.Interface;

public interface ConjuntoTDA<T> {
    void InicializarConjunto();
    void Agregar(T valorAAgregar);
    void Sacar(T valorASacar);
    boolean ConjuntoVacio();
    boolean Pertenece(T valorABuscar);
    T Elegir();
}
