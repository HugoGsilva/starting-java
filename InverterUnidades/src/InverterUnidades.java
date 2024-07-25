import java.util.Scanner;

public class InverterUnidades {
    public static void main(String[] args) {

        Scanner Teclado = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Digite o primeiro número: ");
        num1 = Teclado.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = Teclado.nextInt();

        System.out.print("Digite o terceiro número: ");
        num3 = Teclado.nextInt();

        System.out.println("Seus números em ordem inversa são: " + num3 + ", " + num2 + ", " + num1);


        Teclado.close();
    }
}
