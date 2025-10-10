package banco.planificadorprocesos;

public class Nodo {
    Proceso dato;
    Nodo sig;
    Nodo ant;
    
    public Nodo(Proceso dato) {
        this.dato = dato;
        this.sig = null;
        this.ant = null;
    }
}
