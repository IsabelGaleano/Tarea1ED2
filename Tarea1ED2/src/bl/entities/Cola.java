package bl.entities;

public class Cola {

    private Nodo frente;
    private Nodo _final;
    int longitud;

    public Cola() {
        this.frente = null;
        this._final = null;
        longitud = 0;
    }

    public Nodo getFrente() {
        return frente;
    }

    public void setFrente(Nodo frente) {
        this.frente = frente;
    }

    public Nodo get_final() {
        return _final;
    }

    public void set_final(Nodo _final) {
        this._final = _final;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }


    public boolean esVacia() {
        if (this.frente == null && this._final == null) {
            return true;
        }
        return false;
    }


    public void insertar(int elemento) {

        Nodo nuevo = new Nodo(elemento);
        if (this.esVacia()) {
            frente = nuevo;
            _final = nuevo;
        } else {
            _final.setSiguiente(nuevo);
            _final = nuevo;
        }

        longitud++;

    }


    public boolean eliminar() {
        Nodo aux;
        if (!(this.esVacia())) {
            aux = this.frente;
            this.frente = this.frente.getSiguiente();
            aux = null;
            longitud--;
            return true;

        }
        return false;
    }


     public void mostrarCola() {
        Nodo aux;
        aux = frente;

        while (aux != null)
        {

            System.out.println(aux.getDato());
            aux = aux.getSiguiente();
        }
    }


}
