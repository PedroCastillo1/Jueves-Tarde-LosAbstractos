public class DiccionarioMora implements DiccionarioTDA<Integer, String> {

    private int[] claves;
    private String[] valores;
    private int cantidad;
    private static final int MAX = 100;

    @Override
    public void InicializarDiccionario() {
        claves = new int[MAX];
        valores = new String[MAX];
        cantidad = 0;
    }

    @Override
    public void Agregar(Integer clave, String valor) {
        int pos = BuscarPos(clave);

        if (pos == -1) {
            if (cantidad < MAX) {
                claves[cantidad] = clave;
                valores[cantidad] = valor;
                cantidad++;
            }
        } else {
            // si la clave ya existe, actualiza el valor
            valores[pos] = valor;
        }
    }

    @Override
    public void Eliminar(Integer clave) {
        int pos = BuscarPos(clave);

        if (pos != -1) {
            claves[pos] = claves[cantidad - 1];
            valores[pos] = valores[cantidad - 1];
            cantidad--;
        }
    }

    @Override
    public boolean Pertenece(Integer clave) {
        return BuscarPos(clave) != -1;
    }

    @Override
    public String Obtener(Integer clave) {
        int pos = BuscarPos(clave);
        if (pos != -1) {
            return valores[pos];
        }
        return null;
    }

    @Override
    public boolean DiccionarioVacio() {
        return cantidad == 0;
    }

    // 🔥 método auxiliar clave
    private int BuscarPos(Integer clave) {
        for (int i = 0; i < cantidad; i++) {
            if (claves[i] == clave) {
                return i;
            }
        }
        return -1;
    }
}
