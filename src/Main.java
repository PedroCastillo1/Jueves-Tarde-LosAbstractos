
public class Main {
    public static void main(String[] args) {
        String expresion = "( ( a + b ) * c )";

        boolean resultado = BalanceoParentesis.estaBalanceado(expresion);

        System.out.println("¿Está balanceado? " + resultado);

    }
}