package ui;

import bl.logic.GestorCola;
import bl.logic.GestorListaSimple;
import bl.logic.GestorPila;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Controller {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    GestorListaSimple gestorListaSimple = new GestorListaSimple();
    GestorPila gestorPila = new GestorPila();
    GestorCola gestorCola = new GestorCola();

    public Controller() {
    }

    public void start() throws IOException {
        boolean salir = false;
        do {
            imprimirMenu();
            int opcion = leerOpcion();
            salir = ejecutarOpcion(opcion);

        } while (!salir);


    }

    public void imprimirMenu() {
        System.out.println("======= MENU DEL PROGRAMA ======= ");
        System.out.println("");
        System.out.println("======= LISTA SIMPLE ======= ");
        System.out.println("1. Agregar al inicio de la LISTA");
        System.out.println("2. Agregar a la LISTA ordenadamente");
        System.out.println("3. Buscar en la LISTA");
        System.out.println("4. Eliminar elemento de la LISTA");
        System.out.println("5. Visualizar LISTA");
        System.out.println("");
        System.out.println("======= PILA ======= ");
        System.out.println("6. Realizar push a la PILA");
        System.out.println("7. Realizar pop a la PILA");
        System.out.println("8. Mostrar PILA");
        System.out.println("");
        System.out.println("======= COLA ======= ");
        System.out.println("9. Agregar elemento a la COLA");
        System.out.println("10. Eliminar elemento de la COLA");
        System.out.println("11. Mostrar COLA");
        System.out.println("");
        System.out.println("12. SALIR DEL PROGRAMA");

    }

    public int leerOpcion() throws IOException {
        System.out.println("Ingrese la opcion que desea: ");
        return Integer.parseInt(in.readLine());
    }

    public boolean ejecutarOpcion(int opcion) throws IOException {
        boolean salir = false;
        int dato = 0;
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el numero que desea agregar a la LISTA: ");
                dato = Integer.parseInt(in.readLine());
                gestorListaSimple.agregar(dato);
                break;
            case 2:
                System.out.println("Ingrese el numero que desea agregar a la LISTA: ");
                dato = Integer.parseInt(in.readLine());
                gestorListaSimple.agregarOrdenado(dato);
                break;

            case 3:
                System.out.println("Ingrese el numero que desea buscar: ");
                dato = Integer.parseInt(in.readLine());
                gestorListaSimple.buscar(dato);
                break;

            case 4:
                System.out.println("Ingrese el numero que desea eliminar: ");
                dato = Integer.parseInt(in.readLine());
                gestorListaSimple.borrarElemento(dato);
                break;

            case 5:
                gestorListaSimple.mostrarLista();
                break;

            case 6:
                System.out.println("Ingrese el numero que desea agregar a la PILA: ");
                dato = Integer.parseInt(in.readLine());
                gestorPila.push(dato);
                break;

            case 7:
                gestorPila.pop();
                break;

            case 8:
                gestorPila.mostrarPila();
                break;

            case 9:
                System.out.println("Ingrese el numero que desea agregar a la COLA: ");
                dato = Integer.parseInt(in.readLine());
                gestorCola.insertar(dato);
                break;

            case 10:
                gestorCola.eliminarCola();
                break;

            case 11:
                gestorCola.visualizarCola();
                break;

            case 12:
                salir = true;
                break;
        }

        return salir;
    }
}
