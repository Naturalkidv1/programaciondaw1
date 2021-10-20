package diapositiva;

import java.util.Scanner;

public class B {

    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Dime un carácter.");
        // leemos un carácter o una palabra
        String caracter = entradaTeclado.next();
        System.out.println("String introducido: " + caracter);
        // con el método charAt(posicion) obtenemos un char del string que llama
        //al método 
        char charCaracter = caracter.charAt(0);
        System.out.println("Char en posición 0: " + charCaracter);

        // usamos un int para guardar el unicdoe de ese char
        int unicodeChar = (int) charCaracter;
        if (charCaracter >= 48 && charCaracter <= 57) {
            System.out.println("Es un digito");
            // El número no esta entre 48 y 57
        } else if (charCaracter >= 65 && charCaracter <= 90) {

            System.out.println("Es una Mayúscula");
        } else if (charCaracter >= 97 && charCaracter <= 122){
            System.out.println("Es una minúscula");
        } else {
            System.out.println("Es otro caracter");
        }}
     
            
      
    }
