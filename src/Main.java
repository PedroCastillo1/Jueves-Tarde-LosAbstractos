
public class Main {
    public static void main(String[] args) {
        String expresion = "( ( a + b ) * c )";

        boolean resultado = BalanceoParentesis.estaBalanceado(expresion);

        System.out.println("¿Está balanceado? " + resultado);

        //consigna : undo-deshacer. estas codeando y queres volver al estado anterior

        Cambio c = new Cambio("escribiendo");
        String estado = c.getEstado();
        Estrategia1 p = new Estrategia1();
        p.inicializarPila();
        p.apilar(estado);

        Cambio c1 = new Cambio("dos nuevas lineas");
        String e1 = c1.getEstado();
        p.apilar(e1);

        Cambio c2 = new Cambio("borrar ultima linea");
        String e2 = c2.getEstado();
        p.apilar(e2);

        Cambio c3 = new Cambio("agregar comentario");
        String e3 = c3.getEstado();
        p.apilar(e3);

        Cambio c4 = new Cambio("corregir variable");
        String e4 = c4.getEstado();
        p.apilar(e4);

        // aca ya tenemos varios cambios apilados. que pasa si el usuario se arrepiente de los ultimos cambios

        p.desapilar(); // ignora "corregir variable"
        p.desapilar(); // ignora "agregar comentario"

        String recupero = p.recuperar();

        System.out.println("cambio recuperado: " + recupero);
        
    }
}

        

    }
}
