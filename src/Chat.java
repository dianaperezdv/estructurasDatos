import java.util.LinkedList;
import java.util.Stack;
import java.util.Scanner;
public class Chat {

    protected Stack<String> usuarios;

    public Chat(){
        this.usuarios = new Stack<>();
    }
    public void conectarUsuario(String nombre){
        this.usuarios.push(nombre);
    }
    public void desconectarUsuario(){
        if (!usuarios.isEmpty()){
            String recienBorrado = this.usuarios.pop();
            System.out.print("se ha eliminado el usuarioo" + recienBorrado);
        }
        else{
            System.out.print("No hay usuarios conectados");}
    }
}
class main{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Chat chat = new Chat();
        boolean bandera = true;
        while(bandera){
            System.out.println("1. Conectar un usuario");
            System.out.println("2. Desconectar usuario");
            System.out.println("3. Salir");
            System.out.println("Ingrese una opcion: ");
            int opcionEscogida = scanner.nextInt();
            switch (opcionEscogida) {
                case 1:
                    System.out.println("Ingrese el nombre de usuario: ");
                    String nombreUsuario = scanner.next();
                    chat.conectarUsuario(nombreUsuario);
                    break;
                case 2:
                    chat.desconectarUsuario();
                    break;
                case 3:
                    System.out.print("Saliendo del programa...");
                    bandera = false;
            }}}}
