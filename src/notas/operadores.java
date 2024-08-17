package notas;

public class operadores {
    public static void main(String[] args) {
        // Operadores aritmeticos

        int data = (100/4) * 25 + (4+2);
        System.out.println(data);

        // Operadores de comparación

        int clave = 1234;
        int claveUser =  1234;


        if (clave == claveUser) {
            System.out.println("Se permite ingreso");
        }

        float estatura = 1.76f;
        float estIngresada = 1.77f;

        if (estatura > estIngresada) {
            System.out.println("cobrar 5000");
        } else {
            System.out.println("Se permite ingreso");
        }

        // Operadores logicos
    }
}