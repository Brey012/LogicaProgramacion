package ejercicios;

import java.util.Scanner;

public class ordenado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int temp;
        while (num1 < num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println("mayor a menor " + num1 + " - " + num2);
    }
}
