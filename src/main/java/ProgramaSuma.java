import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramaSuma {

    public static void main(String[] args) {


        int primerNumero=0;

        int segundoNumero=0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce el primero de dos números:");

        try {
            primerNumero = Integer.parseInt(scan.nextLine());

        } catch (InputMismatchException e) {

            System.out.println("El tipo de dato introducido debe ser un número");
        }

        System.out.println("Introduce el segundo de dos números:");

        try {
            segundoNumero = Integer.parseInt(scan.nextLine());


        } catch (InputMismatchException e) {

            System.out.println("El tipo de dato introducido debe ser un número");
        }

        System.out.println("La suma es: "+(primerNumero+segundoNumero));
    }
}
