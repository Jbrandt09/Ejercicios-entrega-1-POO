import java.util.Scanner;

public class actividad_edades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la edad de Juan: ");
        int eju = scanner.nextInt();

        int eal = (2 * eju) / 3;
        int ean = (4 * eju) / 3;
        int emama = eju + eal + ean;

        System.out.println("Edad de Juan: " + eju);
        System.out.println("Edad de Alberto: " + eal);
        System.out.println("Edad de Ana: " + ean);
        System.out.println("Edad de la mama: " + emama);

        scanner.close();
    }
}
