public class calcSal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double horasTrabajadas = 48;
        double tarifaHora = 5000;
        double retencionFuentePorcentaje = 12.5;

        double salarioBruto = horasTrabajadas * tarifaHora;
        double retencionFuente = (retencionFuentePorcentaje / 100) * salarioBruto;
        double salarioNeto = salarioBruto - retencionFuente;

        System.out.println("Salario Bruto: $" + salarioBruto);
        System.out.println("Retencion en la Fuente: $" + retencionFuente);
        System.out.println("Salario Neto: $" + salarioNeto);

        scanner.close();
    }
}
