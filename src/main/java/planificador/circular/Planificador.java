package planificador.circular;

import java.util.LinkedList;
import java.util.ListIterator;

public class Planificador {
    private LinkedList<Proceso> listaProcesos = new LinkedList<>();

    // Agregar un proceso
    public void agregarProceso(Proceso p) {
        listaProcesos.add(p);
    }

    // Recorrer hacia adelante (simula round-robin)
    public void recorrerAdelante(int vueltas) {
        System.out.println("\nRecorriendo hacia adelante:");
        int total = listaProcesos.size();
        int index = 0;

        for (int i = 0; i < vueltas * total; i++) {
            Proceso p = listaProcesos.get(index);
            System.out.println(p);
            index = (index + 1) % total;  // índice circular
        }
    }

    // Recorrer hacia atrás
    public void recorrerAtras(int vueltas) {
        System.out.println("\nRecorriendo hacia atrás:");
        int total = listaProcesos.size();
        int index = total - 1;

        for (int i = 0; i < vueltas * total; i++) {
            Proceso p = listaProcesos.get(index);
            System.out.println(p);
            index = (index - 1 + total) % total;  // índice circular inverso
        }
    }
}