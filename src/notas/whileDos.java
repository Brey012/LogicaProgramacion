package notas;

public class whileDos {
    public static void main(String[] args) {
        int i = 0;
//        while (i <= 10) {
//            System.out.println("Hola" + i);
//            i++;
//        }

//        while (i <= 100){
//            if (i % 2 == 0) {
//                System.out.println(i + " Es par");
//            } else {
//                System.out.println(i + " Es impar");
//            }
//            i ++;
//        }

        int suma = 0;

        while (i < 10) {
            suma += i;
            System.out.println(suma);
            i++;
        }

    }
}
