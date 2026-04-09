/*Pila de Llamadas (Call Stack): Cuando una función llama a otra.
o Consigna: Si Main() llama a CalcularPromedio() y esta llama a
Sumar(), ¿quién está en el Tope() en el momento de la ejecución de
la suma?
main llama a calcularproemdio, y esta llama a sumar
*/

public class CallStack implements PilaTDA<String> {

    private static final int MAX=100;
    private int cantidad=0;
    private String [] pila;

    @Override
    public void InicializarPila() {
        pila=new String[MAX];
        cantidad=0;
    }

    @Override
    public void Apilar(String funcionAApilar){
        if(cantidad<MAX){
            pila[cantidad]=funcionAApilar;
            cantidad++;
        }
    }

    @Override
    public void Desapilar() {
        if(cantidad>0){
            cantidad--;

        }
    }

    @Override
    public String Tope(){
        return pila[cantidad-1];
    }

    @Override
    public boolean PilaVacia() {
        return cantidad==0;
    }


}
