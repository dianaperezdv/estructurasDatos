public class LinkedList {

    class Node {
        int value;
        Node next = null;
        Node(int value){
            this.value = value;
        }
    }

    protected Node head = null;
    protected Node tail = null;

    public void agregarValorAlInicio(int valor){
        Node nuevoNodo = new Node(valor);
        nuevoNodo.next = head;
        head = nuevoNodo;
        if(nuevoNodo.next == null) {
            tail = nuevoNodo;
        }
    }

    public void agregarFinal(int valor) {
        Node nuevoNodo = new Node(valor);
        if(tail == null){
            head = nuevoNodo;
        } else {
            tail.next = nuevoNodo;
            tail = nuevoNodo;
        }
    }

    public void agregarPorPosicion(int posicion, int valor){
        if(posicion < 0) {
            throw new IndexOutOfBoundsException();
        } else if(posicion == 0){
            agregarValorAlInicio(valor);
        } else{
            Node nuevoNodo = new Node(valor);
            Node actual = head;
            for (int i = 0; i < posicion-1; i++) {
                if(actual == null) {
                    throw new IndexOutOfBoundsException();
                }
                actual = actual.next;
            }
            if(actual.next == null){
                agregarFinal(valor);
            } else {
                nuevoNodo.next = actual.next;
                actual.next = nuevoNodo;
            }
        }

    }

    public Node obtenerPorPosicion (int posicion){
        if(posicion < 0) {
            throw new IndexOutOfBoundsException();
        }
        else{
            Node actual = head;
            for (int i = 0; i < posicion-1; i++) {
                if(actual == null) {
                    throw new IndexOutOfBoundsException();
                }
                else if(actual.next == null){
                    throw new IndexOutOfBoundsException();
                }
                actual = actual.next;

            }
            return actual.next ;
        }
    }

    public void eliminarPorPosicion(int posicion){
        if(posicion < 0) {
            throw new IndexOutOfBoundsException();
        }
        else if (posicion == 0){
            head = head.next;
        }
        else{
            Node actual = head;
            Node previo = head;
            for (int i = 0; i < posicion; i++) {
                if(previo == null ){
                    throw new IndexOutOfBoundsException();
                }
                previo = actual;
                actual = actual.next;
            }
            previo.next = actual.next;

        }}

    public static Node deleteN(Node head, int position) {
        Node temp = head; // Create a temporary node pointing to the head of the linked list
        Node prev = head; // Create a previous node pointing to the head of the linked list

        for (int i = 0; i < position; i++) { // Loop through the linked list to find the node at the given position
            if (i == 0 && position == 1) { // If the node to delete is the head
                head = head.next; // Set the next node as the new head
            } else {
                if (i == position - 1 && temp != null) { // If the node to delete is found
                    prev.next = temp.next; // Set the next node of the previous node to be the next node of the current node
                } else {
                    prev = temp; // Move the previous node to the current node

                    // If the previous node is null, the position was greater than the number of nodes in the list
                    if (prev == null)
                        break;
                    temp = temp.next; // Move the temporary node to the next node
                }
            }
        }
        return head; // Return the new head of the linked list
    }}
