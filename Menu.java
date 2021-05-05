import java.util.Scanner;

public class Menu {

    static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bienvenido!...");
        int numero=sc.nextInt();
        sc.nextLine();
        while (numero!=0){
            switch (numero) {
                case 1:
                metodo1();
                break;

                case 2:
                metodo2();
                break;

                case 3:
                metodo3();
                break;
            }
    public static void metodo1() {

    }

    public static void metodo2() {
        
    }

    public static String metodo3() {
    }
}