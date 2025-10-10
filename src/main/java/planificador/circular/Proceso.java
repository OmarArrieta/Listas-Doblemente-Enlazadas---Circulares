package planificador.circular;
public class Proceso {
    private int id;
    private String nombre;
    
    public Proceso (int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    
    @Override
    public String toString() {
        return "Proceso " + id + " (" + nombre + ")";
    }
}
