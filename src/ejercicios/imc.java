package ejercicios;

import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double imc;

        System.out.println("Ingrese su peso");
        double peso = scanner.nextDouble();

        System.out.println("Ingrese su altura");
        double altura = scanner.nextDouble();

        imc = altura*altura/peso;

        if (imc < 18.5) {
            System.out.println("Su peso es bajo");
        } else if ( imc >= 18.6) {
            System.out.println("Peso normal");
        } else if ( imc <= 25.9) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30){
            System.out.println("obesidad");
        }
    }
}
