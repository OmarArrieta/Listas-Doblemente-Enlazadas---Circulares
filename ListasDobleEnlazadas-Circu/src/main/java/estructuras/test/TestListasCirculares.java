package estructuras.test;

import estructuras.manual.ListaCircularManual;
import estructuras.libreria.ListaCircularLibreria;

// Clase para probar ambas implementaciones
public class TestListasCirculares {
    
    public static void main(String[] args) {
        System.out.println("=== COMPARACION DE IMPLEMENTACIONES ===\n");
        
        // Probar implementación manual
        System.out.println("1. IMPLEMENTACION MANUAL:");
        ListaCircularManual listaManual = new ListaCircularManual();
        
        // Operaciones con lista manual
        listaManual.insertarAlFinal(10);
        listaManual.insertarAlFinal(20);
        listaManual.insertarAlInicio(5);
        listaManual.insertarAlFinal(30);
        
        listaManual.recorrerAdelante();
        listaManual.recorrerAtras();
        listaManual.mostrarEstado();
        
        listaManual.eliminar(20);
        listaManual.recorrerAdelante();
        listaManual.mostrarEstado();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Probar implementación con librería
//        System.out.println("2. IMPLEMENTACION CON LIBRERIA:");
//        ListaCircularLibreria listaLibreria = new ListaCircularLibreria();
//        
//        // Operaciones con lista de librería
//        listaLibreria.insertarAlFinal(10);
//        listaLibreria.insertarAlFinal(20);
//        listaLibreria.insertarAlInicio(5);
//        listaLibreria.insertarAlFinal(30);
//        
//        listaLibreria.recorrerAdelante();
//        listaLibreria.recorrerAtras();
//        listaLibreria.mostrarEstado();
//        
//        listaLibreria.eliminar(20);
//        listaLibreria.recorrerAdelante();
//        listaLibreria.mostrarEstado();
//        
//        System.out.println("\n=== PRUEBAS COMPLETADAS ===");
    }
}