import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
public class Cliente {
                /*El problema consiste en diseñar un programa que simule la
            atención de clientes en una tienda. El programa debe permitir
            agregar clientes a una cola y atender a los clientes uno por uno.
            Cada cliente en la cola tiene un número de ticket que se le
            asigna cuando se agrega a la cola. Cuando un cliente es
            atendido, su número de ticket se muestra en la pantalla y se
            elimina de la cola.
            El programa debe mostrar un menú de opciones que permita al
            usuario agregar clientes a la cola, atender a los clientes en
            orden de llegada y salir del programa.
            Puedes utilizar un bucle while y ayudarte del switch para crear
            las opciones de ingreso de datos.*/

    protected Queue<Integer> tickets;
    protected int numeroCliente=0;
    protected int numeroTicket;

    public Cliente(int numeroticket){
        this.numeroTicket = numeroticket;
    }
    public void agregarCliente(String cliente) {
        this.numeroCliente ++;
        this.tickets.add(numeroCliente);
        System.out.print("El numero de cliente es" + numeroCliente);
    }

    public void atenderClientes(){
        while (!tickets.isEmpty()){
            for (int t: tickets) {

            }
        }

    }

    public class Tienda {
        protected Cliente cliente;
        public void agregarCliente(Cliente cliente){
            this.cliente = cliente;

        }
        public boolean hayClientesEnCola(){
            return true;
        }
    }
}
public class Main{
public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Tienda tienda = new Tienda();
        boolean OpenTienda = true;
        while (OpenTienda){
            System.out.println("1. Agregar cliente a la cola");
            System.out.println("2. Atender cliente");
            System.out.println("3. Salir de la tienda");
            System.out.println("Ingrese una opcion: ");
            int opcionEscogida = scanner.nextInt();

            switch (opcionEscogida){
                case 1:
                    System.out.println("Ingrese el numero del cliente: ");
                    int numeroTicket = scanner.nextInt();
                    Cliente cliente =new Cliente(numeroTicket);
                    tienda.agregarCliente(cliente);
                    break;
                case 2:
                    if (tienda.hayClientesEnCola()){
                        Cliente clienteAtendido1 = tienda.atenderCliente();
                        System.out.println("Cliente atendido. Numero de ticket:" + clienteAtendido1 ); }
                default: System.out.print("La opción seleccionada no está disponible");

                    }
            } } }

