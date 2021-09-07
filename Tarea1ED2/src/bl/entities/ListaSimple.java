package bl.entities;

public class ListaSimple {
    private Nodo cabeza;
    int cantidadElementos;

    public ListaSimple() {
        this.cabeza = null;
        cantidadElementos = 0;
    }

    public void agregarAlInicio(int dato) {

        Nodo temp = new Nodo(dato);
        if (cabeza == null)
        {
            cabeza = temp;
        }
        else
        {
            temp.setSiguiente(cabeza);
            cabeza = temp;
        }
        cantidadElementos = cantidadElementos + 1;
    }

    public void borrar(int elem) {
        if (cabeza == null)
            System.out.println("lista vacía");
        else if (cabeza.getDato() == elem) {
            cabeza = cabeza.getSiguiente();
            cantidadElementos--;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null && actual.getSiguiente().getDato() != elem) {
                actual = actual.getSiguiente();
                if (actual.getSiguiente() == null) {
                    System.out.println("elemento " + elem + " no esta en la lista");
                } else {
                    actual.setSiguiente(actual.getSiguiente().getSiguiente());
                    cantidadElementos--;
                }
            }

        }
    }
    public void listar(){

        Nodo actual = this.cabeza;
        while (actual.getSiguiente()!= null){
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();

        }
        System.out.println(actual.getDato());

    }

    public boolean esVacia() {
        if (cabeza == null) {
            return true;
        }
        return false;
    }
}
