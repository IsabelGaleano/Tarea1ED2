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
        System.out.println("Se agregó con exito");
        System.out.println("Lista actual");
        listaSimple.listar();

    }
    public void mostrarLista() {
        listaSimple.listar();
    }

    public void borrarElemento(int dato) {
        listaSimple.borrar(dato);
        System.out.println("Elemento eliminado con exito");
        listaSimple.listar();
    }

}
