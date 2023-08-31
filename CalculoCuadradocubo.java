import java.util.Scanner;

public class CalculoCuadradocubo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        double numero = scanner.nextDouble();

        double cuadrado = numero * numero;
        double cubo = Math.pow(numero, 3);

        System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
        System.out.println("El cubo de " + numero + " es: " + cubo);

        scanner.close();
    }
}
