import java.util.Scanner;

public class MinutosDia {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        System.out.print("Informe que horas são em valor redondo ");
        int horas = Teclado.nextInt();

        System.out.print("Informe os minutos tambem em valor redondo ");
        int minutos = Teclado.nextInt();

        int minutosPassou = (horas * 60) + minutos;

        System.out.println("passaram " + minutosPassou + " minutos desde o começo do dia");

        Teclado.close();
    }
}
