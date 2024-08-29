package ejercicios;

import java.util.Scanner;

public class Salario {
    static String newUser;
    static int newPassword;
    static double salarioNeto;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Presione 1 para inicializar");
        int init = scanner.nextInt();

        System.out.println("1. Crear un usuario" + " 2. Inicias sesión" +
                "3 calcular el salario" +
                "4. Validar su categoria de sal" +
                "5. Ver datos del usuario" +
                "Salir");


        while (init != 0) {
            int opc = scanner.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Cree un usuario");
                    newUser = scanner.nextLine();
                    System.out.println("Cree una contraseña numerica");
                    newPassword =  scanner.nextInt();
                    break;
                case 2:
                    System.out.println("Ingrese el usuario");
                    String user = scanner.nextLine();
                    System.out.println("Ingrese la contraseña");
                    int password = scanner.nextInt();

                    if (newUser.equals(user) && newPassword == password) {
                        System.out.println("Bienvenido " + user);
                    } else {
                        System.out.println("Datos invalidos vuelva a ingresar");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese su salario");
                    double salario = scanner.nextDouble();

//                    Descuentos
                    double descPension = salario * 0.04;
                    double descSalud = salario * 0.04;

                    double auxTrans = 117.000;

                    salarioNeto = salario - descPension - descSalud + auxTrans;

                    System.out.println("Su salario Neto es de: " + salarioNeto);
                    break;
                case 4:
                    if (salarioNeto <= 1160000) {
                        System.out.println("Su categoria es A");
                    } else if (salarioNeto <= 2000000) {
                        System.out.println("Su categoria es B");
                    } else if (salarioNeto >= 3000000) {
                        System.out.println("Su categoria es C");
                    }
                    break;
                case 5:
                    System.out.println("Nombre: " + newUser + "Salario neto: " + salarioNeto);
                    break;
                case 6:
                    System.out.println("Salir");
                    init = 0;
                    break;
            }
        }
    }
}
