public class ConjuntoMora implements ConjuntoTDA<Integer> {

    private int[] personas;
    private int cantidad;
    private static final int MAX = 100;

    @Override
    public void InicializarConjunto(){
        personas = new int[MAX];
        cantidad = 0;
    }

    @Override
    public void Agregar(Integer x){
        if (!Pertenece(x) && cantidad < MAX){
            personas[cantidad] = x;
            cantidad++;
        } else {
            System.out.println("no podemos ingresar ese dni. ya existe");
        }
    }

    @Override
    public void Sacar(Integer x) {
        for (int i = 0; i < cantidad; i++) {
            if (personas[i] == x) {
                personas[i] = personas[cantidad - 1]; // swap con el último
                cantidad--;
                return;
            }
        }
    }

    @Override
    public boolean Pertenece(Integer x) {
        for (int i = 0; i < cantidad; i++) {
            if (personas[i] == x) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean ConjuntoVacio() {
        return cantidad == 0;
    }

    @Override
    public int Tamaño() {
        return cantidad;
    }

    // 🔥 ESTE ES EL QUE TE FALTABA
    @Override
    public Integer Elegir() {
        if (!ConjuntoVacio()) {
            return personas[cantidad - 1]; // devuelve uno cualquiera (el último)
        }
        return null;
    }
}
