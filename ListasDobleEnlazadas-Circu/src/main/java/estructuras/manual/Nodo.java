package estructuras.manual;

// Clase que representa un nodo de la lista circular doblemente enlazada
public class Nodo {
    public int dato;        // Dato almacenado en el nodo
    public Nodo siguiente;  // Referencia al siguiente nodo
    public Nodo anterior;   // Referencia al nodo anterior
    
    // Constructor del nodo
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
}