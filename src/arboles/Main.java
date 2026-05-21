package arboles;

public class Main {
    public static void main(String[] args) {

        ABB arbol = new ABB();

        arbol.agregarElem(10);
        arbol.agregarElem(5);
        arbol.agregarElem(15);
        arbol.agregarElem(3);
        arbol.agregarElem(7);
        System.out.println("Raiz: " + arbol.raiz());              // 10
        System.out.println("Hijo izq: " + arbol.hijoIzq().raiz()); // 5
        System.out.println("Hijo der: " + arbol.hijoDer().raiz()); // 15
    }
}