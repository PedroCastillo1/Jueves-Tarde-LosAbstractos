package Bloque3.Implementacion;

import Bloque3.Interface.ColaPrioridadTDA;

public class GuardiaDeHospital implements ColaPrioridadTDA<Integer> {

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
    public void AcolarPrioridad(Integer numero, int prioridad) {
        if (cantidad < MAX) {
            int i = cantidad - 1;

            while (i >= 0 && prioridades[i] < prioridad) {
                datos[i + 1] = datos[i];
                prioridades[i + 1] = prioridades[i];
                i--;
            }

            datos[i + 1] = numero;
            prioridades[i + 1] = prioridad;
            cantidad++;
        }
    }

    @Override
    public void Desacolar() {
        if (!ColaVacia()) {
            for (int i = 0; i < cantidad - 1; i++) {
                datos[i] = datos[i + 1];
                prioridades[i] = prioridades[i + 1];
            }
            cantidad--;
        }
    }

    @Override
    public boolean ColaVacia() {
        return cantidad == 0;
    }

    @Override
    public Integer Primero() {
        return datos[0];
    }

    @Override
    public int Prioridad() {
        return prioridades[0];
    }

    public String nombrePaciente(int codigo) {
        switch (codigo) {
            case 20:
                return "Nene con raspón";
            case 40:
                return "Adolescente con fiebre";
            case 60:
                return "Jubilado con bobazo";
            default:
                return "Paciente desconocido";
        }
    }
}