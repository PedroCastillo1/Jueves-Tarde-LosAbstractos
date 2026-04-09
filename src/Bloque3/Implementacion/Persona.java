public class Persona {

    private int prioridad;
    private int dni;

    public int getDNI(){
        return dni;
    }
    public int getPrioridad(){
        return prioridad;
    }

    public Persona(int prioridad, int dni) {
        this.prioridad = prioridad;
        this.dni = dni;
    }
}
