public class Estrategia1MORA implements PilaTDA{
    private String[] pila;
    private static final int MAX = 100;
    private int cantidad;
// en este caso la estrategia mejor planteada es cantidad, ya que dentro de la pila queremos guadar estados, con strings.
    // por ende para guardar la cantidad de cambios y llevar un contador, necesitamos una variable externa a la pila

    @Override
    public void InicializarPila(){
        pila = new String[MAX];
        cantidad = 0;
    }

    @Override
    public void Apilar (String x){
        if (cantidad < MAX){
        pila[cantidad] = x;
        cantidad ++;
    }
    }

    @Override
    public void Desapilar(){
        if (!pilaVacia()){
            cantidad --;
        }
    }
    
// al metodo tope le pusimos "reuperar" ya que cumpliria con la consigna mas literalmente, si quiero volver a un cambio anterior,
    // desapilo y despues recupero.

    
    public String recuperar(){
        return pila[cantidad -1];

    }

    
    @Override
    public boolean PilaVacia(){
        return cantidad == 0;
    }


}
