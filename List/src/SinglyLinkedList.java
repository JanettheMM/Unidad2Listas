public class SinglyLinkedList {
    // Millán Millán Janetthe 4D
    Nodo cabeza;

    public SinglyLinkedList() {
        this.cabeza = null;
    }

    public void insertar(Integer dato) {
        // Crear un nodo
        Nodo nuevoNodo = new Nodo(dato);
        // Verificar si la lista esta vacia
        if (cabeza == null) {
            // coloca el nodo nuevo como la cabeza
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza; // Iniciamos desde el primero (la tete)
            // Recorremos todos los nodos hasta encontrar un null en las referencias
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
    }

    public void mostrar() {
        Nodo temp = cabeza; // Comenzamos desde la tete (el primero)
        // Mientras temp no sea nulo
        while (temp != null) {
            System.out.print(temp.dato + "->");
            temp = temp.siguiente;
        }
        System.out.println("null");
    }

    public boolean buscar(Integer valor) {
        if (cabeza == null) {
            System.out.println("La lista esta vacia");
            return false;
        } else {
            Nodo temp = cabeza; // Empieza desde la tete (el primero)
            // Mientras temp no sea nulo
            while (temp != null) {
                if (temp.dato.equals(valor)) {// si existe
                    System.out.println("El nodo si existe y es: " + temp.dato);
                    return true;
                }
                temp = temp.siguiente;
            }
            // si no existe
            System.out.println("Dentro de la lista no existe el: " + valor);
            return false;
        }
    }

    public void eliminar(Integer valor) {
        if (cabeza == null) {
            System.out.println("No se puede eliminar, porque la lista está vacía");
        }
        if (cabeza.dato == valor) { // le ponemos al siguiente
            cabeza = cabeza.siguiente;
            return;
        }
        Nodo temp = cabeza;
        Nodo anterior = null;
        while (temp != null && temp.dato != valor) { // recorrer hasta encontrar el nodo con el valor
            anterior = temp; // guardamos el nodo corriente en la variable anterior
            temp = temp.siguiente; // pasamos al siguiente
        }
        if (temp == null) {
            System.out.println("No se encontró el valor");
            return;
        }
        
        anterior.siguiente = temp.siguiente; // eliminamos el nodo que estamos buscando
        System.out.println("Se eliminó correctamente: " + valor);
    }

}