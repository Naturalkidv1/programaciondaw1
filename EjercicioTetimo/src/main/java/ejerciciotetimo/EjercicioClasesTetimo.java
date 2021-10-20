package ejerciciotetimo;

import java.util.Scanner;

public class EjercicioClasesTetimo {

    /*
    El Banco Tetimo quiere desarrollar un programa de estudio de viabilidad hipotecaria para potenciales clientes de la entidad. 
    Este programa debe decidir si un cliente es "apto" para ser timado por el banco o por el contrario, 
    según los datos aportados por el cliente, el banco lo rechaza y lo declara "no apto" por no ser rentable.
    + Según los gerentes de Tetimo, cuando un cliente aterriza en su web para solicitar una hipoteca, 
    lo primero que deben saber es su edad y su sueldo bruto mensual. 
    Hay que tener en cuenta que no se conceden préstamos a menores de edad y a mayores de 65 años.
    + Si la edad es válida, el programa solicita al cliente la cantidad total de pasta que necesita para su hipoteca. 
    Si esa cantidad que se solicita supera la cantidad resultante de multiplicar el sueldo bruto anual del cliente por el factor multiplicativo, 
    entonces la hipoteca se rechaza. En Tetimo el factor multiplicativo es de 5,85. 
    Por ejemplo, si un cliente gana al año 30000 pavos, no podría pedir más de 30000*5,85.
    + Si el cliente ha pasado el filtro de edad y el filtro de la cantidad a solicitar, 
    el programa le solicita el número de años en los que quiere devolver la hipoteca. 
    Tetimo no concede hipotecas a más de 30 años y a menos de cinco. 
    Además, si la edad de la persona sumada a los años a devolver el préstamo supera los 75 años, el préstamo se rechaza.
     */
    public static void main(String[] args) {

        // empezaremos declarando la variable scanner y pidiendo los datos al usuario; a su vez, tambíen declararemos e inicializaremos las constantes 
        final int EDAD_MIN = 18;
        final int EDAD_MAX = 65;
        final double FACTOR_MULTIPLICATIVO = 5.85;
        final int DURACION_MAX_PRESTAMO = 30;
        final int DURACION_MIN_PRESTAMO = 5;
        final int LIMITE_EDAD_MAS_DURACION = 75;
        final int MESES_ANIO = 12;

        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Bienvenido a Tetimo INC, indique su edad.");
        int edadCliente = entradaTeclado.nextInt();

        // procederemos con los if 
        if (edadCliente >= EDAD_MIN && edadCliente <= EDAD_MAX) {
            System.out.println("Edad correcta. Por favor, indique su sueldo bruto mensual.");
            int sueldoBrutoMensualCliente = entradaTeclado.nextInt();
            // anotación: ahora toca declarar e inicializar la variable limitePrestamo para más adelante
            double limitePrestramo = (sueldoBrutoMensualCliente * MESES_ANIO) * FACTOR_MULTIPLICATIVO;
            System.out.println("Ahora, introduzca la cantidad de dinero que desea.");
            double prestamo = entradaTeclado.nextDouble();
            if (limitePrestramo >= prestamo) {
                System.out.println("Cantidad válida. Continue. ¿En cuantos años le gustaría devolver el préstamo?");
                int duracionPrestamo = entradaTeclado.nextInt();
                if (duracionPrestamo >= DURACION_MIN_PRESTAMO && duracionPrestamo <= DURACION_MAX_PRESTAMO) {
                    System.out.println("Bien. Realizaremos una última comprobación. Espere");
                    if ((edadCliente + duracionPrestamo) <= LIMITE_EDAD_MAS_DURACION) {
                        System.out.println("Todo correcto. Usted es apto. Esperamos que devuelva cada uno de los céntimos prestados :). ");
                    } else {
                        System.out.println("Lo sentimos. No es apto para el préstamo.");
                    }
                } else {
                    System.out.println("Cliente no apto. Introduzca una duración para devolver el préstamo válida.");
                }
            } else {
                System.out.println("Cliente no apto. Prestamo máximo excedido.");
            }
        } else {
            System.out.println("Cliente no apto. Introduzca una edad válida.");
        }
    }

}
