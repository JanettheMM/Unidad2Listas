
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("----- SinglyLinkedList-----");

        SinglyLinkedList lista = new SinglyLinkedList();

        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);
        lista.insertar(40);
        lista.insertar(50);
        lista.mostrar();

        System.out.println("---Busqueda de valores---");
        lista.buscar(10);
        lista.buscar(40);
        lista.buscar(60);

        System.out.println("---Eliminar valores---");
        System.out.println("---> Bye cabeza");
        lista.eliminar(10);
        lista.mostrar(); // vuelve a imprimir todos

        System.out.println("---> Bye pies");
        lista.eliminar(50);
        lista.mostrar();

        System.out.println("---> Bye centro");
        lista.eliminar(30);
        lista.mostrar();
    }
}
