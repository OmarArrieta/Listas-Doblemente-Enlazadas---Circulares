package estructuras.libreria;

import java.util.LinkedList;
import java.util.ListIterator;

// Implementación usando LinkedList de Java
public class ListaCircularLibreria {
    private LinkedList<Integer> lista;
    private int tamaño;
    
    // Constructor
    public ListaCircularLibreria() {
        this.lista = new LinkedList<>();
        this.tamaño = 0;
    }
    
    // Verificar si la lista está vacía
    public boolean estaVacia() {
        return lista.isEmpty();
    }
    
    // Obtener tamaño
    public int getTamaño() {
        return lista.size();
    }
    
    // Insertar al final
    public void insertarAlFinal(int dato) {
        lista.addLast(dato);
        tamaño = lista.size();
    }
    
    // Insertar al inicio
    public void insertarAlInicio(int dato) {
        lista.addFirst(dato);
        tamaño = lista.size();
    }
    
    // Recorrer hacia adelante (simulando comportamiento circular)
    public void recorrerAdelante() {
        if (estaVacia()) {
            System.out.println("La lista está vacía");
            return;
        }
        
        System.out.print("Recorrido Librería - Adelante: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + " ");
        }
        System.out.println();
    }
    
    // Recorrer hacia atrás (simulando comportamiento circular)
    public void recorrerAtras() {
        if (estaVacia()) {
            System.out.println("La lista está vacía");
            return;
        }
        
        System.out.print("Recorrido Librería - Atrás: ");
        for (int i = lista.size() - 1; i >= 0; i--) {
            System.out.print(lista.get(i) + " ");
        }
        System.out.println();
    }
    
    // Eliminar elemento
    public boolean eliminar(int dato) {
        boolean eliminado = lista.removeFirstOccurrence(dato);
        tamaño = lista.size();
        
        if (eliminado) {
            System.out.println("Elemento " + dato + " eliminado (Librería)");
        } else {
            System.out.println("Elemento " + dato + " no encontrado (Librería)");
        }
        
        return eliminado;
    }
    
    // Mostrar estado
    public void mostrarEstado() {
        System.out.println("=== ESTADO LISTA LIBRERIA ===");
        if (estaVacia()) {
            System.out.println("Lista vacia");
        } else {
            System.out.println("Primer elemento: " + lista.getFirst());
            System.out.println("Último elemento: " + lista.getLast());
            System.out.println("Tamaño: " + tamaño);
        }
        System.out.println("=============================");
    }
}