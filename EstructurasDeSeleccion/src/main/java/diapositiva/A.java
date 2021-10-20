package diapositiva;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        // Saber si un número es positivo, negativo, o cero

        System.out.println("Dame un número entero: ");
        Scanner entradaTeclado = new Scanner(System.in);
        int numero = entradaTeclado.nextInt();

        if (numero < 0) {
            System.out.println("Es negativo");
        } else if (numero > 0) {

            System.out.println("Es positivo");
        } else {
            System.out.println("Es cero");
        }
    }

}
