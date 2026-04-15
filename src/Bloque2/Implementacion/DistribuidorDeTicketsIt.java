package Bloque2.Implementacion;

import Bloque2.Interface.ColaPrioridadTDA;

public class DistribuidorDeTicketsIt implements ColaPrioridadTDA<String> {
    private static final int Max = 100;
    private String [] tickets;
    private int [] prioridades;
    private int cantidad;

    public DistribuidorDeTicketsIt() {
        InicializarColaPrioridad();
    }

    @Override
    public void InicializarColaPrioridad() {
        tickets = new String[Max];
        prioridades = new int[Max];
        cantidad = 0;
    }

    @Override
    public void AcolarPrioridad(String valor, int prioridad) {
        if (cantidad == Max){
            System.out.println("No se aceptan mas Tickets");
        } else if (prioridad < 0 || prioridad > 1000) {
            System.out.println("Prioridad fuera de rango");
        } else{
            if (ColaVacia()) {
                tickets[cantidad] = valor;
                prioridades[cantidad] = prioridad;
            }else{
                for (int i = cantidad; i >= 0; i--) {
                    if (prioridad > prioridades[i]) {
                        tickets[i + 1] = tickets[i];
                        prioridades[i + 1] = prioridades[i];
                        tickets[i] = valor;
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
            tickets[i] = tickets[i+1];
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
        return "El ticket a resolver es: " + tickets[0];
    }

    @Override
    public int Prioridad() {
        return prioridades[0];
    }

    public String PrioridadDeTicket(){
        if (ColaVacia()){
            return "No hay tickets";
        }else {
            if (Prioridad() >= 0 && Prioridad() < 200){
                return "El ticket tiene prioridad: MUY BAJA";
            }else if (Prioridad() >= 200 && Prioridad() < 400){
                return "El ticket tiene prioridad: BAJA";
            }else if (Prioridad() >=400 && Prioridad() < 600) {
                return "El ticket tiene prioridad: MEDIA";
            } else if (Prioridad() >= 600 && Prioridad() < 800) {
                return "El ticket tiene prioridad: ALTA";
            } else {
                return "El ticket tiene prioridad: URGENTE";
            }
        }

    }
}

