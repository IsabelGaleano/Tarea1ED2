package bl.logic;

import bl.entities.Cola;

public class GestorCola {

    private Cola cola;

    public Cola getCola() {
        return cola;
    }

    public void setCola(Cola cola) {
        this.cola = cola;
    }

    public GestorCola() {
        cola = new Cola();
    }

    public void insertar(int elemento) {
        cola.insertar(elemento);
        System.out.println("El elemento se añadió con exito a la Cola");
    }

    public void visualizarCola() {
        System.out.println("==== COLA ====");
        cola.mostrarCola();
    }

    public void eliminarCola() {
        if (cola.eliminar()) {
            System.out.println("Elemento eliminado correctamente");
        } else {
            System.out.println("No se pudo eliminar el elemento correctamente");
        }
    }

}
