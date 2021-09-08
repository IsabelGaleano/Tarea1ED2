package bl.logic;

import bl.entities.Pila;

public class GestorPila {
    private Pila pila;

    public GestorPila() {
        pila = new Pila();
    }

    public void push(int dato) {
        if (pila.push(dato)) {
            System.out.println("El elemento se añadió con exito a la Pila");
        } else {
            System.out.println("El elemento no se pudo añadir la Pila");
        }
    }
    public void pop() {
        if (pila.pop()) {
            System.out.println("El elemento se eliminó con exito");
        } else {
            System.out.println("El elemento no se eliminó con exito");
        }
    }

    public void mostrarPila() {
        System.out.println("==== PILA ====");
        pila.mostrarPila();
    }
}
