package banco.planificadorprocesos;

public class PlanificadorProcesos {

    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular ();
        
        lista.agregar(new Proceso(1, "Navegador"));
        lista.agregar(new Proceso(2, "Editor de texto"));
        lista.agregar(new Proceso(3, "Reproductor de musica"));
        lista.agregar(new Proceso(4, "Calculadora"));
        
        System.out.println("\n--- SIMULADOR DE PLANIFICADOR CURCULAR---\n");
        
        lista.recorrerAdelante(8);
        System.out.println();
        lista.recorrerAtras(8);
    }
}
