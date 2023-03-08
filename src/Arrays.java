import java.util.Scanner;

public class Arrays {
        public static void main(String[] args) {

        Scanner sn = new Scanner(System.in); // importar el paquete donde esta la clase

        System.out.println("inserte una longitud"); //inserte la longitus de array
        int longitud = sn.nextInt(); //asignamos la variable longitud al scanner

        int numeros[]= new int[longitud]; // poder poner cualquier variable cualquier longitud

        int num;

        for (int i= 0; i<numeros.length;i++){  // bucle para recorrer todo

            System.out.println("Inserte un numero en la posicion "+ i); // para saber en que posicion estoy
            // validacion con el do while si nos inserta un numero entre 0 y 10 vuelve y nos pide otro si no no
            do{

                num= sn.nextInt(); //vuelve a pedir el valor

                if (!(num>=0 && num<=10)){ // condicion igual es lo que va hacer que esto sea un tru
                    System.out.println("Error solo numeros del 0 al 10 "+ //en caso de que hayya error
                            "Inserte un numero en la posicion"+ i);
                }


            }while(!(num>=0 && num<=10)); //controlamos valores invalidos
            // la convertimos en verdadero para que cuando alla un valor invalido mo
            // vuelva a repetir el ciclo do
            // el do while vuelve al do si es verdadero

            numeros[i] = num; // asignacion

        }

        System.out.println("Estos son los numeros elegidos por el usuario");
        for (int i=0; i<numeros.length;i++){
            System.out.println(numeros[i]);
        }

    }
    //     OTRO EJERCICIO

    public class Main {
        public static void main(String[] args) {

            //cuenta el numero de repeticiones de un numero especifco

            int vector [] = new int [10];
            Scanner scanner = new Scanner(System.in);

            // Llenar vector con numeros
            for (int i = 0; i < 10; i++){
                System.out.println("Digita los numeros");
                vector [i] = scanner.nextInt();
            }

            int count = 0;
            // encontrar simulitudes entre los numeros
            for (int i = 0; i<10 ; i++){
                if (vector [i] == 5){
                    count = count +1;
                }
            }
            System.out.println("la cantidad de 5 en la lista de numeros es : "+"  "+ count);

            // OTRO EJERCICIO   // PARA LLENAR UNA MATRIZ PRIMERO VA LA FILA Y DESPUES LA COLUMNA

            // ENUNCIADO : EN UNA TABLA DE 4 FILAS Y 4 COLUMNAS SE GUARDAN LAS NOTAS DE 4 ALUMNOS
            //CADA FILA CORRESPONDE A LAS NOTAS Y AL PROMEDIO DE CADA ALUMNO, SE NECESITA UN PROGRAMA
            // QUE PERMITA A UN PROFESOR CARGAR EN LAS 3 POSICIONES (columnas) DE CADA FILA LAS NOTAS
            //DEL ALUMNO Y QUE EN LA ULTIMA COLUMNA SE CALCULEN LOS PROMEDIOS UNA VEZ REALIZADOS LOS
            //CALCULOS SE DESEA MOSTRAR LAS 3 NOTAS DE CADA ALUMNO Y EL PROMEDIO CORRESPONDIENTE
            // RECORRIENDO LA MATRIZ

        }
            public class Main {
                // SUMA LAS NOTAS DE UN ALUMNO Y SACA SU PROMEDIO
                public static void main(String[] args) {

                    Double matriz [][] = new Double[4][4]; // DECLARAR LA MATRIZ tipo double
                    Scanner scanner = new Scanner(System.in); // cargar notas por teclado
                    Double suma = 0.0; //todabia no despues la usas



                    //carga las notas y va sumando las notas y tiene promedio
                    for (int f = 0; f<4; f++ ){
                        for (int c =0 ; c<3 ; c++){ // se limita solo hasta la 3 posicion para luego
                            // con otro for promediar las notas
                            System.out.println("Ingrese el alumno numero "+ f); // numero del alimno con fila
                            matriz[f][c] = scanner.nextDouble();// en nuestra matriz en la posicion fila columna en la que estemos actualmente 0-0 0.1 0.2 sea
                            // igual a el numero que ingreses por teclado fila tanto columna tanto asi se va llenando en la interseccion
                            // estamos recorriendo las notas de cada alumno
                            suma = suma + matriz [f][c];  // podemos ir sumando de una vez las notas sin utilizar otro for declaro la variable suma
                            // va sumando cada nota consecutivamente
                        }
                        matriz[f][3] = suma /3; // en la fila que corresponda en la columna 3 va ser igual a la suma dividiido 3 ya estoy guardando el promedio de una vez
                        suma = 0.0;  // la variable suma la volvemos a 0 para que no se sumen todas las notas en cada vuelta
                    }

                    // para recorrer y imprimir
                    for (int f = 0; f<4; f++ ) {  // vamos a mostrar el id del alumno recorriendo con for
                        System.out.println("las notas del alumno numero : " + f + " "+ "son:");

                        for (int c = 0; c < 3; c++) {  //
                            System.out.println("nota numero" + c + " " + matriz[f][c]);//nos muestra solo las notas
                        }
                        System.out.println("el promedio de las notas es; " + matriz[f][3]); // muestra el promedio
                    }

                }




            }

























    } }
