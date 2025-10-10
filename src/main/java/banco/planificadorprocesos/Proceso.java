package banco.planificadorprocesos;

public class Proceso {
    int id;
    String nombre;
    
    public Proceso(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public void mostrar() {
        System.out.println("Proceso " + id + " (" + nombre + ")");
    }
}
