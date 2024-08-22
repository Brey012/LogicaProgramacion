package notas;

public class variables {
    public static void main(String[] args) {

        int idCliente; //Declarar una variable
        String nombreCliente = "Breyner"; // Declarar e inicializar una variable

        int num1, num2;
        num1 = 1;
        num2 = 2;

        byte  edad = 127;
        short mesasda =  32767;
        short ahorroMesada = mesasda;

        // Casteo de variables
        int ahorro = (int) ahorroMesada;
        ahorro = ahorroMesada + mesasda;
        System.out.println(ahorro);

        //Parsing de variables
        //Promedio de edad
        int edad1 =  19;
        String edad2 = "22";

        int edadConv2 = Integer.parseInt(edad2);

        float promedio = (edad1 + edadConv2)/2;
        System.out.println(promedio);

        String promedioConv =  promedio + "";
        System.out.println(promedioConv);

        // Tipos de datos

        float nota = 2.4f;
        long bigNumber  = 12312312432l;

    }
}
