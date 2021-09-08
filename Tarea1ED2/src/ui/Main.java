package ui;

import bl.logic.GestorListaSimple;
import bl.logic.GestorPila;


public class Main {

    public static void main(String[] args) {
        GestorListaSimple gestorListaSimple = new GestorListaSimple();
        GestorPila gestorPila = new GestorPila();
        gestorListaSimple.agregarOrdenado(1);
        gestorListaSimple.agregarOrdenado(2);
        /*gestorListaSimple.agregar(3);
        gestorListaSimple.agregar(4);
        gestorListaSimple.agregar(5);*/
        gestorListaSimple.mostrarLista();
        gestorListaSimple.buscar(1);
        System.out.println("PILA");
        gestorPila.push(1);
        gestorPila.push(2);
        gestorPila.mostrarPila();
        gestorPila.pop(1);
        gestorPila.mostrarPila();

    }

}
