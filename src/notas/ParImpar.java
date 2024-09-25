package notas;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner=  new Scanner(System.in);

        int numero;
        System.out.print("Ingrese un numero (0 para salir)");

        numero = scanner.nextInt();
        if (numero != 0) {
            if (numero % 2==0) {
                System.out.println(numero + "Es par.");
            } else {
                System.out.println(numero + " Es impar.");
            }
        } while (numero != 0) {
            System.out.println("Programa terminado");
        }
    }
}
