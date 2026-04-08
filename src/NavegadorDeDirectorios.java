public class NavegadorDeDirectorios implements PilaTDA<String> {
    private static final int Max = 100;
    private int cantidad = 0;
    private String [] directorios;

    @Override
    public void InicializarPila() {
        directorios = new String[Max];
    }

    @Override
    public void Apilar(String valorAApilar) {

        if (cantidad < Max) {
            if (!PilaVacia()) {
                directorios[cantidad] = Tope() + "/" + valorAApilar;
            }
            else {
                directorios[cantidad] = valorAApilar;
            }
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
    public String Tope() {
        return directorios[cantidad - 1];
    }

    @Override
    public boolean PilaVacia() {
        return cantidad == 0;
    }

    public String SubirDeNivel(){
        if (cantidad > 1){
            Desapilar();
            return "Directorio post subida de nivel es: " + Tope();
        }else {
            return "Nivel mas alto";
        }
    }
}
