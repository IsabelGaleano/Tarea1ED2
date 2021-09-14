package bl.logic;

import bl.entities.Cola;
import bl.entities.Nodo;
import bl.entities.Pila;

public class GestorInteraccion {


     public void pilaACola(Pila pila, Cola cola) {
        int num;
        if (!(pila.esVacia()))
        {
            Nodo nodo = new Nodo(pila.getTope().getDato());
            nodo.setSiguiente(pila.getTope());
            cola.insertar(nodo.getDato());
            pila.pop();
            cola.mostrarCola();
        }
    }

    public void colaAPila(Pila pila, Cola cola) {
        if (!(cola.esVacia()))
        {
            Nodo nodo = new Nodo(cola.getFrente().getDato());
            nodo.setSiguiente(cola.getFrente());
            pila.push(nodo.getDato());
            cola.eliminar();
            pila.mostrarPila();

        }
    }


}
