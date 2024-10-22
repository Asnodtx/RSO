package com.example.demo.services;

import com.example.demo.model.EjemploModel;

public class EjemploService {

    private EjemploModel[] ejemplos;
    private int contador;

    public EjemploService() {
        ejemplos = new EjemploModel[3];  // Tamaño inicial del arreglo
        ejemplos[0] = new EjemploModel(1L, 5.5, "Developer", "Alice", 1, 50000.0);
        ejemplos[1] = new EjemploModel(2L, 10.0, "Manager", "Bob", 2, 75000.0);
        ejemplos[2] = new EjemploModel(3L, 3.0, "Analyst", "Charlie", 3, 45000.0);
        contador = 3;
    }

    public EjemploModel[] obtenerTodosLosEjemplos() {
        return ejemplos;  // Retorna el arreglo completo
    }

    public EjemploModel obtenerEjemploPorId(Long id) {
        for (int i = 0; i < contador; i++) {
            if (ejemplos[i].getId().equals(id)) {
                return ejemplos[i];
            }
        }
        return null;  // Retorna null si no se encuentra
    }

    public void agregarEjemplo(EjemploModel nuevoEjemplo) {
        if (contador < ejemplos.length) {
            ejemplos[contador] = nuevoEjemplo;
            contador++;
        } else {
            // Implementar lógica para expansión del arreglo si es necesario
            System.out.println("No hay espacio para más ejemplos. Considera aumentar el tamaño del arreglo.");
        }
    }
}
