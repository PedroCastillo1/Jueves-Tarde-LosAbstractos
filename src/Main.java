
public class Main {
    public static void main(String[] args) {
        String expresion = "( ( a + b ) * c )";

        boolean resultado = BalanceoParentesis.estaBalanceado(expresion);

        System.out.println("¿Está balanceado? " + resultado);

        //consigna : undo-deshacer. estas codeando y queres volver al estado anterior
        System.out.println("*********** Ejercicio Editor de Codigo**********")
        Cambio c = new Cambio("escribiendo");
        String estado = c.getEstado();
        Estrategia1 p = new Estrategia();
        p.InicializarPila();
        p.Apilar(estado);

        Cambio c1 = new Cambio("dos nuevas lineas");
        String e1 = c1.getEstado();
        p.Apilar(e1);

        Cambio c2 = new Cambio("borrar ultima linea");
        String e2 = c2.getEstado();
        p.Apilar(e2);

        Cambio c3 = new Cambio("agregar comentario");
        String e3 = c3.getEstado();
        p.Apilar(e3);

        Cambio c4 = new Cambio("corregir variable");
        String e4 = c4.getEstado();
        p.Apilar(e4);

        // aca ya tenemos varios cambios apilados. que pasa si el usuario se arrepiente de los ultimos cambios

        p.Desapilar(); // ignora "corregir variable"
        p.Desapilar(); // ignora "agregar comentario"

        String recupero = p.recuperar();

        System.out.println("cambio recuperado: " + recupero);

        /* Main del ejercicio de Historial de Navegacion
         */
        System.out.println("********Ejercicio Historial de Navegacion*************");
        HistorialNavegacion historialNavegacion = new HistorialNavegacion();
        historialNavegacion.InicializarPila();

        historialNavegacion.Apilar("www.fi.uba.ar"); /* Cargo las paginas de busqueda*/
        historialNavegacion.Apilar("www.campus.utn.edu.ar");
        historialNavegacion.Apilar("www.stackoverflow.com");

        System.out.println("URL actual: " + historialNavegacion.Tope());
        System.out.println(historialNavegacion.Undo());
        System.out.println(historialNavegacion.Undo());
        System.out.println(historialNavegacion.Undo()); /* Las retiro una a una */

        /* Main del ejercicio de Navegacion de Directorios
         */
        System.out.println("********Ejercicio Navegacion de Directorios*************");

        NavegadorDeDirectorios navegadorDeDirectorios = new NavegadorDeDirectorios();
        navegadorDeDirectorios.InicializarPila();

        navegadorDeDirectorios.Apilar("C:"); /* Añado directorios */
        navegadorDeDirectorios.Apilar("Usuarios");
        navegadorDeDirectorios.Apilar("Documentos");

        System.out.println("Directorio actual: " + navegadorDeDirectorios.Tope());
        System.out.println(navegadorDeDirectorios.SubirDeNivel()); /* subo de nivel uno a uno */
        System.out.println(navegadorDeDirectorios.SubirDeNivel());
        System.out.println(navegadorDeDirectorios.SubirDeNivel());
    }

    //EJERCICIO REVERSION DE PARENTESIS
         PilaTDA<Character> pila = new ReversionDeParentesis<>();
        pila.InicializarPila();

        String palabra = "ALGORITMOS";

        for (int i = 0; i < palabra.length(); i++) {
            pila.Apilar(palabra.charAt(i)); //el chartATse usa para devolver un caracter en la posicion especifica en este caso I, entonces apila una x una
        }

        String invertida = "";

        while (!pila.PilaVacia()) {
            invertida += pila.Tope(); //guarda cada letra en inverida
            pila.Desapilar();
        }

        System.out.println("Palabra invertida: " + invertida);
    }
}
