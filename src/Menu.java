package src;

import java.util.ArrayList;
import java.util.List;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    static final Scanner sc = new Scanner(System.in); // Creamos dos variables estaticas para usarlas durante el ejercicio
    static final Scanner sc2 = new Scanner(System.in);

    public static void main(String[] args) {
        
        
        int numero = 0; // instanciamos una variable

        do { // creamos un bucle do-while para que haga siempre lo mismo mientras no haya una condicion especial
            System.out.println("Bienvenido al menú!");
            System.out.println("\n" + "Qué desea realizar?" + "\n");
            System.out.println("1. Array de 5 números en orden");
            System.out.println("2. Array de 5 números en orden inverso");
            System.out.println("3. Media de 5 números positivos, media de negativos y cuenta de 0s");
            System.out.println("4. Cantidad de carácteres en un texto sin contar espacios");
            System.out.println("5. Texto en orden invertido");
            System.out.println("6. Texto sin espacios");
            System.out.println("7. Cadenas concatenadas");
            System.out.println("8. Sustitucion de vocales en una cadena");
            System.out.println("9. Código ASCII de los carácteres de una cadena");
            System.out.println("0. Salir del programa");
            System.out.print("\n" + "Introduzca una opción válida a realizar: ");

            numero = Integer.parseInt(sc.nextLine()); // creamos una variable que almacenara lo que teclehemos por pantalla convirtiendolo en interger

            while (numero != 0) { // creamos un bucle while que durara mientras el numero almacenado sea diferente a 0
                switch (numero) { // // creamos un switch para los diferente casos de ejercicios
                    case 1:
                        arrayEnOrden(); // assignamos metodos a los casos
                        break;

                    case 2:
                        arrayEnOrdenInverso();
                        break;

                    case 3:
                        mediaPosNegCeros();
                        break;
                    case 4:
                        cantidadCaracteres();
                        break;
                    case 5:
                        textoEnOrdenInverso();
                        break;

                    case 6:
                        textoSinEspacios();
                        break;
                    case 7:
                        cadenasConcatenadas();
                        break;

                    case 8:
                        sustitucionDeVocales();
                        break;

                    case 9:
                        codigoAscii();
                        break;
                }
            }
        } while (numero != 0); // es el final del do-while que se ejecuta mientras sea difernte a 0

        sc.close(); // cierra la conexion

        System.out.println("¡Finalizada la ejecución del menú!"); // muestra el mensaje por pantalla

    }


    public static void arrayEnOrden() { // creamos un array, le insertamos 5 numeros y nos los muestra en orden
        int arr[] = new int[5];
        System.out.println("\n" + "Introduzca 5 números: " + "\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("posicion[" + i + "]= numero ");
            arr[i] = sc.nextInt();
        }
        System.out.println("\n" + "Los números en orden son: ");
        int posicion = 0;
        while (posicion <= 4) {
            System.out.print("[" + arr[posicion] + "]");
            posicion++;
        }
    }

    public static void arrayEnOrdenInverso() {  // creamos un array, le insertamos 5 numeros y nos los muestra en orden inverso

        int arr[] = new int[5];
        System.out.println("\n" + "Introduzca 5 números: " + "\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("posicion[" + i + "]= numero ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Los números en orden inverso son: ");
        int posicion = 4;
        while (posicion >= 0) {
            System.out.print("[" + arr[posicion] + "]");
            posicion--;
        }
    }

    public static void mediaPosNegCeros() {  // creamos un array, le insertamos 5 numeros y nos los muestra las medias de numeros positivos, negativos y cantidad de 0
        int pos = 0;
        int neg = 0; // contadores de los números positivos y negativos
        int ceros = 0;
        int arr[] = new int[5]; // array que contendrá los números leídos por teclado
        double sumaPos = 0;
        double sumaNeg = 0; // acumuladores para las sumas de positivos y negativos

        // lectura de datos y llenar el array
        System.out.println("\n" + "Introduzca 5 números: "+ "\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("numero= ");
            arr[i] = sc.nextInt();
        }

        // recorrer el array para sumar por separado los números positivos
        // y los negativos
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) { // sumar positivos
                sumaPos += arr[i];
                pos++;
            } else if (arr[i] < 0) { // sumar negativos
                sumaNeg += arr[i];
                neg++;
            } else {
                ceros++;
            }
        }

        // Calcular y mostrar las medias
        if (pos != 0) {
            System.out.println(("\n" + "Media de los valores positivos: " + sumaPos / pos));
        } else {
            System.out.println(("\n" + "No ha introducido numeros positivos"));
        }
        if (neg != 0) {
            System.out.println(("\n" + "Media de los valores negativos: " + sumaNeg / neg));
        } else {
            System.out.println(("\n" + "No ha introducido numeros negativos"));
        }
        if (ceros >= 0) {
            System.out.println(("\n" + "Cantidad exacta de ceros: " + ceros));
        } else {
            System.out.println(("\n" + "No hay ceros"));
        }
    }

    public static void cantidadCaracteres() {  // muestra la cantidad de caracteres en enteros

        System.out.println("\n");
        System.out.println("\n" + "Introduzca un texto " + "\n");
        String texto = sc.nextLine();

        int textoSinEspacios = texto.replace(" ", "").length();
        System.out.println("\n" + "Cantidad de carácteres en el texto sin contar espacios: " + textoSinEspacios);

    }

    public static void textoEnOrdenInverso() {  // muestra un texto en orden inverso

        System.out.println("\n");
        System.out.println("\n" + "Introduzca un texto " + "\n");
        String texto = sc.nextLine();
        StringBuilder textoInvertido = new StringBuilder(texto);
        System.out.println("\n" + "Texto en orden inverso: " + textoInvertido.reverse());
    }

    public static void textoSinEspacios() { // muestra el texto sin espacios en blanco

        System.out.println("\n");
        System.out.println("\n" + "Introduzca un texto " + "\n");
        String texto = sc.nextLine();
        System.out.println("\n" + "Texto sin espacios: " + texto.replace(" ", ""));

    }

    public static void cadenasConcatenadas() { // insertamos dos cadenas por teclado y nos las muestra unidas

        System.out.println("\n");
        System.out.println("\n" + "Introduzca un textos " + "\n");
        String texto1 = sc.nextLine();
        System.out.println("\n" + "Introduzca otro texto " + "\n");
        String texto2 = sc2.nextLine();

        System.out.println("\n" + "Textos concatenados: " + texto1 + texto2);

    }

    public static void sustitucionDeVocales() {  // pedimos un texto y una vocal y nos sustituye las vocales del texto por la vocal introducida

        System.out.println("\n" + "Introduzca un texto " + "\n");
        String texto = sc.nextLine();
        System.out.println("\n" + "Introduzca una vocal :");
        String vocal = sc2.nextLine();
        String textoSustituido = texto.replaceAll("[aeiouAEIOU]", vocal);
        System.out.println("\n" + "Cadena sustituida por vocales: " + textoSustituido);

    }

    public static void codigoAscii() {  // nos muestra los caracteres del texto introducidos por su valor en codigo ascii

        System.out.println("\n" + "Introduzca un texto " + "\n");
        String texto = sc.nextLine();
        char[] ascii = texto.toCharArray();

        for (int i = 0; i < ascii.length; i++) {

            System.out.println("\n" + "El ascii de la letra " + ascii[i] + " es " + "[" + (int) texto.charAt(i) + "]");

        }

    }
}
