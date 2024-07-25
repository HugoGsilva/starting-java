import java.util.Scanner;

public class ProgGeometrica {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        System.out.print("Digite a razão da PG: ");
        int razao = Teclado.nextInt();

        System.out.print("Digite o valor do primeiro termo da PG: ");
        int primeiro = Teclado.nextInt();
        int n = 5;
        double potencia = 1;
        for (int i = 1; i < n; i++) {
            potencia *= razao;
        }
        double quinto = primeiro * potencia;
        System.out.printf("O 5º termo da PG é:" + quinto);
        Teclado.close();
    }
}

