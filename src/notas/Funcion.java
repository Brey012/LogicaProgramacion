package notas;
import java.util.Scanner;

public class Funcion {

    static Scanner scanner = new Scanner(System.in);
    static String[] prendas = new String[5];
    static boolean[] resultados = new boolean[5];

    public static void main(String[] args) {
        int opcion;
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- Menú de Opciones ---");
            System.out.println("1. Guardar prendas");
            System.out.println("2. Listar prendas");
            System.out.println("3. Indicar preferencias");
            System.out.println("4. Mostrar resultados");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    guardarPrendas(prendas);
                    break;
                case 2:
                    listarPrendas(prendas);
                    break;
                case 3:
                    resultados = preferencias(prendas);
                    break;
                case 4:
                    mostrarResultados(prendas, resultados);
                    break;
                case 5:
                    salir = true;
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
    }

    public static void guardarPrendas(String[] prendas) {
        int numPrenda = 0;
        while (numPrenda < prendas.length) {
            System.out.println("Ingrese la prenda " + (numPrenda + 1));
            prendas[numPrenda] = scanner.nextLine();
            numPrenda++;
        }
        System.out.println("Prendas guardadas exitosamente.");
    }

    public static void listarPrendas(String[] prendas) {
        System.out.println("\nLista de prendas:");
        for (int i = 0; i < prendas.length; i++) {
            if (prendas[i] != null && !prendas[i].isEmpty()) {
                System.out.println((i + 1) + ". " + prendas[i]);
            }
        }
    }

    public static boolean[] preferencias(String[] prendas) {
        boolean[] meGusta = new boolean[prendas.length];
        for (int i = 0; i < prendas.length; i++) {
            if (prendas[i] != null && !prendas[i].isEmpty()) {
                System.out.println("Prenda: " + prendas[i]);
                System.out.println("¿Te gusta la prenda? (si/no)");

                String respuesta = scanner.nextLine().toLowerCase();

                meGusta[i] = respuesta.equals("si");
            }
        }
        System.out.println("Preferencias guardadas exitosamente.");
        return meGusta;
    }

    public static void mostrarResultados(String[] prendas, boolean[] resultados) {
        System.out.println("\nCalificación de prendas:");
        for (int i = 0; i < prendas.length; i++) {
            if (prendas[i] != null && !prendas[i].isEmpty()) {
                System.out.println(prendas[i] + ": " + (resultados[i] ? "Me gusta" : "No me gusta"));
            }
        }
    }
}