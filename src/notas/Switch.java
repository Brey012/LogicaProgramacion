package notas;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Crear un usuario" + " 2. Inicias sesión" +
                "3 calcular el salario" +
                "4. Validar su categoria de sal" +
                "5. Ver datos del usuario");

        int opc = scanner.nextInt();

        switch (opc){
            case 1:
                System.out.println("Crear usuario");
                break;
            case 2:
                System.out.println("Login");
                break;
            case 3:
                System.out.println("Calcular salario");
                break;
            case 4:
                System.out.println("validar categoria");
                break;
            case 5:
                System.out.println("Ver datos");
            default:
                System.out.println("Seleccione una opcion valida");
        }
    }
}
