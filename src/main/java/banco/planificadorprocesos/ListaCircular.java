package banco.planificadorprocesos;

public class ListaCircular {
    Nodo cabeza = null;
    
    public void agregar(Proceso p) {
        Nodo nuevo = new Nodo(p);
        
        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.sig = nuevo;
            cabeza.ant = nuevo;
        } else {
            Nodo ultimo = cabeza.ant;
            ultimo.sig = nuevo;
            nuevo.ant = ultimo;
            nuevo.sig = cabeza;
            cabeza.ant = nuevo;
        }
    }
    public void recorrerAdelante(int pasos) {
        if (cabeza == null) {
        System.out.println("La lista esta vacia");
        return;
        }
        Nodo actual = cabeza;
        System.out.println("Recorriendo hacia adelante");
        for (int i=0;i<pasos;i++) {
            actual.dato.mostrar();
            actual=actual.sig;
        }
    }
    public void recorrerAtras(int pasos) {
        if (cabeza == null) {
        System.out.println("La lista esta vacia");
        return;
        }
        Nodo actual = cabeza;
        System.out.println("Recorriendo hacia atras");
        for (int i=0;i<pasos;i++) {
            actual.dato.mostrar();
            actual=actual.ant;
        }
    }
    
}
