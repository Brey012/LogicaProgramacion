package ejercicios;

// id, nombre, apellido, genero, edad, telefono, estatura, correo, contraseña, estado.

import java.util.Scanner;

public class formulario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String name = scanner.nextLine();

        System.out.println("Ingrese su apellido: ");
        String lastName = scanner.nextLine();

        System.out.println("Ingrese su genero");
        String genero = scanner.nextLine();

        System.out.println("Ingrese su telefono");
        long number = scanner.nextLong();

        System.out.println("Ingrese su estatura: ");
        double estatura = scanner.nextDouble();

        System.out.println("Ingrese su correo: ");
        String gmail = scanner.nextLine();

        System.out.println("Ingrese su contraseña en numeros: ");
        long contra = scanner.nextLong();

        boolean estado = true;

        System.out.println("Formulario" + "\n" +
                "Nombre: " + name + " " + lastName + "\n" +
                "Genero: " + genero + "\n" +
                "Telefono: " + number + "\n" +
                "Estatura: " + estatura + "\n" +
                "Correo: " + gmail + "\n" +
                "Contraseña: " + contra  + "\n"

        );

    }
}
