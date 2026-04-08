public class BalanceoParentesis implements PilaTDA<Character> {

    private static final int MAX = 100;
    private int cantidad = 0;
    private char[] pila;

    @Override
    public void InicializarPila() {
        pila = new char[MAX];
        cantidad = 0;
    }

    @Override
    public void Apilar(Character c) {
        if (cantidad < MAX) {
            pila[cantidad] = c;
            cantidad++;
        }
    }

    @Override
    public void Desapilar() {
        if (cantidad > 0) {
            cantidad--;
        }
    }

    @Override
    public Character Tope() {
        return pila[cantidad - 1];
    }

    @Override
    public boolean PilaVacia() {
        return cantidad == 0;
    }

    public boolean estaBalanceado(String expresion) {

        InicializarPila();

        for (int i = 0; i < expresion.length(); i++) {

            char c = expresion.charAt(i);

            if (c == '(') {
                Apilar(c);
            }

            if (c == ')') {
                if (PilaVacia()) {
                    return false;
                }
                Desapilar();
            }
        }

        return PilaVacia();
    }
}