package planificador.circular;

public class Main {
    public static void main(String[] args) {
        Planificador planificador = new Planificador();

        // Agregar procesos simulados
        planificador.agregarProceso(new Proceso(1, "Navegador"));
        planificador.agregarProceso(new Proceso(2, "Editor de texto"));
        planificador.agregarProceso(new Proceso(3, "Reproductor de música"));
        planificador.agregarProceso(new Proceso(4, "Calculadora"));

        // Simular dos vueltas hacia adelante y hacia atrás
        planificador.recorrerAdelante(2);
        planificador.recorrerAtras(2);
    }
}