import java.util.Scanner;

public class CalculoCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio del circulo: ");
        double radio = scanner.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);
        double circunferencia = 2 * Math.PI * radio;

        System.out.println("El area del circulo es: " + area);
        System.out.println("La longitud de la circunferencia es: " + circunferencia);

        scanner.close();
    }
}
