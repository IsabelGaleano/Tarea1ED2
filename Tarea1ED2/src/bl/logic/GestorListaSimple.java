package bl.logic;

import bl.entities.ListaSimple;

public class GestorListaSimple {
    private ListaSimple listaSimple;

    public GestorListaSimple() {
        this.listaSimple = new ListaSimple();
    }

    public void validarLista() {
        listaSimple.esVacia();
    }

    public void agregar(int dato) {
        listaSimple.agregarAlInicio(dato);
        System.out.println("==== SE AGREGÓ CON EXITO ====");
        System.out.println("");

    }

    public void agregarOrdenado(int dato) {
        listaSimple.agregarOrdenado(dato);
        System.out.println("==== SE AGREGÓ CON EXITO ====");
        System.out.println("");
    }

    public void buscar(int dato) {
        listaSimple.buscar(dato);
    }
    public void mostrarLista() {
        System.out.println("==== LISTA ====");
        listaSimple.listar();
    }

    public void borrarElemento(int dato) {
        listaSimple.borrar(dato);
        System.out.println("Elemento eliminado con exito");
        listaSimple.listar();
    }

}
