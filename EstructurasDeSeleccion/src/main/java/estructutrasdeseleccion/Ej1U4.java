package estructutrasdeseleccion;

import java.util.Scanner;

public class Ej1U4 {

    public static void main(String[] args) {
        
        System.out.println("Escanear edad: ");
        //System.out.println("Introduce tu edad: ");
        Scanner entradaTeclado = new Scanner(System.in);

        int edad = entradaTeclado.nextInt();
        if (edad >= 18) {
            System.out.println("Es mayor de edad.");

        } else {
            System.out.println("No es mayor de edad.");
        }

        System.out.println("Mostrar la edad: ");
        System.out.println(edad);
    }

}
