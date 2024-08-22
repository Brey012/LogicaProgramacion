package notas;

import java.util.Scanner;

public class condicionales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance =  170000;

        System.out.println("Ingrese el valor de la compra: ");
        double purchase = scanner.nextDouble();

        System.out.println("Ingrese el numero de cuotas");
        double cuotas = scanner.nextInt();

        if (purchase > 0 && purchase <= balance) {
            System.out.println("compra exitosa");
            balance -= purchase;
            double valorCuota = cuotas/purchase;
            System.out.println("El valor de su cuota es de " + valorCuota + " Por " + cuotas + " meses");
            System.out.println("su nuevo saldo es: " + balance);
        } else if (purchase <= 0)
            System.out.println("compre algo");
        else {
            System.out.println("Saldo insuficiente");
        }
    }
}
