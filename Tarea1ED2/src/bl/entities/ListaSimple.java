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


    public void agregarOrdenado(int dato) {
        Nodo temp = new Nodo(dato);
        if (cabeza == null || temp.getDato() < cabeza.getDato())
        {
            temp.setSiguiente(cabeza);
            cabeza = temp;
        }
        else
        {
            Nodo aux = cabeza;
            while ( aux.getSiguiente() != null && aux.getSiguiente().getDato() < temp.getDato())
            {
                aux = aux.getSiguiente();

            }
            if (aux.getSiguiente() != null)
            {
                temp.setSiguiente(aux.getSiguiente());
            }

            aux.setSiguiente(temp);
        }

        cantidadElementos++;
    }


     public void buscar(int dato) {
        Nodo temp = cabeza;
        int cont = 1;
        int cont2 = 0;

        while (temp != null)
        {
            if (temp.getDato() == dato){
                System.out.println("El numero se enuentra en la posicion: " + cont);
                cont2++;
            }
            temp = temp.getSiguiente();

            cont++;
        }

        if (cont2 == 0)
        {
            System.out.println("No existe el numero en la lista");

        }

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
