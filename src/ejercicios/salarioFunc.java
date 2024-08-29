package ejercicios;

import java.util.Scanner;

public class salarioFunc {
    private static String userName;
    private static String password;
    private static double salary;
    private static double netSalary;
    private static String category;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\nMenú");
            System.out.println("1. Crear usuario y contraseña");
            System.out.println("2. Ingresar con usuario y contraseña");
            System.out.println("3. Ingresar salario y calcular descuentos");
            System.out.println("4. Validar categoría de salario");
            System.out.println("5. Imprimir datos del usuario");
            System.out.println("6. Salir");
            System.out.println("Seleccione una opción");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    createUser(scanner);
                    break;
                case 2:
                    login(scanner);
                    break;
                case 3:
                    calculateSalary(scanner);
                    break;
                case 4:
                    validateSalaryCategory();
                    break;
                case 5:
                    printUserData();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (option != 6);
        scanner.close();
    }
    private static void createUser(Scanner scanner) {
        System.out.println("Ingrese un nombre de usuario: ");
        userName = scanner.next();
        System.out.println("Ingrese una contraseña: ");
        password = scanner.next();
        System.out.println("Usuario creado exitosamente");
    }

    private static void login(Scanner scanner) {
        if (userName == null ||password == null ) {
            System.out.println("Primero debe crear un usuario.");
            return;
        }

        System.out.println("Ingrese su nombre de usuario: ");
        String inputUsername = scanner.next();
        System.out.println("Ingrese su contraseña: ");
        String inputPassword = scanner.next();

        if (inputUsername.equals(userName) && inputPassword.equals(password)) {
            System.out.println("Inicio de sesión exitoso.");
        } else {
            System.out.println("Usuario o contraseña incorrectos");
        }
    }

    private static void calculateSalary(Scanner scanner) {
        System.out.println("Ingrese el salario: ");
        salary = scanner.nextDouble();

        double pension =  salary * 0.04;
        double health = salary * 0.04;
        double transportAllowance = 117000;

        netSalary = salary - pension - health + transportAllowance;

        System.out.println("Salario bruto: " + salary);
        System.out.println("Descuento de pensión (4%): " + pension);
        System.out.println("Descuento de salud (4%): " + health);
        System.out.println("Auxilio de transporte: " + transportAllowance);
        System.out.println("Salario neto: " + netSalary);
    }

    private static void validateSalaryCategory() {
        if (netSalary == 0) {
            System.out.println("Primero debe calcular el salario.");
            return;
        }

        double minimumWage = 1160000;

        if (netSalary <= minimumWage) {
            category = "A";
        } else if (netSalary <= 2*minimumWage) {
            category = "B";
        } else {
            category = "C";
        }

        System.out.println("Categoría de salario: " + category);
    }

    private static void printUserData() {
        if (userName == null) {
            System.out.println("No hay datos de usuario disponibles.");
            return;
        }

        System.out.println("Datos del usuario:");
        System.out.println("Usuario: " + userName);
        System.out.println("Salario bruto: " + salary);
        System.out.println("Salario neto: " + netSalary);
        System.out.println("Categoría de salario: " + category);
    }
}
