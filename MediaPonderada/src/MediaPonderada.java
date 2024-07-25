import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

       
        System.out.print("Digite o primeiro número: ");
        double num1 = teclado.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = teclado.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double num3 = teclado.nextDouble();
        System.out.print("Digite o quarto número: ");
        double num4 = teclado.nextDouble();

        int peso1 = 1;
        int peso2 = 2;
        int peso3 = 3;
        int peso4 = 4;

        double somaPesos = peso1 + peso2 + peso3 + peso4;
        double mediaPonderada = (num1 * peso1 + num2 * peso2 + num3 * peso3 + num4 * peso4) / somaPesos;

        System.out.printf("A média ponderada é: %.2f%n", mediaPonderada);
        teclado.close();
    }
}
