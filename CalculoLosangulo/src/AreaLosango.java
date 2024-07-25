import java.util.Scanner;

public class AreaLosango {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        System.out.print("Digite o valor da diagonal maior (D): ");
        double diagonalMaior = Teclado.nextDouble();

        System.out.print("Digite o valor da diagonal menor (d): ");
        double diagonalMenor = Teclado.nextDouble();

        double area = (diagonalMaior * diagonalMenor) / 2;

        System.out.printf("A área do losango é:" + area);
        
        Teclado.close();
    }
}
