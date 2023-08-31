import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int X = scanner.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int Y = scanner.nextInt();

        int suma = 0;
        suma = suma + X;
        X = X + (Y*Y);
        suma = suma + (X / Y);

        System.out.println("El valor de la suma " + suma); 

        scanner.close();
    }
}
// Quise añadir un poco de dificultad al problema haciendo que el valor de las variables entrasen por medio del teclado
