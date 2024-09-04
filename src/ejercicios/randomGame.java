package ejercicios;

import java.util.Random;

public class randomGame {
    public static void main(String[] args) {
        Random random = new Random();
        int point = 0;
        int lives = 10;

        while (lives > 0 && point < 20) {
            int num = random.nextInt(10+1);

            if (num % 2 == 0) {
                point++;
                System.out.println("Tienes " + point + "puntos");
            } else {
                lives--;
                System.out.println("Te quedan " + lives + " Vidas");
            }
        }
    }
}
