package estructurasdeseleccionejt3;

import java.util.Scanner;

public class Ej01 {

    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.print("escanear edad:");
        int edad = entradaTeclado.nextInt();
        if (edad >= 18) {

            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }
        System.out.print("mostrar la edad: ");
        System.out.println(edad);

    }
}
