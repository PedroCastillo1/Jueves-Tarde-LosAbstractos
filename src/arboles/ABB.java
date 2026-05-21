package arboles;

public class ABB implements ABBTDA {

    private NodoABB nodo;

    public boolean arbolVacio() {
        return nodo == null;
    }

    public int raiz() {
        return nodo.info;
    }

    public ABBTDA hijoIzq() {
        return nodo.HijoIzq;
    }

    public ABBTDA hijoDer() {
        return nodo.HijoDer;
    }

    public void agregarElem(int x) {
        if (nodo == null) {
            nodo = new NodoABB();
            nodo.info = x;
            nodo.HijoIzq = new ABB();
            nodo.HijoDer = new ABB();
        } else if (nodo.info > x) {
            nodo.HijoIzq.agregarElem(x);
        } else if (nodo.info < x) {
            nodo.HijoDer.agregarElem(x);
        }
    }

    public void eliminar(int x) {
        // por ahora vacío
    }
}