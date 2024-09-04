package ejercicios;

import java.util.Scanner;

public class arrayEdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] ages = new int[5];
        int age;
        int suma = 0;
        int contador = 0;

        while (contador < ages.length) {
            System.out.println("Ingrese la edad " + (contador+1));
            age = scanner.nextInt();
            ages[contador] = age;
            suma += age;
            contador++;
        }

        System.out.println("Edades: ");
        for (int j = 0; j < 5; j++) {
            System.out.println("edad " + (j+1) + " :" + ages[j]);
        }

        double promedio = (double) suma / ages.length;
        System.out.println("Promedio de edades: " + promedio);
    }
}
