package Bloque3.Implementacion;

import Bloque3.Interface.ConjuntoTDA;

public class PadronElectoral implements ConjuntoTDA<String> {
    private static final int Max = 100;
    private int cantidad = 0;
    private String [] alumnosRegistrados;

    public PadronElectoral() {
        InicializarConjunto();
    }

    @Override
    public void InicializarConjunto() {
        alumnosRegistrados = new String[Max];
    }

    @Override
    public void Agregar(String valorAAgregar) {
        if (cantidad >= Max){
            System.out.println("El registro ya esta lleno");
        }else if (Pertenece(valorAAgregar)){
            System.out.println("Ya esta registrado este alumno");
        }else {
            alumnosRegistrados[cantidad] = valorAAgregar;
            cantidad++;
        }
    }

    @Override
    public void Sacar(String valorASacar) {
        if (ConjuntoVacio()){
            System.out.println("No hay alumnos registrados para sacar");
        }else if (!Pertenece(valorASacar)){
            System.out.println("El alumno no esta registrado");
        }else {
            for (int i = 0; i < cantidad-1 ; i++) {
                if (Pertenece(alumnosRegistrados[i])){
                    alumnosRegistrados[i]="";
                }
            }
            cantidad--;
        }
    }

    @Override
    public boolean ConjuntoVacio() {
        return cantidad == 0;
    }

    @Override
    public boolean Pertenece(String valorABuscar) {
        if (ConjuntoVacio()){
            return false;
        }else {
            for (int i = 0; i < cantidad ; i++) {
                if (alumnosRegistrados[i].equals(valorABuscar)){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String Elegir() {
        return alumnosRegistrados[0];
    }

    public String mostrarPadronElectoral(){
        String padron = "";
        for (int i = 0; i < cantidad ; i++) {
            padron += alumnosRegistrados[i] + ", ";
        }
        return padron;
    }
}
