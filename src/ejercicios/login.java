package ejercicios;

import java.util.Scanner;

public class login {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String userName = "Breyner";
        String userMail = "breyner@gmail.com";
        int key = 12345;
        int phone = 54321;

        System.out.println("Ingrese el correo");
        String emailInput = scanner.nextLine();
        System.out.println("Ingrese la contraseña");
        int inputKey = scanner.nextInt();
        System.out.println("Ingrese su teléfono");
        int inputPhone = scanner.nextInt();

        if (userMail.equals(emailInput) || phone == inputPhone && key == inputKey) {
            System.out.println("Bienvenido " + userName);
        } else {
            System.out.println("valide sus credenciales");
        }

    }
}
