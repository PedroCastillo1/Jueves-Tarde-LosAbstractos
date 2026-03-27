public class BalanceoParentesis {

    public static boolean estaBalanceado(String expresion) {

        PilaTDA<Character> pila = new PilaEstatica<>();
        pila.InicializarPila();

        for (int i = 0; i < expresion.length(); i++) {

            char caracterActual = expresion.charAt(i);

            if (caracterActual == '(') {
                pila.Apilar(caracterActual);
            }

            if (caracterActual == ')') {

                if (pila.PilaVacia()) {
                    return false;
                }

                if (pila.Tope() == '(') {
                    pila.Desapilar();
                }
            }
        }

        return pila.PilaVacia();
    }
}