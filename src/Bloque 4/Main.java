public class Main {
    public static void main(String[] args) {

        System.out.println("*****************ACT 2 BLOQUE 4************");
        DiccionarioMora d = new DiccionarioMora();
        d.InicializarDiccionario();

        // conjuntos de puntajes por jugador
        ConjuntoMora puntajesMora = new ConjuntoMora();
        puntajesMora.InicializarConjunto();

        ConjuntoMora puntajesLuz = new ConjuntoMora();
        puntajesLuz.InicializarConjunto();

        // agrego puntajes
        puntajesMora.Agregar(1000);
        puntajesMora.Agregar(1200);
        puntajesMora.Agregar(900);

        puntajesLuz.Agregar(800);
        puntajesLuz.Agregar(950);

        // los guardo en el diccionario
        d.Agregar("Mora", puntajesMora);
        d.Agregar("Luz", puntajesLuz);

        // 🔍 obtener puntajes de Mora
        ConjuntoTDA<Integer> pMora = d.Obtener("Mora");

        // calcular máximo (usando Elegir + Sacar para recorrer)
        int max = -1;

        while (!pMora.ConjuntoVacio()) {
            int x = pMora.Elegir();
            if (x > max) {
                max = x;
            }
            pMora.Sacar(x);
        }

        System.out.println("Puntaje máximo de Mora: " + max);
    }
}
