package ui;

import bl.logic.GestorListaSimple;


public class Main {

    public static void main(String[] args) {
        GestorListaSimple gestorListaSimple = new GestorListaSimple();
        gestorListaSimple.agregar(1);
        gestorListaSimple.agregar(2);
        /*gestorListaSimple.agregar(3);
        gestorListaSimple.agregar(4);
        gestorListaSimple.agregar(5);*/
        gestorListaSimple.mostrarLista();
    }

}
