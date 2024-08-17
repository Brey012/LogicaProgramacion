package ejercicios;

import java.util.Scanner;

public class estaura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese edad");
        int edad = scanner.nextInt();

        System.out.println("Ingrese altura");
        double estatura = scanner.nextDouble();

        int edadPro = 18;
        double estatutaPro = 1.50;

        if (edad > edadPro && estatura > estatutaPro) {
            System.out.println("Puede ingresar");
        } else {
            System.out.println("No puede ingresar");
        }
    }
}
