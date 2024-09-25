package notas;

import java.util.Scanner;

public class FuncionReturn {

    static Scanner scanner = new Scanner(System.in);
    static double descPension;
    static double descSalud;
    static double auxTrans = 160000;
    static double salarioNeto;
    static double salario;

    static double smlv = 1300000;
    static final float DESCUENTOSALUD = 0.04f;
    static final float DESCUENTOPENSION = 0.04f;


//    main
    public static void main(String[] args) {
        System.out.println("Ingrese salario");
        salario = scanner.nextDouble();
         salarioNeto =  calcularSalarioNeto(salario,DESCUENTOPENSION,DESCUENTOSALUD,auxTrans);
        System.out.println("Salario neto es: " + salarioNeto);
    }

   public static double calcularSalud(double salario, float descSalud) {

        return salario * descSalud;
   }

   public static double calcularPension(double salario, float descPension) {

        return  salario * descPension;
   }
   public static double calcularSalarioNeto(double salario, float descPension, float descSalud, double auxTrans) {
       if (salario <= 2*smlv) {
           return salario - calcularPension(salario, descPension) - calcularSalud(salario, descSalud) + auxTrans;
       } else {
           return salario - calcularPension(salario, descPension) - calcularSalud(salario, descSalud);
       }
   }
}
