package bl.entities;

public class Pila {
    private Nodo tope;
    private int longitud;

    public Pila() {
        this.tope = null;
        this.longitud = 0;
    }

    public Nodo getTope() {
        return tope;
    }

    public void setTope(Nodo tope) {
        this.tope = tope;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }


    public boolean esVacia() {
        if (tope == null) {
            return true;
        }
        return false;
    }


    public boolean push(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (nuevo == null) {
            return false;
        } else {
            if (this.esVacia()) {
                tope = nuevo;
            } else {
                nuevo.setSiguiente(tope);
                tope = nuevo;
            }

            longitud++;
            return true;
        }
    }


    public boolean pop() {
        Nodo aux;
        if (!(this.esVacia())){
            aux = tope;
            tope = tope.getSiguiente();
            longitud--;
            aux = null;
            return true;
        } else{
            return false;
        }
    }


    public void mostrarPila() {
        Nodo aux;
        aux = tope;
        while (aux != null)
        {

            System.out.println(aux.getDato());
            aux = aux.getSiguiente();
        }
    }


}



