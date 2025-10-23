package estructuras.manual;

// Implementación manual de lista circular doblemente enlazada
public class ListaCircularManual {
    private Nodo cabeza;  // Referencia al primer nodo
    private int tamaño;    // Contador de elementos
    
    // Constructor
    public ListaCircularManual() {
        this.cabeza = null;
        this.tamaño = 0;
    }
    
    // Verificar si la lista está vacía
    public boolean estaVacia() {
        return cabeza == null;
    }
    
    // Obtener tamaño de la lista
    public int getTamaño() {
        return tamaño;
    }
    
    // Insertar al final de la lista
    public void insertarAlFinal(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        
        if (estaVacia()) {
            // Lista vacía: el nodo apunta a sí mismo
            nuevoNodo.siguiente = nuevoNodo;
            nuevoNodo.anterior = nuevoNodo;
            cabeza = nuevoNodo;
        } else {
            // Lista con elementos
            Nodo ultimo = cabeza.anterior;
            
            nuevoNodo.siguiente = cabeza;
            nuevoNodo.anterior = ultimo;
            
            ultimo.siguiente = nuevoNodo;
            cabeza.anterior = nuevoNodo;
        }
        tamaño++;
    }
    
    // Insertar al inicio de la lista
    public void insertarAlInicio(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        
        if (estaVacia()) {
            nuevoNodo.siguiente = nuevoNodo;
            nuevoNodo.anterior = nuevoNodo;
            cabeza = nuevoNodo;
        } else {
            Nodo ultimo = cabeza.anterior;
            
            nuevoNodo.siguiente = cabeza;
            nuevoNodo.anterior = ultimo;
            
            cabeza.anterior = nuevoNodo;
            ultimo.siguiente = nuevoNodo;
            
            cabeza = nuevoNodo;
        }
        tamaño++;
    }
    
    // Recorrer hacia adelante
    public void recorrerAdelante() {
        if (estaVacia()) {
            System.out.println("La lista esta vacia");
            return;
        }
        
        System.out.print("Recorrido Manual - Adelante: ");
        Nodo actual = cabeza;
        
        do {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        } while (actual != cabeza);
        
        System.out.println();
    }
    
    // Recorrer hacia atrás
    public void recorrerAtras() {
        if (estaVacia()) {
            System.out.println("La lista esta vacia");
            return;
        }
        
        System.out.print("Recorrido Manual - Atras: ");
        Nodo actual = cabeza.anterior;
        
        do {
            System.out.print(actual.dato + " ");
            actual = actual.anterior;
        } while (actual != cabeza.anterior);
        
        System.out.println();
    }
    
    // Eliminar elemento
    public boolean eliminar(int dato) {
        if (estaVacia()) {
            System.out.println("Lista vacia - no se puede eliminar");
            return false;
        }
        
        Nodo actual = cabeza;
        
        do {
            if (actual.dato == dato) {
                if (tamaño == 1) {
                    // Único elemento
                    cabeza = null;
                } else if (actual == cabeza) {
                    // Eliminar cabeza
                    Nodo anterior = actual.anterior;
                    Nodo siguiente = actual.siguiente;
                    
                    anterior.siguiente = siguiente;
                    siguiente.anterior = anterior;
                    cabeza = siguiente;
                } else {
                    // Eliminar nodo intermedio
                    Nodo anterior = actual.anterior;
                    Nodo siguiente = actual.siguiente;
                    
                    anterior.siguiente = siguiente;
                    siguiente.anterior = anterior;
                }
                
                tamaño--;
                System.out.println("Elemento " + dato + " eliminado (Manual)");
                return true;
            }
            actual = actual.siguiente;
        } while (actual != cabeza);
        
        System.out.println("Elemento " + dato + " no encontrado (Manual)");
        return false;
    }
    
    // Mostrar estado
    public void mostrarEstado() {
        System.out.println("=== ESTADO LISTA MANUAL ===");
        if (estaVacia()) {
            System.out.println("Lista vacIa");
        } else {
            System.out.println("Cabeza: " + cabeza.dato);
            System.out.println("Tamaño: " + tamaño);
        }
        System.out.println("===========================");
    }
}