package Bloque3.Implementacion;

import Bloque3.Interface.ColaPrioridadTDA;

public class FilaDelCajero implements ColaPrioridadTDA<String> {
    private static final int Max = 100;
    private String [] personas;
    private int [] prioridades;
    private int cantidad;

    public FilaDelCajero() {
        InicializarColaPrioridad();
    }

    @Override
    public void InicializarColaPrioridad() {
        personas = new String[Max];
        prioridades = new int[Max];
        cantidad = 0;
    }

    @Override
    public void AcolarPrioridad(String valor, int prioridad) {
        if (cantidad == Max){
            System.out.println("La cola esta llena");
        }else{
            if (ColaVacia()) {
                personas[cantidad] = valor;
                prioridades[cantidad] = prioridad;
            }else{
                for (int i = cantidad; i >= 0; i--) {
                    if (prioridad > prioridades[i]) {
                        personas[i + 1] = personas[i];
                        prioridades[i + 1] = prioridades[i];
                        personas[i] = valor;
                        prioridades[i] = prioridad;
                    }
                }
            }
        }
        cantidad++;
    }

    @Override
    public void Desacolar() {
        for (int i = 0; i < cantidad-1 ; i++) {
            personas[i] = personas[i+1];
            prioridades[i] = prioridades[i+1];
        }
        cantidad--;
    }

    @Override
    public boolean ColaVacia() {
        return cantidad == 0;
    }

    @Override
    public String Primero() {
        return "Primero esta: " + personas[0];
    }

    @Override
    public int Prioridad() {
        return prioridades[0];
    }

    public String FilaActual(){
        String filaActual = "La fila actual es: ";
        for (int i = 0; i < cantidad ; i++) {
            if (i == 0){
                filaActual += personas[i];
            }else {
                filaActual += ", " + personas[i];
            }
        }
        return filaActual;
    }
}
