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

            if(opcion == 1){

                int decimo;
                int importe;

                System.out.print("Introduce numero de decimo: ");
                decimo = sc.nextInt();

                System.out.print("Introduce importe jugado: ");
                importe = sc.nextInt();

                if(decimo == gordo){
                    System.out.println("Primer premio!! Has ganado " + (importe * 20000) + "€");
                }
                else if(decimo == segundo){
                    System.out.println("Segundo premio!! Has ganado " + (importe * 6250) + "€");
                }
                else if(decimo == tercero){
                    System.out.println("Tercer premio!! Has ganado " + (importe * 2500) + "€");
                }
                else{
                    System.out.println("Lo siento no has tenido suerte");
                }

                System.out.printf("Decimo %05d\n", decimo);
            }



        }

    }
}