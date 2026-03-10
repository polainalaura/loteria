import java.util.Random;

public class PolainaLauraEjer1 {

    public static void main(String[] args) {

        Random r = new Random();

        // Generación de premios
        int gordo = r.nextInt(99999) + 1;
        int segundo = r.nextInt(99999) + 1;
        int tercero = r.nextInt(99999) + 1;

        // Mostrar premios del sorteo
        System.out.println("----- SORTEO DE LOTERIA -----");

        System.out.printf("Primer premio: %05d\n", gordo);
        System.out.printf("Segundo premio: %05d\n", segundo);
        System.out.printf("Tercer premio: %05d\n", tercero);

    }
}