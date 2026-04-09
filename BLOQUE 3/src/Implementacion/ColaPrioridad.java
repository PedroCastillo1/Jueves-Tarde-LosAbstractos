package Implementacion;


import Interface.ColaPrioridadTDA;

public class ColaPrioridad implements ColaPrioridadTDA {

        private static final int MAX = 100;
        private int[] datos;
        private int[] prioridades;
        private int cantidad;

        @Override
        public void InicializarColaPrioridad() {
            datos = new int[MAX];
            prioridades = new int[MAX];
            cantidad = 0;
        }

        @Override
        public void AcolarPrioridad(int numero, int prioridad) {
            if (cantidad < MAX) {
                int i = cantidad - 1;

                // mueve a la derecha mientras la prioridad nueva sea mayor
                // como es un while va recorriendo con el valor de i a todos los valores de las dos listas. la idea es que tanto
                // en la lista de datos como en la lista de prioridades ubiques al mas importante adelante de todo, osea primera en la fila
                // para eso tenes que primero ir iterando la i, del numero "mas alto" (la ultima posicion ocupada) hasta el mas bajo  (el primero)
                // en cada posicion que se para lo que chequea es que el nuevo dato sea mas prioritario que el resto
                // cuando deja de ser mas prioritario que el valor en el que esta parada la i, se CORTA EL CICLO
                // ahi ubicas al nuevo dato en la posicion de las listas que quedo frenada la i
                // la manera en la que chequeas es con la lista de prioridades. si prioridad[ï[ (el valor en donde me pare) tiene adentro
                // un valor MENOR que el del dato nuevo, justamente muevo a una posicion mas alta ese valor de prioridad [i
                // voy moviendo a una pos mas alta a todos para que cuando se corte el ciclo, el dato nuevo vaya al lugar vacio que quedo, mas adelante
                while (i >= 0 && prioridades[i] < prioridad) {
                    datos[i + 1] = datos[i];
                    prioridades[i + 1] = prioridades[i];
                    i--; // me meuvo una pos mas chica, mas adelante
                }

                datos[i + 1] = numero; // ubico al valor en la pos que queda i frenada en el ciclo
                prioridades[i + 1] = prioridad;
                cantidad++;


            }

        }

        public void Desacolar() {
            if (!ColaVacia()) {
                for (int i = 0; i < cantidad - 1; i++) { // i tiene que ser menor si o si a la cantidad", osea que no se tiene que pasar de la ultima pos ocupada
                    datos[i] = datos[i + 1]; //muevo a todos a la derecha. cada valor pasa a estar en una posicion mas alta, mas atras
                    prioridades[i] = prioridades[i + 1]; //en ambas filas como siempre
                }
                cantidad--; // resto la cantidad por que ahora cuento con menos valores.
                // ahora cuando yo apile, no cuento a ese que quedo en una pos por fuera de la cantidad blanqueada

            }


        }

        @Override
        public boolean ColaVacia() {
            return cantidad == 0;
        }

        @Override
        public int Primero() {
            if (cantidad != 0) {
                return datos[0];
            }
            return 0;
        }

        @Override
        public int Prioridad() {
            if( cantidad != 0){
                return prioridades[0];
            }
            return 0;
        }

        public int[] MostrarLista(){
            return datos;
        }
    }



