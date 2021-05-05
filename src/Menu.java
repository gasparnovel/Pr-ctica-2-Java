package src;

import java.util.ArrayList;
import java.util.List;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    static final Scanner sc = new Scanner(System.in);
    static final Scanner sc2 = new Scanner(System.in);

    public static void main(String[] args) {

        int numero = 0;

        do {
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

            numero = Integer.parseInt(sc.nextLine());

            while (numero != 0) {
                switch (numero) {
                    case 1:
                        arrayEnOrden();
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
        } while (numero != 0);

        sc.close();

        System.out.println("¡Finalizada la ejecución del menú!");

    }

    public static void arrayEnOrden() {
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
        // sc.close();

        // System.out.println("¡Finalizada la ejecución del menú!");
    }

    public static void arrayEnOrdenInverso() {

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

    public static void mediaPosNegCeros() {
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

    public static void cantidadCaracteres() {

        System.out.println("\n");
        System.out.println("\n" + "Introduzca un texto " + "\n");
        String texto = sc.nextLine();

        int textoSinEspacios = texto.replace(" ", "").length();
        System.out.println("\n" + "Cantidad de carácteres en el texto sin contar espacios: " + textoSinEspacios);

    }

    public static void textoEnOrdenInverso() {

        System.out.println("\n");
        System.out.println("\n" + "Introduzca un texto " + "\n");
        String texto = sc.nextLine();
        StringBuilder textoInvertido = new StringBuilder(texto);
        System.out.println("\n" + "Texto en orden inverso: " + textoInvertido.reverse());
    }

    public static void textoSinEspacios() {

        System.out.println("\n");
        System.out.println("\n" + "Introduzca un texto " + "\n");
        String texto = sc.nextLine();
        System.out.println("\n" + "Texto sin espacios: " + texto.replace(" ", ""));

    }

    public static void cadenasConcatenadas() {

        System.out.println("\n");
        System.out.println("\n" + "Introduzca un textos " + "\n");
        String texto1 = sc.nextLine();
        System.out.println("\n" + "Introduzca otro texto " + "\n");
        String texto2 = sc2.nextLine();

        System.out.println("\n" + "Textos concatenados: " + texto1 + texto2);

    }

    public static void sustitucionDeVocales() {

        System.out.println("\n" + "Introduzca un texto " + "\n");
        String texto = sc.nextLine();
        System.out.println("\n" + "Introduzca una vocal :");
        String vocal = sc2.nextLine();
        String textoSustituido = texto.replaceAll("[aeiouAEIOU]", vocal);
        System.out.println("\n" + "Cadena sustituida por vocales: " + textoSustituido);

    }

    public static void codigoAscii() {

        System.out.println("\n" + "Introduzca un texto " + "\n");
        String texto = sc.nextLine();
        char[] ascii = texto.toCharArray();

        for (int i = 0; i < ascii.length; i++) {

            System.out.println("\n" + "El ascii de la letra " + ascii[i] + " es " + "[" + (int) texto.charAt(i) + "]");

        }

    }
}
