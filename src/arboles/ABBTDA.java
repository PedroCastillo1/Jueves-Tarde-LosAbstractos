package arboles;

public interface ABBTDA {
    int raiz();
    ABBTDA hijoIzq();
    ABBTDA hijoDer();
    void agregarElem(int x);
    void eliminar(int x);
    boolean arbolVacio();
}
