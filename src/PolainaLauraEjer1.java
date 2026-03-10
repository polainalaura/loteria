import java.util.Scanner;
import java.util.Random;

public class PolainaLauraEjer1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        // premios
        int gordo = r.nextInt(99999) + 1;
        int segundo = r.nextInt(99999) + 1;
        int tercero = r.nextInt(99999) + 1;

        int opcion = 3;

        while(opcion != 0){

            System.out.println("----- LOTERIA -----");
            System.out.println("1. Comprobar decimo");
            System.out.println("0. Salir");

            opcion = sc.nextInt();





        }

    }
}