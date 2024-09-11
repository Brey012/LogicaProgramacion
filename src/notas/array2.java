package notas;

import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String [] name = new String[5];
        int i = 0;
        while (i < name.length) {
            System.out.println("Ingrese nombre " + (i+1));
            name[i] = scanner.nextLine();
            i++;
        }

        for (int j = 0; j < name.length; j++) {
            System.out.println("Nombres ingresados " + name[j]);
        }
    }
}
